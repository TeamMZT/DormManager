package com.example.dorm.service;

import com.example.dorm.bean.Result;
import com.example.dorm.bean.Student;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 16:37
 * description:学生模块业务类
 */
public interface StuService {

    /**
     * 插入数据后保存类型的业务方法
     * @param student
     * @return
     */
    Result insertSaveStu(Student student);

    /**
     *查询数据后保存类型的方法
     * @param student
     * @return
     */
    Result querySaveStu(Student student);

    /**
     *修改数据后保存类型的方法
     * @param student
     * @return
     */
    Result updateSaveStu(Student student);

    /**
     *删除数据后保存类型的方法
     * @param student
     * @return
     */
    Result deleteSaveStu(Student student);

}
