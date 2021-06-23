package com.enfi.exam.domain.answer.service;

import com.enfi.exam.domain.answer.entity.ExamPaperAnswer;
import com.enfi.exam.domain.answer.repository.AnswerRepository;
import org.springframework.stereotype.Service;

/**
 * @author cloud-cc
 * @ClassName AnswerService
 * @Description 答卷
 * @date 2021/6/16 11:22
 * @Version 1.0
 */
@Service
public class AnswerService {

    private AnswerService answerService;

    private AnswerRepository answerRepository;

    /**
     * 保存答卷
     *
     * @param examPaperAnswer 答卷内容
     */
    public void saveAnswer(ExamPaperAnswer examPaperAnswer) {
        examPaperAnswer.saveExamPaperAnswer(examPaperAnswer);
        answerRepository.save(examPaperAnswer);
    }

    /**
     * 提交答卷
     *
     * @param examPaperAnswer 答卷
     */
    public void submitAnswer(ExamPaperAnswer examPaperAnswer) {
        examPaperAnswer.submitExamPaperAnswer();
        answerRepository.save(examPaperAnswer);
    }
}
