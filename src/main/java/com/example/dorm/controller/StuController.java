package com.example.dorm.controller;

import com.example.dorm.bean.Result;
import com.example.dorm.bean.Student;
import com.example.dorm.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 15:33
 * description:处理学生模块请求的controller
 */
@RestController//返回json数据
@RequestMapping("saveStu")
public class StuController {

    @Autowired
    private StuService stuService;

    @PostMapping("insertStu")
    public Result insertSaveStu(Student student) {

        Result result = stuService.insertSaveStu(student);
        return result;
    }

    @PostMapping("updateStu")
    public Result updateSaveStu(Student student){
        Result result = stuService.updateSaveStu(student);
        return result;
    }

    @PostMapping("deleteStu")
    public Result deleteSaveStu(Student student){
        Result result = stuService.deleteSaveStu(student);
        return result;
    }

    @PostMapping("selectStu")
    public Result selectStu(Student student){
        Result result = stuService.querySaveStu(student);
        return result;
    }

}
