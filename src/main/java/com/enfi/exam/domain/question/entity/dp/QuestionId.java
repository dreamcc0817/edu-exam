package com.enfi.exam.domain.question.entity.dp;

import cn.hutool.core.util.IdUtil;
import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName QuestionId
 * @Description QuestionId
 * @date 2021/6/19 16:10
 * @Version 1.0
 */
@Data
public class QuestionId {

    private Long id;

    public QuestionId() {
        this.id = IdUtil.createSnowflake(1,1).nextId();
    }

    public QuestionId(Long id) {
        this.id = id;
    }
}
