package com.enfi.exam.domain.answer.entity;

import com.enfi.exam.domain.answer.entity.dp.ExamJudgeId;
import com.enfi.exam.domain.common.dp.Score;
import com.enfi.exam.domain.common.dp.UserId;
import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName JudgeInfo
 * @Description 评卷信息
 * @date 2021/6/16 10:22
 * @Version 1.0
 */
@Data
public class ExamJudge {

    private ExamJudgeId examJudgeId;

    /**
     * 答卷
     */
    private ExamPaperAnswer examPaperAnswer;

    /**
     * 分数
     */
    private Score score;

    /**
     * 评卷人ID
     */
    private UserId judgeUserId;

}
