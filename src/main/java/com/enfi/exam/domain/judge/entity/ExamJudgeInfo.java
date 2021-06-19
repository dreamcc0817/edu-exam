package com.enfi.exam.domain.judge.entity;

import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.answer.entity.ExamPaperAnswer;

/**
 * @author cloud-cc
 * @ClassName JudgeInfo
 * @Description 评卷信息
 * @date 2021/6/16 10:22
 * @Version 1.0
 */
public class ExamJudgeInfo {

    private Long id;

    /**
     * 答卷
     */
    private ExamPaperAnswer examPaperAnswer;

    /**
     * 分数
     */
    private Score score;

    //TODO private User user 评卷人信息

}
