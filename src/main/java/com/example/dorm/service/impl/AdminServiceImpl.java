package com.example.dorm.service.impl;

import com.example.dorm.bean.Admin;
import com.example.dorm.bean.Result;
import com.example.dorm.mapper.AdminMapper;
import com.example.dorm.service.AdminService;
import com.example.dorm.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 11:42
 * description:系统管理员模块业务的实现类
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;


    @Override
    public Result login(Admin admin) {
        //1.账号密码加密处理
        String newPwd = DigestUtils.md5DigestAsHex(
                (admin.getPassword() + Constants.SALT).getBytes());
        admin.setPassword(newPwd);
        //2.查询
        Admin retUser = adminMapper.queryAdmin(admin);
        //3.返回结果
        Result result = new Result();
        if (retUser != null) {
            //查询成功 设置返回状态为1
            result.setCode(Constants.OK);
            result.setMessage("成功");
            result.setData(retUser);
        } else {
            result.setCode(Constants.FAIL);
            result.setMessage("失败");
        }
        return result;
    }
}
