package com.enfi.exam.domain.common;

import com.enfi.exam.domain.common.dp.UserId;
import lombok.Data;

import java.util.Date;

/**
 * @author cloud-cc
 * @ClassName BaseDomain
 * @Description BaseDomain
 * @date 2021/6/7 10:10
 * @Version 1.0
 */
@Data
public abstract class BaseDomain {
    /**
     * 创建用户
     */
    private UserId createUserId;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新日期
     */
    private Date updateDate;
}
