package com.enfi.exam.domain.question.entity;

import com.enfi.exam.domain.common.dp.Difficult;
import com.enfi.exam.domain.question.entity.dp.Correct;
import com.enfi.exam.domain.question.entity.dp.QuestionType;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.question.entity.dp.QuestionInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author cloud-cc
 * @ClassName Question
 * @Description 题目
 * @date 2021/5/22 09:46
 * @Version 1.0
 */
@Getter
@ToString
public class Question {

    @Setter
    private Long questionId;

    /**
     * 问题类型
     */
    private QuestionType questionType;

    /**
     * 试卷科目
     */
    private SubjectType subjectType;

    /**
     * 问题分数
     */
    private Score score;

    /**
     * 试卷难度
     */
    private Difficult difficult;

    /**
     * 题目 填空、题干、等信息
     */
    private List<QuestionInfo> questionInfoList;

    /**
     * 正确答案
     */
    private Correct correct;


    /**
     * 设置问题类型
     *
     * @param questionType 问题类型：单选、多选等
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = QuestionType.convert(questionType);
    }

    /**
     * 设置考试科目
     *
     * @param subjectType 考试科目
     */
    public void setSubjectType(String subjectType) {
        this.subjectType = new SubjectType(subjectType);
    }

    /**
     * 设置问题分数
     *
     * @param score 分数
     */
    public void setScore(Integer score) {
        if (this.getQuestionType().getCode().equals(QuestionType.GAPFILLING.getCode())) {
            this.score = new Score(questionInfoList.stream().mapToInt(QuestionInfo::getScore).sum());
        } else {
            this.score = new Score(score);
        }
    }

    /**
     * 设置问题难度
     *
     * @param difficult 问题难度
     */
    public void setDifficult(Integer difficult) {
        this.difficult = Difficult.convert(difficult);
    }

    /**
     * 设置问题内容
     *
     * @param questionInfoList 问题内容
     */
    public void setQuestionInfoList(List<QuestionInfo> questionInfoList) {
        this.questionInfoList = questionInfoList;
    }

    /**
     * 设置正确答案
     *
     * @param correct 正确答案
     */
    public void setCorrect(String correct) {
        this.correct = new Correct(correct);
    }

    /**
     * 设置多选答案
     *
     * @param correctArrays 多选答案
     */
    public void setCorrect(List<String> correctArrays){
        this.correct = new Correct(correctArrays);
    }

}
