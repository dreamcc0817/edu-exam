package com.enfi.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author cloud-cc
 * @ClassName EduExamApplication
 * @Description 考试启动类
 * @date 2021/5/20 16:53
 * @Version 1.0
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.enfi.exam.infrastructure.orm.mybatis.dao")
@EnableCaching
public class EduExamApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduExamApplication.class, args);
    }
}
