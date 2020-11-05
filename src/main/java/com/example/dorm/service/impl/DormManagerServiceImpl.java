package com.example.dorm.service.impl;

import com.example.dorm.bean.DormManager;
import com.example.dorm.bean.Result;
import com.example.dorm.mapper.DormManagerMapper;
import com.example.dorm.service.DormManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import utils.Constants;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 11:44
 * description:
 */
@Service
public class DormManagerServiceImpl implements DormManagerService {

    @Autowired
    private DormManagerMapper dormManagerMapper;

    @Override
    public Result login(DormManager dormmanager){
        //1.账号加密处理
        String newPwd = DigestUtils.md5DigestAsHex(
                (dormmanager.getPassword()+ Constants.SALT).getBytes());
        dormmanager.setPassword(newPwd);
        //2.查询
        DormManager retUser = dormManagerMapper.queryDormManager(dormmanager);
        //3.返回结果
        Result result = new Result();
        if (retUser != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
            result.setData(retUser);
        }else {
            result.setCode(0);
        }
        return result;
    }

}