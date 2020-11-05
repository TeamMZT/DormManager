package com.example.dorm.controller;

import com.example.dorm.bean.Repair;
import com.example.dorm.bean.Result;
import com.example.dorm.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 17:41
 * description:处理报修模块请求的controller
 */
@Repository//返回json数据
@RequestMapping("saveRepair")
public class RepairController {

    @Autowired
    private RepairService repairService;

    @PostMapping("insertRep")
    public Result insertSaveRep(Repair repair) {

        Result result = repairService.insertSaveRep(repair);
        return result;
    }

    @PostMapping("updateStu")
    public Result updateSaveRep(Repair repair){
        Result result = repairService.updateSaveRep(repair);
        return result;
    }

    @PostMapping("deleteStu")
    public Result deleteSaveRep(Repair repair){
        Result result = repairService.deleteSaveRep(repair);
        return result;
    }

    @PostMapping("selectStu")
    public Result selectRep(Repair repair){
        Result result = repairService.querySaveRep(repair);
        return result;
    }

}
