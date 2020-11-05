package com.example.dorm.service;

import com.example.dorm.bean.Admin;
import com.example.dorm.bean.Result;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 11:39
 * description:系统管理员业务类
 */
public interface AdminService {
    /**
     *系统管理员登陆业务方法
     * @param admin
     * @return
     */
    Result login(Admin admin);
}
