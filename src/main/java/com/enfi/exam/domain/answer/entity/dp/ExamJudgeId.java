package com.enfi.exam.domain.answer.entity.dp;

import cn.hutool.core.util.IdUtil;
import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName ExamJudgeId
 * @Description ExamJudgeId
 * @date 2021/6/19 15:47
 * @Version 1.0
 */
@Data
public class ExamJudgeId {

    private Long id;

    public ExamJudgeId() {
        this.id = IdUtil.createSnowflake(1, 1).nextId();
    }
}
