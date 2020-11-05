package com.example.dorm.service;

import com.example.dorm.bean.DormBuild;
import com.example.dorm.bean.Result;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 14:48
 * description:
 */
public interface DormBuildService {

    Result insertDormBuild(DormBuild dormbuild); //增加
    Result deleteDormBuild(DormBuild dormbuild); //删除
    Result queryDormBuildList(DormBuild dormbuild); //查询(返回结果集)
    Result queryDormBuild(DormBuild dormbuild);//查询(返回精确搜索)
    Result updateDormBuild(DormBuild dormbuild); //保存

}
