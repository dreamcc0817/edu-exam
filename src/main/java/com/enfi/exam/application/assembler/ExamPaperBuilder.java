package com.enfi.exam.application.assembler;

import com.enfi.exam.domain.common.dp.ExamTime;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.exampaper.entity.ExamPaper;
import com.enfi.exam.domain.exampaper.entity.dp.ExamPaperTitle;
import com.enfi.exam.domain.exampaper.entity.dp.ExamType;
import com.enfi.exam.application.dto.ExamPaperDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

/**
 * @author cloud-cc
 * @ClassName ExamPaperBuilder
 * @Description ExamPaper转换类
 * @date 2021/6/7 17:06
 * @Version 1.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExamPaperBuilder {

    /**
     * dto转entity
     *
     * @param examPaperDto dto
     * @return entity
     */
    @Mappings({
            @Mapping(source = "title", target = "examPaperTitle")
    })
    ExamPaper examPaperDtoToExamPaper(ExamPaperDto examPaperDto);

    /**
     * entity 转 dto
     *
     * @param examPaper entity
     * @return dto
     */
    ExamPaperDto examPaperToDto(ExamPaper examPaper);

    /**
     * str 转 entity
     *
     * @param examTitle str
     * @return entity
     */
    default ExamPaperTitle strToExamPaperTitle(String examTitle) {
        return new ExamPaperTitle(examTitle);
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
     * @param examType int
     * @return entity
     */
    default ExamType intToExamType(Integer examType) {
        return ExamType.convert(examType);
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
     * int 转 entity
     *
     * @param examTime int
     * @return entity
     */
    default ExamTime intToExamTime(Integer examTime) {
        return new ExamTime(examTime);
    }

    /**
     * entity 转 str
     *
     * @param subjectType entity
     * @return str
     */
    default String subjectTypeToStr(SubjectType subjectType) {
        return subjectType.getType();
    }

    /**
     * entity 转 integer
     * @param examType entity
     * @return integer
     */
    default Integer intToExamType(ExamType examType) {
        return examType.getCode();
    }

    /**
     * entity 转 double
     * @param score entity
     * @return double
     */
    default Double doubleToScore(Score score){
        return score.getGrossScore();
    }
}
