package com.enfi.exam.domain.question.entity;

import com.enfi.exam.domain.common.dp.Difficult;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.SubjectType;
import com.enfi.exam.domain.question.entity.dp.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author cloud-cc
 * @ClassName Question
 * @Description 题目
 * @date 2021/5/22 09:46
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private QuestionId questionId;

    /**
     * 试卷科目
     */
    @NotNull
    private SubjectType subjectType;

    /**
     * 问题类型
     */
    @NotNull
    private QuestionType questionType;

    /**
     * 选项前缀、选项内容等信息
     */
    @Valid
    private List<QuestionInfo> questionInfoList;

    /**
     * 正确答案
     */
    private Correct correct;

    /**
     * 问题解析
     */
    private Analyze analyze;

    /**
     * 问题分数
     */
    @Range(min = 0,max = 100,message = "分数范围为0~100")
    private Score score;

    /**
     * 试卷难度
     */
    private Difficult difficult;

}
