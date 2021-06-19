package com.enfi.exam.interfaces.facade;

import com.enfi.exam.application.ExamPaperApplication;
import com.enfi.exam.application.dto.ExamPaperDto;
import com.enfi.exam.interfaces.common.util.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cloud-cc
 * @ClassName ExamPaperApi
 * @Description examPaperApi
 * @date 2021/6/9 14:47
 * @Version 1.0
 */
@RequestMapping("/examPaper")
@RestController
public class ExamPaperApi {

    private final ExamPaperApplication examPaperApplication;

    public ExamPaperApi(ExamPaperApplication examPaperApplication) {
        this.examPaperApplication = examPaperApplication;
    }

    @ApiOperation("保存试卷")
    @PostMapping("/save")
    public Result<String> saveExamPaper(@RequestBody ExamPaperDto examPaperDto){
        examPaperApplication.save(examPaperDto);
        return Result.succeed();
    }
}
