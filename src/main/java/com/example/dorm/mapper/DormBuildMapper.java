package com.example.dorm.mapper;

import com.example.dorm.bean.DormBuild;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 15:11
 * description:宿舍楼模块数据库操作的接口文件
 */
public interface DormBuildMapper {

    int insertDormBuild(DormBuild dormbuild);

    int deleteDormBuild(DormBuild dormbuild);

    List<DormBuild> queryDormBuildList();

    DormBuild queryDormBuild(DormBuild dormbuild);

    int updateDormBuild(DormBuild dormbuild);

}