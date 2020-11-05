package com.example.dorm.service.impl;

import com.example.dorm.bean.Repair;
import com.example.dorm.bean.Result;
import com.example.dorm.mapper.RepairMapper;
import com.example.dorm.service.RepairService;
import com.example.dorm.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 17:46
 * description:
 */
@Service
public class RepairServiceImpl implements RepairService {
    @Autowired
    private RepairMapper repairMapper;

    @Override
    public Result insertSaveRep(Repair repair) {
        int rows = repairMapper.insertRep(repair);
        Result result = new Result();
        if (rows > 0) {
            List<Repair> list = repairMapper.queryRepList();
            result.setCode(Constants.OK);
            result.setData(list);
        } else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result querySaveRep(Repair repair) {
        //2.查询
        Repair retRep = repairMapper.selectRep(repair);
        //3.返回结果
        Result result = new Result();
        if (retRep != null) {
            //查询成功 设置返回状态为1
            result.setCode(Constants.OK);
            result.setMessage("成功");
            result.setData(retRep);
        } else {
            result.setCode(Constants.FAIL);
            result.setMessage("失败");
        }
        return result;
    }

    @Override
    public Result updateSaveRep(Repair repair) {
        int rows = repairMapper.updateRep(repair);
        Result result = new Result();
        if (rows > 0) {
            List<Repair> list = repairMapper.queryRepList();
            result.setCode(Constants.OK);
            result.setData(list);
        } else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result deleteSaveRep(Repair repair) {
        int rows = repairMapper.deleteRep(repair);
        Result result = new Result();
        if (rows > 0) {
            List<Repair> list = repairMapper.queryRepList();
            result.setCode(Constants.OK);
            result.setData(list);
        } else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }
}
