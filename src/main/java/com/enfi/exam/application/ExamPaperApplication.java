package com.enfi.exam.application;

import com.enfi.exam.domain.exampaper.service.ExamPaperService;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.application.assembler.ExamPaperBuilder;
import com.enfi.exam.application.assembler.QuestionBuilder;
import com.enfi.exam.application.dto.ExamPaperDto;
import com.enfi.exam.application.dto.QuestionDto;
import com.enfi.exam.domain.exampaper.entity.ExamPaper;
import com.enfi.exam.domain.question.entity.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cloud-cc
 * @ClassName ExamPaperApplication
 * @Description 试卷
 * @date 2021/6/7 16:28
 * @Version 1.0
 */
@Service
public class ExamPaperApplication {

    private final ExamPaperService examPaperService;

    private final ExamPaperBuilder examPaperBuilder;

    private final QuestionService questionService;

    private final QuestionBuilder questionBuilder;

    public ExamPaperApplication(ExamPaperService examPaperService, ExamPaperBuilder examPaperBuilder,
                                QuestionService questionService, QuestionBuilder questionBuilder) {
        this.examPaperService = examPaperService;
        this.examPaperBuilder = examPaperBuilder;
        this.questionService = questionService;
        this.questionBuilder = questionBuilder;
    }

    /**
     * 保存试卷
     *
     * @param examPaperDto 试卷DTO
     * @return 试卷实体
     */
    public ExamPaper save(ExamPaperDto examPaperDto) {
        ExamPaper examPaper = examPaperBuilder.examPaperDtoToExamPaper(examPaperDto);

        List<QuestionDto> questionDtoList = examPaperDto.getQuestionDtoList();
        List<Question> fullQuestionDto = questionDtoList.stream()
                .map(entity -> questionService.queryById(entity.getQuestionId())).collect(Collectors.toList());

        examPaper.setQuestionList(fullQuestionDto);
        return examPaperService.save(examPaper);
    }
}
