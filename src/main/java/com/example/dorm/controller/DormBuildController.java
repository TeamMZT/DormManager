package com.example.dorm.controller;

import com.example.dorm.bean.DormBuild;
import com.example.dorm.bean.Result;
import com.example.dorm.service.DormBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 14:43
 * description:处理宿舍楼模块的请求的controller
 */
@RestController
@RequestMapping("build") //访问的路径
public class DormBuildController {

    @Autowired
    private DormBuildService dormBuildService;

    @PostMapping("insert")
    public  Result insertDormBuild(DormBuild dormbuild){
        Result result = dormBuildService.insertDormBuild(dormbuild);
        return result;
    }

    @PostMapping("delete")
    public Result deleteDormBuild(DormBuild dormbuild){
        Result result = dormBuildService.deleteDormBuild(dormbuild);
        return result;
    }

    @PostMapping("query")
    public Result queryDormBuild(DormBuild dormbuild){
        Result result = dormBuildService.queryDormBuildList(dormbuild);
        return  result;
    }

    @PostMapping("select")
    public Result selectDormBuild(DormBuild dormbuild){
        Result result = dormBuildService.queryDormBuild(dormbuild);
        return result;
    }

    @PostMapping("save")
    public Result saveDormBuild(DormBuild dormbuild){
        Result result = dormBuildService.updateDormBuild(dormbuild);
        return result;
    }

}