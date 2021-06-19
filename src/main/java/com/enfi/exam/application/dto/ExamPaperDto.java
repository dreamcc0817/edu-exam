package com.enfi.exam.application.dto;

import com.enfi.exam.domain.exampaper.entity.dp.QuestionCountItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author cloud-cc
 * @ClassName ExamPaperDto
 * @Description 试卷Dto
 * @date 2021/6/7 15:57
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamPaperDto {
    /**
     * 试卷ID
     */
    private Long examId;

    /**
     * 试卷名称
     */
    private String title;

    /**
     * 试卷科目
     */
    private String subjectType;

    /**
     * 试卷类型
     */
    private Integer examType;

    /**
     * 试卷总分数
     */
    private Integer score;

    /**
     * 题目数量
     */
    private List<QuestionCountItem> questionCountItems;

    /**
     * 建议考试时长
     */
    private Integer suggestionTime;

    /**
     * 试卷内容（试题）
     */
    private List<QuestionDto> questionDtoList;
}
