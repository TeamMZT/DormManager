package com.example.dorm.controller;

import com.example.dorm.bean.Dorm;
import com.example.dorm.bean.Result;
import com.example.dorm.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 17:51
 * description:处理宿舍模块的请求的controller
 */
@RestController
@RequestMapping("dorm") //访问的路径
public class DormController {

    @Autowired
    private DormService dormService;

    @PostMapping("insert")
    public Result insertDorm(Dorm dorm){
        Result result = dormService.insertDorm(dorm);
        return result;
    }

    @PostMapping("delete")
    public Result deleteDorm(Dorm dorm){
        Result result = dormService.deleteDorm(dorm);
        return result;
    }

    @PostMapping("query")
    public Result queryDorm(Dorm dorm){
        Result result = dormService.queryDormList(dorm);
        return result;
    }

    @PostMapping("select")
    public Result selectDorm(Dorm dorm){
        Result result = dormService.queryDorm(dorm);
        return result;
    }

    @PostMapping("save")
    public Result saveDorm(Dorm dorm){
        Result result = dormService.updateDorm(dorm);
        return result;
    }
}
