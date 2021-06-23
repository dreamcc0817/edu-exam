package com.enfi.exam.infrastructure.service;

import com.alibaba.fastjson.JSON;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.entity.dp.Correct;
import com.enfi.exam.domain.question.entity.dp.QuestionId;
import com.enfi.exam.domain.question.entity.dp.QuestionInfo;
import com.enfi.exam.domain.question.entity.dp.QuestionType;
import com.enfi.exam.domain.question.repository.QuestionRepository;
import com.enfi.exam.infrastructure.orm.mybatis.assembler.QuestionAssembler;
import com.enfi.exam.infrastructure.orm.mybatis.dao.QuestionDao;
import com.enfi.exam.infrastructure.orm.mybatis.po.QuestionPo;
import com.enfi.exam.interfaces.common.util.Const;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author cloud-cc
 * @ClassName QuestionRepositoryImpl
 * @Description question repository orm 实现类
 * @date 2021/5/25 15:39
 * @Version 1.0
 */
@CacheConfig(cacheNames = "question")
@Service
public class QuestionRepositoryImpl implements QuestionRepository {

    private final QuestionDao questionDAO;
    private final QuestionAssembler questionAssembler;

    public QuestionRepositoryImpl(QuestionDao questionDAO, QuestionAssembler questionAssembler) {
        this.questionDAO = questionDAO;
        this.questionAssembler = questionAssembler;
    }

    @CachePut(key = "'question:' + #question.getQuestionId()")
    @Override
    public Question save(Question question) {
        QuestionPo questionPo;
        if (StringUtils.isEmpty(question.getQuestionId())) {
            question.setQuestionId(new QuestionId());
            questionPo = questionAssembler.questionToPo(question);
            questionPo.setId(question.getQuestionId().getId());
            questionDAO.insert(questionPo);
        } else {
            questionPo = questionAssembler.questionToPo(question);
            questionDAO.updateById(questionPo);
        }
        return question;
    }


    @Cacheable(key = "'question:' + #questionId")
    @Override
    public Question queryById(QuestionId questionId) {
        QuestionPo questionPo = questionDAO.selectById(questionId.getId());
        Question question = questionAssembler.poToQuestion(questionPo);
        if (!QuestionType.MULTIPLE_CHOICE.equals(question.getQuestionType())
                || !QuestionType.GAP_FILLING.equals(question.getQuestionType())) {
            question.setCorrect(new Correct(questionPo.getCorrect()));
        } else {
            question.setCorrect(new Correct(Arrays.asList(questionPo.getCorrect().split(Const.SPLIT_SYMBOL))));
        }
        question.setQuestionInfoList(JSON.parseArray(questionPo.getInfoTextContent(), QuestionInfo.class));
        return question;
    }
}
