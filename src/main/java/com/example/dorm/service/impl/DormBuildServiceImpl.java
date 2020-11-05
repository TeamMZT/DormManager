package com.example.dorm.service.impl;

import com.example.dorm.bean.DormBuild;
import com.example.dorm.bean.Result;
import com.example.dorm.mapper.DormBuildMapper;
import com.example.dorm.service.DormBuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.Constants;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 14:48
 * description:
 */
@Service
public class DormBuildServiceImpl implements DormBuildService {
    @Autowired
    private DormBuildMapper dormBuildMapper;

    // TODO:需要修改方法

    @Override
    public Result insertDormBuild(DormBuild dormbuild) {

        int rows = dormBuildMapper.insertDormBuild(dormbuild);
        Result result = new Result();
        if(rows>0){
            List<DormBuild> list = dormBuildMapper.queryDormBuildList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setData(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result deleteDormBuild(DormBuild dormbuild) {

        int rows = dormBuildMapper.deleteDormBuild(dormbuild);
        Result result = new Result();
        if(rows>0){
            List<DormBuild> list = dormBuildMapper.queryDormBuildList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setData(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result queryDormBuildList(DormBuild dormbuild) {
        Result result = new Result();
        List<DormBuild> list = dormBuildMapper.queryDormBuildList();
        result.setCode(Constants.OK);//可有可无
        result.setData(list);
        return result;
    }

    @Override
    public Result queryDormBuild(DormBuild dormbuild){
        return null;
    }

    @Override
    public Result updateDormBuild(DormBuild dormbuild) {

        int rows = dormBuildMapper.updateDormBuild(dormbuild);
        Result result = new Result();
        if(rows>0){
            List<DormBuild> list = dormBuildMapper.queryDormBuildList();
            result.setCode(Constants.OK);
            result.setData(list);
        }else {
            result.setData(Constants.FAIL);
        }
        return result;
    }
}
