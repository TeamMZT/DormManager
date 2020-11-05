package com.example.dorm.controller;

import com.example.dorm.bean.DormManager;
import com.example.dorm.bean.Result;
import com.example.dorm.service.DormManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 11:35
 * description:处理宿舍管理员模块的请求的controller
 */
@RestController
@RequestMapping("manager") //访问的路径
public class DormManagerController {

    @Autowired
    private DormManagerService dormManagerService;
    @PostMapping("login")
    /**
     * 方法的形参 会自动被赋值
     */
    public Result login(DormManager dormmanager){

        Result result = dormManagerService.login(dormmanager);
        return result;
    }
}
