package com.enfi.exam.application.dto;

import com.enfi.exam.domain.common.dp.Difficult;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.question.entity.dp.Correct;
import com.enfi.exam.domain.question.entity.dp.QuestionInfo;
import com.enfi.exam.domain.question.entity.dp.QuestionType;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author cloud-cc
 * @ClassName QuestionDTO
 * @Description 问题DTO
 * @date 2021/5/25 14:15
 * @Version 1.0
 */
@Data
@ToString
public class QuestionDto {

    private Long questionId;

    /**
     * 问题类型
     */
    private Integer questionType;

    /**
     * 试卷科目
     */
    private String subjectType;

    /**
     * 问题总分数
     */
    private Integer totalScore;

    /**
     * 试卷难度
     */
    private Integer difficult;

    /**
     * 单选、判断题等答案
     */
    private String correct;

    /**
     * 题目、填空、 题干、解析、答案等信息
     */
    private List<QuestionInfo> questionInfos;

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType.getCode();
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType.getType();
    }

    public void setTotalScore(Score totalScore) {
        this.totalScore = totalScore.getGrossScore();
    }

    public void setDifficult(Difficult difficult) {
        this.difficult = difficult.getCode();
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public void setCorrect(Correct correct) {
        this.correct = correct.getCorrect();
    }

}
