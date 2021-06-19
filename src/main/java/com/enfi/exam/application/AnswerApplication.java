package com.enfi.exam.application;

import com.enfi.exam.application.assembler.AnswerBuilder;
import com.enfi.exam.domain.answer.entity.dp.TrainingProgramId;
import com.enfi.exam.domain.answer.service.AnswerService;
import com.enfi.exam.domain.exampaper.entity.dp.ExamPaperId;
import com.enfi.exam.application.dto.AnswerDto;
import com.enfi.exam.domain.answer.entity.ExamPaperAnswer;
import org.springframework.stereotype.Service;

/**
 * @author cloud-cc
 * @ClassName AnswerApplication
 * @Description 答卷
 * @date 2021/6/17 15:06
 * @Version 1.0
 */
@Service
public class AnswerApplication {

    private AnswerBuilder answerBuilder;

    private AnswerService answerService;

    public AnswerApplication(AnswerBuilder answerBuilder, AnswerService answerService) {
        this.answerBuilder = answerBuilder;
        this.answerService = answerService;
    }

    /**
     * 根据培训计划生成答卷信息
     *
     * @param trainingProgramId 培训计划ID
     * @param examPaperId       试卷ID
     */
    public void createExamPaper(TrainingProgramId trainingProgramId, ExamPaperId examPaperId) {
        //TODO
    }



    /**
     * 保存答卷
     *
     * @param answerDto 答卷内容
     */
    public void saveExamPaperAnswer(AnswerDto answerDto) {
        ExamPaperAnswer examPaperAnswer = answerBuilder.DtoToExamPaperAnswer(answerDto);
        answerService.saveAnswer(examPaperAnswer);
    }

    /**
     * 提交答卷
     *
     * @param answerDto 答卷内容
     */
    public void submitAnswer(AnswerDto answerDto) {
        ExamPaperAnswer examPaperAnswer = answerBuilder.DtoToExamPaperAnswer(answerDto);
        answerService.submitAnswer(examPaperAnswer);
    }
}
