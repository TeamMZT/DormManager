package com.example.dorm.controller;

import com.example.dorm.bean.DormGuest;
import com.example.dorm.bean.Result;
import com.example.dorm.service.DormGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 16:44
 * description:处理临时访客模块的请求的controller
 */
@RestController
@RequestMapping("guest") //访问的路径
public class DormGuestController {

    @Autowired
    private DormGuestService dormGuestService;

    @PostMapping("insert")
    public Result insertDormGuest(DormGuest dormguest){
        Result result = dormGuestService.insertDormGuest(dormguest);
        return result;
    }

    @PostMapping("delete")
    public Result deleteDormGuest(DormGuest dormguest){
        Result result = dormGuestService.deleteDormGuest(dormguest);
        return result;
    }

    @PostMapping("query")
    public Result queryDormGuestList(DormGuest dormguest){
        Result result = dormGuestService.queryDormGuestList(dormguest);
        return result;
    }

    @PostMapping("select")
    public Result selectDormGuest(DormGuest dormguest){
        Result result = dormGuestService.queryDormGuest(dormguest);
        return result;
    }

    @PostMapping("save")
    public Result saveDormGuest(DormGuest dormguest) {
        Result result = dormGuestService.updateDormGuest(dormguest);
        return result;
    }
}
