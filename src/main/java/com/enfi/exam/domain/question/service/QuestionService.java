package com.enfi.exam.domain.question.service;

import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.entity.dp.QuestionId;
import com.enfi.exam.domain.question.repository.QuestionRepository;
import org.springframework.stereotype.Service;

/**
 * @author cloud-cc
 * @ClassName QuestionService
 * @Description Question 领域服务
 * @date 2021/5/25 15:21
 * @Version 1.0
 */
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    /**
     * 保存问题
     *
     * @param question 问题
     * @return 问题
     */
    public Question save(Question question) {
        questionRepository.save(question);
        return question;
    }

    /**
     * 查询问题
     *
     * @param questionId 问题ID
     * @return 问题
     */
    public Question queryById(QuestionId questionId) {
        return questionRepository.queryById(questionId);
    }
}
