package com.example.dorm.controller;

import com.example.dorm.bean.Admin;
import com.example.dorm.bean.Result;
import com.example.dorm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 11:31
 * description:处理系统管理员登陆模块请求的controller
 */
@RestController//返回json数据
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("login")
    public Result login(Admin admin){
        Result result=adminService.login(admin);
        return result;
    }

}
