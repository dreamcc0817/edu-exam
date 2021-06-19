package com.enfi.exam.infrastructure.orm.mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.enfi.exam.infrastructure.orm.mybatis.po.QuestionPo;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author cloud-cc
 * @ClassName QuestionDAO
 * @Description QuestionDAO
 * @date 2021/5/25 15:36
 * @Version 1.0
 */
@Mapper
public interface QuestionDao extends BaseMapper<QuestionPo> {

}
