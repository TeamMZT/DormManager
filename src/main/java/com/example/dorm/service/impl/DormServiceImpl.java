package com.example.dorm.service.impl;

import com.example.dorm.bean.Dorm;
import com.example.dorm.bean.DormManager;
import com.example.dorm.bean.Result;
import com.example.dorm.mapper.DormMapper;
import com.example.dorm.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Constants;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 17:55
 * description:
 */
@Service
public class DormServiceImpl  implements DormService {
    @Autowired
    private DormMapper dormMapper;

    // TODO:需要修改方法

    @Override
    public Result insertDorm(Dorm dorm) {

        int rows = dormMapper.insertDorm(dorm);
        Result result = new Result();
        if(rows>0){
            List<Dorm> list = dormMapper.queryDormList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setData(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result deleteDorm(Dorm dorm) {

        int rows = dormMapper.deleteDorm(dorm);
        Result result = new Result();
        if(rows>0){
            List<Dorm> list = dormMapper.queryDormList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setData(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result queryDormList(Dorm dorm) {

        Result result = new Result();
        List<Dorm> list = dormMapper.queryDormList();
        result.setCode(Constants.OK);//可有可无
        result.setData(list);
        return result;
    }

    @Override
    public Result queryDorm(Dorm dorm){
        return null;
    }

    @Override
    public Result updateDorm(Dorm dorm) {

        int rows = dormMapper.updateDorm(dorm);
        Result result = new Result();
        if(rows>0){
            List<Dorm> list = dormMapper.queryDormList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }
}
