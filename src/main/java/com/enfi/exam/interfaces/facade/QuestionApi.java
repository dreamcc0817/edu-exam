package com.enfi.exam.interfaces.facade;

import com.enfi.exam.application.QuestionApplication;
import com.enfi.exam.application.dto.QuestionDto;
import com.enfi.exam.interfaces.common.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author cloud-cc
 * @ClassName QuestionApi
 * @Description question API
 * @date 2021/5/25 14:11
 * @Version 1.0
 */
@Api(tags = "问题Controller")
@RequestMapping("/question")
@RestController
public class QuestionApi {

    private QuestionApplication questionApplication;

    public QuestionApi(QuestionApplication questionApplication) {
        this.questionApplication = questionApplication;
    }

    @ApiOperation("保存试题")
    @PostMapping()
    public Result<String> saveQuestion(@ApiParam("试题") @RequestBody QuestionDto questionDto) {
        questionApplication.save(questionDto);
        return Result.succeed();
    }

    @ApiOperation("查询试题")
    @GetMapping("/{id}")
    public Result<QuestionDto> queryQuestion(@PathVariable("id") Long questionId){
        return Result.succeed(questionApplication.queryById(questionId));
    }

}
