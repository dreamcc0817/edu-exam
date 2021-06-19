package com.enfi.exam.domain.common.dp;


import org.springframework.util.StringUtils;

import javax.validation.ValidationException;

/**
 * @author cloud-cc
 * @ClassName SubJectType
 * @Description 考试类目
 * @date 2021/5/21 15:09
 * @Version 1.0
 */
public class SubjectType {

    /**
     * 考试类目
     */
    private String typeId;

    public String getType() {
        return typeId;
    }

    public void setType(String typeId) {
        this.typeId = typeId;
    }

    public SubjectType(String type) {
        if(StringUtils.isEmpty(type)){
            throw new ValidationException("type不能为空");
        }
        this.typeId = type;
    }
}
