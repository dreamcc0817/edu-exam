package com.enfi.exam.application.assembler;

import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.infrastructure.orm.mybatis.po.QuestionPo;
import com.enfi.exam.application.dto.QuestionDto;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @author cloud-cc
 * @ClassName QuestionMapper
 * @Description 转换
 * @date 2021/5/25 14:41
 * @Version 1.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionBuilder {

    QuestionBuilder INSTANCE = Mappers.getMapper(QuestionBuilder.class);

    /**
     * DTO转entity
     *
     * @param questionDto dto
     * @return entity
     */
    Question dtoToQuestion(QuestionDto questionDto);

    /**
     * po转entity
     *
     * @param questionPo po
     * @return entity
     */
    @Mappings({
            @Mapping(source = "id",target = "questionId")
    })
    Question poToQuestion(QuestionPo questionPo);

    /**
     * entity转DTO
     *
     * @param question entity
     * @return dto
     */
    @Mappings({
            @Mapping(target = "correct", ignore = true)
    })
    QuestionDto entityToQuestionDto(Question question);
}
