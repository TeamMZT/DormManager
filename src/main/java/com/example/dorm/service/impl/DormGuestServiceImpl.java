package com.example.dorm.service.impl;

import com.example.dorm.bean.DormGuest;
import com.example.dorm.bean.Result;
import com.example.dorm.mapper.DormGuestMapper;
import com.example.dorm.service.DormGuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Constants;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 16:48
 * description:
 */
@Service
public class DormGuestServiceImpl implements DormGuestService {
    @Autowired
    private DormGuestMapper dormGuestMapper;

    // TODO:需要修改方法

    @Override
    public Result insertDormGuest(DormGuest dormguest) {

        int rows = dormGuestMapper.insertDormGuest(dormguest);
        Result result = new Result();
        if(rows>0){
            List<DormGuest> list = dormGuestMapper.queryDormGuestList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result deleteDormGuest(DormGuest dormguest) {

        int rows = dormGuestMapper.deleteDormGuest(dormguest);
        Result result = new Result();
        if(rows>0){
            List<DormGuest> list = dormGuestMapper.queryDormGuestList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result queryDormGuestList(DormGuest dormguest) {
        Result result = new Result();
        List<DormGuest> list = dormGuestMapper.queryDormGuestList();
        result.setCode(Constants.OK);//可有可无
        result.setData(list);
        return result;
    }

    @Override
    public Result queryDormGuest(DormGuest dormguest){
        return null;
    }

    @Override
    public Result updateDormGuest(DormGuest dormguest) {

        int rows = dormGuestMapper.updateDormGuest(dormguest);
        Result result = new Result();
        if(rows>0){
            List<DormGuest> list = dormGuestMapper.queryDormGuestList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }
}
