package com.example.dorm.mapper;

import com.example.dorm.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 16:37
 * description:对数据库学生表操作的接口文件
 */
@Repository
public interface StuMapper {

    /**
     * 添加方法
     * @param student
     * @return
     */
    int insertStu(Student student);

    /**
     *查询全部
     * @return
     */
    List<Student> queryStuList();


    /**
     * 修改方法
     * @param student
     * @return
     */
    int updateStu(Student student);

    /**
     * 删除方法
     * @param student
     * @return
     */
    int deleteStu(Student student);

    /**
     * 条件查询
     * @param student
     * @return
     */
    Student selectStu(Student student);
}
