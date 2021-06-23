package com.enfi.exam.application.dto;

import com.enfi.exam.domain.question.entity.dp.QuestionInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cloud-cc
 * @ClassName QuestionDTO
 * @Description 问题DTO
 * @date 2021/5/25 14:15
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {

    private Long questionId;

    /**
     * 问题类型
     */
    private String questionType;

    /**
     * 试卷科目
     */
    private String subjectType;

    /**
     * 问题总分数
     */
    private Double totalScore;

    /**
     * 试卷难度
     */
    private String difficult;

    /**
     * 题目、填空、 题干、解析、答案等信息
     */
    private List<QuestionInfo> questionInfoList;

    /**
     * 答案
     */
    private String correct;

    /**
     * 问题解析
     */
    private String analyze;

}
