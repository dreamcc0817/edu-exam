package com.enfi.exam.domain.answer.repository;

import com.enfi.exam.domain.answer.entity.ExamPaperAnswer;

/**
 * @author cloud-cc
 * @ClassName AnswerRepository
 * @Description 答卷资源类
 * @date 2021/6/17 17:30
 * @Version 1.0
 */
public interface AnswerRepository {

    /**
     * 保存答卷
     *
     * @param examPaperAnswer 答卷
     */
    void save(ExamPaperAnswer examPaperAnswer);
}
