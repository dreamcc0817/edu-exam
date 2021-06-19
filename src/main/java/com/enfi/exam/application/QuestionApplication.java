package com.enfi.exam.application;

import com.enfi.exam.application.assembler.QuestionBuilder;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.entity.service.QuestionService;
import com.enfi.exam.application.dto.QuestionDto;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public QuestionApplication(QuestionService questionService) {
        this.questionService = questionService;
    }


    /**
     * 保存问题
     *
     * @param questionDto 问题DTO
     * @return 保存实体
     */
    public Question save(QuestionDto questionDto) {
        Question question = QuestionBuilder.INSTANCE.dtoToQuestion(questionDto);
        question.setScore(questionDto.getTotalScore());
        question.setCorrect(questionDto.getCorrect());
        return questionService.save(question);
    }

    /**
     * 根据ID查询问题
     *
     * @param id id
     * @return 问题DTO
     */
    @SneakyThrows
    public QuestionDto queryById(Long id) {
        Question question = questionService.queryById(id);

        if(Optional.ofNullable(question).isPresent()){
            QuestionDto questionDto = QuestionBuilder.INSTANCE.entityToQuestionDto(question);
            questionDto.setCorrect(question.getCorrect());
            questionDto.setTotalScore(question.getScore());
            return questionDto;
        }else {
            throw new Exception();
        }
    }

}
