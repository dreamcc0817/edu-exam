package com.enfi.exam.infrastructure.service;

import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.repository.QuestionRepository;
import com.enfi.exam.application.assembler.QuestionBuilder;
import com.enfi.exam.domain.question.entity.dp.QuestionInfo;
import com.enfi.exam.infrastructure.orm.mybatis.dao.QuestionDao;
import com.enfi.exam.infrastructure.orm.mybatis.po.QuestionPo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

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

    private QuestionDao questionDAO;

    public QuestionRepositoryImpl(QuestionDao questionDAO) {
        this.questionDAO = questionDAO;
    }

    @CachePut(key = "'question:' + #question.getQuestionId()")
    @Override
    public Question save(Question question) {
        QuestionPo questionPo = new QuestionPo();
        questionPo.setQuestionType(question.getQuestionType().getCode());
        questionPo.setSubjectType(question.getSubjectType().getType());
        questionPo.setScore(Optional.ofNullable(question.getScore()).isPresent() ?
                Optional.ofNullable(question.getScore().getGrossScore()).orElse(0) : 0);
        questionPo.setDifficult(question.getDifficult().getCode());
        questionPo.setCorrect(question.getCorrect().getCorrect());
        questionPo.setInfoTextContent(JSON.toJSONString(question.getQuestionInfoList()));
        if (StringUtils.isEmpty(question.getQuestionId())) {
            question.setQuestionId(IdUtil.getSnowflake(1,1).nextId());
            questionPo.setId(question.getQuestionId());
            questionDAO.insert(questionPo);
        } else {
            questionDAO.updateById(questionPo);
        }

        return question;
    }

    @Cacheable(key = "'question:'+#questionId")
    @Override
    public Question queryById(Long questionId) {
        QuestionPo questionPo = questionDAO.selectById(questionId);
        Question question = QuestionBuilder.INSTANCE.poToQuestion(questionPo);
        question.setQuestionInfoList(JSON.parseArray(questionPo.getInfoTextContent(), QuestionInfo.class));
        return question;
    }
}
