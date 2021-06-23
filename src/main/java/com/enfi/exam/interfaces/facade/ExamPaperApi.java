package com.enfi.exam.interfaces.facade;

import com.enfi.exam.application.ExamPaperApplication;
import com.enfi.exam.application.dto.ExamPaperDto;
import com.enfi.exam.interfaces.common.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author cloud-cc
 * @ClassName ExamPaperApi
 * @Description examPaperApi
 * @date 2021/6/9 14:47
 * @Version 1.0
 */
@Api(tags = "试卷Controller")
@RequestMapping("/examPaper")
@RestController
public class ExamPaperApi {

    private final ExamPaperApplication examPaperApplication;

    public ExamPaperApi(ExamPaperApplication examPaperApplication) {
        this.examPaperApplication = examPaperApplication;
    }

    @ApiOperation("保存试卷")
    @PostMapping()
    public Result<String> saveExamPaper(@RequestBody ExamPaperDto examPaperDto){
        examPaperApplication.save(examPaperDto);
        return Result.succeed();
    }

    @ApiOperation("查询试卷")
    @GetMapping("/{id}")
    public Result<ExamPaperDto> queryExamPaper(@PathVariable("id") Long examPaperId){
        return null;
    }
}
