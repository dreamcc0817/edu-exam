package com.enfi.exam.infrastructure.orm.mybatis.assembler;

import com.alibaba.fastjson.JSON;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.question.entity.Question;
import com.enfi.exam.domain.question.entity.dp.Analyze;
import com.enfi.exam.domain.question.entity.dp.Correct;
import com.enfi.exam.domain.question.entity.dp.QuestionId;
import com.enfi.exam.domain.question.entity.dp.QuestionInfo;
import com.enfi.exam.infrastructure.orm.mybatis.po.QuestionPo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @author cloud-cc
 * @ClassName QuestionDTO
 * @Description 问题DTO
 * @date 2021/5/25 14:15
 * @Version 1.0
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionAssembler {
    /**
     * entity转po
     *
     * @param question entity
     * @return po
     */
    @Mappings({
            @Mapping(source = "questionId", target = "id")
            ,@Mapping(source = "questionInfoList",target = "infoTextContent")
    })
    QuestionPo questionToPo(Question question);

    /**
     * po转entity
     * @param questionPo po
     * @return entity
     */
    @Mappings({
            @Mapping(source = "id", target = "questionId")
            ,@Mapping(source = "infoTextContent",target = "questionInfoList")
            ,@Mapping(target = "correct",ignore = true)
    })
    Question poToQuestion(QuestionPo questionPo);

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
     * str 转 entity
     * @param questionInfos str
     * @return entity
     */
    default List<QuestionInfo> strToQuestionInfos(String questionInfos){
        return JSON.parseArray(questionInfos).toJavaList(QuestionInfo.class);
    }

    /**
     * list 转 str
     *
     * @param questionInfoList list
     * @return str
     */
    default String questionInfoListToString(List<QuestionInfo> questionInfoList) {
        return JSON.toJSONString(questionInfoList);
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
     * @param correct entity
     * @return str
     */
    default String correctToStr(Correct correct){
        if(correct.getCorrect().isEmpty()){
            return correct.getCorrectArrays().toString();
        }
        return correct.getCorrect();
    }
}
