package com.example.dorm.mapper;

import com.example.dorm.bean.DormManager;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 11:45
 * description:宿舍管理员模块数据库操作的接口文件
 */
public interface DormManagerMapper {

    DormManager queryDormManager(DormManager dormmanager);
}