package com.enfi.exam.application.assembler;

import com.enfi.exam.application.dto.AnswerDto;
import com.enfi.exam.domain.answer.entity.ExamPaperAnswer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * @author cloud-cc
 * @ClassName AnswerBuilder
 * @Description AnswerBuilder转换类
 * @date 2021/6/17 15:14
 * @Version 1.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AnswerBuilder {

    /**
     * dto 转 entity
     *
     * @param answerDto dto
     * @return entity
     */
    ExamPaperAnswer DtoToExamPaperAnswer(AnswerDto answerDto);
}
