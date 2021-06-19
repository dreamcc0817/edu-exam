package com.enfi.exam.domain.exampaper.entity.dp;

import cn.hutool.core.util.IdUtil;
import lombok.Data;

/**
 * @author cloud-cc
 * @ClassName ExamPaperId
 * @Description 试卷ID
 * @date 2021/6/18 14:17
 * @Version 1.0
 */
@Data
public class ExamPaperId {

    private Long id;

    public ExamPaperId() {
        this.id = IdUtil.createSnowflake(1, 1).nextId();
    }
}
