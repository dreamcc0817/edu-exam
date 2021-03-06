package com.enfi.exam.application.assembler;

import com.enfi.exam.application.dto.QuestionDto;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.entity.dp.Analyze;
import com.enfi.exam.domain.question.entity.dp.Correct;
import com.enfi.exam.domain.question.entity.dp.QuestionId;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

/**
 * @author cloud-cc
 * @ClassName QuestionMapper
 * @Description 转换
 * @date 2021/5/25 14:41
 * @Version 1.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionBuilder {

    /**
     * DTO转entity
     *
     * @param questionDto dto
     * @return entity
     */
    @Mappings({
            @Mapping(source = "totalScore", target = "score")
            , @Mapping(target = "correct", ignore = true)
    })
    Question dtoToQuestion(QuestionDto questionDto);

    /**
     * entity转DTO
     *
     * @param question entity
     * @return dto
     */
    @Mappings({
            @Mapping(source = "score", target = "totalScore")
    })
    QuestionDto questionToDto(Question question);

    /**
     * long 转 entity
     *
     * @param id long
     * @return entity
     */
    default QuestionId longToQuestionId(Long id) {
        return new QuestionId(id);
    }

    /**
     * str 转 entity
     *
     * @param subjectType str
     * @return entity
     */
    default SubjectType strToSubjectType(String subjectType) {
        return new SubjectType(subjectType);
    }

    /**
     * int 转 entity
     *
     * @param score int
     * @return entity
     */
    default Score doubleToScore(Double score) {
        return new Score(score);
    }

    /**
     * str 转 entity
     *
     * @param analyze str
     * @return entity
     */
    default Analyze strToAnalyze(String analyze) {
        return new Analyze(analyze);
    }

    /**
     * entity 转 long
     *
     * @param questionId obj
     * @return long
     */
    default Long questionIdToLong(QuestionId questionId) {
        return questionId.getId();
    }

    /**
     * entity 转 str
     *
     * @param subjectType entity
     * @return string
     */
    default String subjectTypeToStr(SubjectType subjectType) {
        return subjectType.getType();
    }

    /**
     * entity转double
     *
     * @param score entity
     * @return double
     */
    default Double scoreToDouble(Score score) {
        return score.getGrossScore();
    }

    /**
     * entity转str
     *
     * @param analyze entity
     * @return entity
     */
    default String analyzeToStr(Analyze analyze) {
        return analyze.getAnalyze();
    }

    /**
     * entity转str
     *
     * @param correct entity
     * @return str
     */
    default String correctToStr(Correct correct) {
        return correct.getCorrect().isEmpty() ? correct.getCorrectArrays().toString() : correct.getCorrect();
    }
}
