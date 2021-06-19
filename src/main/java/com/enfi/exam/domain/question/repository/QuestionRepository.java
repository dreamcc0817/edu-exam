package com.enfi.exam.domain.question.repository;

import com.enfi.exam.domain.question.entity.Question;

/**
 * @author cloud-cc
 * @ClassName Question 仓储接口
 * @Description
 * @date 2021/5/24 10:18
 * @Version 1.0
 */
public interface QuestionRepository {

    /**
     * 保存问题
     *
     * @param question 问题内容
     * @return 问题内容
     */
    Question save(Question question);


    /**
     * 通过ID查询问题
     *
     * @param questionId 问题ID
     * @return 问题
     */
    Question queryById(Long questionId);
}
