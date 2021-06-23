package com.enfi.exam.application;

import com.enfi.exam.application.assembler.QuestionBuilder;
import com.enfi.exam.application.dto.QuestionDto;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.entity.dp.QuestionId;
import com.enfi.exam.domain.question.service.QuestionService;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

/**
 * @author cloud-cc
 * @ClassName QuestionApplication
 * @Description Question 应用服务
 * @date 2021/5/25 14:17
 * @Version 1.0
 */
@Service
public class QuestionApplication {

    private QuestionService questionService;

    private QuestionBuilder questionBuilder;

    public QuestionApplication(QuestionService questionService, QuestionBuilder questionBuilder) {
        this.questionService = questionService;
        this.questionBuilder = questionBuilder;
    }

    /**
     * 保存问题
     *
     * @param questionDto 问题DTO
     * @return 保存实体
     */
    public Question save(QuestionDto questionDto) {
        Question question = questionBuilder.dtoToQuestion(questionDto);
        return questionService.save(question);
    }

    /**
     * 根据ID查询问题
     *
     * @param questionId id
     * @return 问题DTO
     */
    @SneakyThrows
    public QuestionDto queryById(Long questionId) {
        Question question = questionService.queryById(new QuestionId(questionId));
        QuestionDto questionDto = questionBuilder.questionToDto(question);
        return questionDto;
    }

}
