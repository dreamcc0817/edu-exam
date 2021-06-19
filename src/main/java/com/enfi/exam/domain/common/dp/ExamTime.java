package com.enfi.exam.domain.common.dp;

import lombok.Data;

import java.util.Date;

/**
 * @author cloud-cc
 * @ClassName ExamTime
 * @Description 考试时间
 * @date 2021/5/22 08:57
 * @Version 1.0
 */
@Data
public class ExamTime {

    /**
     * 建议时间
     */
    private Integer suggestTime;

    /**
     * 试卷开始时间
     */
    private Date limitStartTime;

    /**
     * 试卷结束时间
     */
    private Date limitEndTime;

    /**
     * 答题时间
     */
    private Integer answerTime;

    public ExamTime(Integer suggestTime) {
        this.suggestTime = suggestTime;
    }
}
