package com.example.dorm.mapper;

import com.example.dorm.bean.Admin;
import org.springframework.stereotype.Repository;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 11:44
 * description:系统管理员数据库操作的接口文件
 */
@Repository
public interface AdminMapper {

    /**
     *查询动作
     * @param admin  有账号密码的admin
     * @return
     */
    Admin queryAdmin(Admin admin);
}
