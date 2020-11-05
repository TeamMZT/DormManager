package com.example.dorm.service.impl;

import com.example.dorm.bean.Result;
import com.example.dorm.bean.Student;
import com.example.dorm.mapper.StuMapper;
import com.example.dorm.service.StuService;
import com.example.dorm.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 16:39
 * description:学生模块业务的实现类
 */
@Service
public class StuServiceImpl implements StuService {
    @Autowired
    private StuMapper stuMapper;

    @Override
    public Result insertSaveStu(Student student) {
        int rows =stuMapper.insertStu(student);
        Result result = new Result();
        if (rows > 0) {
            List<Student> list = stuMapper.queryStuList();
            result.setCode(Constants.OK);
            result.setData(list);
        } else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result updateSaveStu(Student student) {
        int rows =stuMapper.updateStu(student);
        Result result = new Result();
        if (rows > 0) {
            List<Student> list = stuMapper.queryStuList();
            result.setCode(Constants.OK);
            result.setData(list);
        } else {
            result.setCode(Constants.FAIL);
        }
        return result;

    }

    @Override
    public Result deleteSaveStu(Student student) {
        int rows =stuMapper.deleteStu(student);
        Result result = new Result();
        if (rows > 0) {
            List<Student> list = stuMapper.queryStuList();
            result.setCode(Constants.OK);
            result.setData(list);
        } else {
            result.setCode(Constants.FAIL);
        }
        return result;
    }

    @Override
    public Result querySaveStu(Student Student) {
        //2.查询
        Student retStu = stuMapper.selectStu(Student);
        //3.返回结果
        Result result = new Result();
        if (retStu != null) {
            //查询成功 设置返回状态为1
            result.setCode(Constants.OK);
            result.setMessage("成功");
            result.setData(retStu);
        } else {
            result.setCode(Constants.FAIL);
            result.setMessage("失败");
        }
        return result;
    }

}
