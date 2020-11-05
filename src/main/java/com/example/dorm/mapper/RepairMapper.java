package com.example.dorm.mapper;

import com.example.dorm.bean.Repair;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 17:43
 * description:报修模块数据库操作的接口文件
 */
@Repository
public interface RepairMapper {

    /**
     *插入数据方法
     * @param repair
     * @return int DML insert update delete 返回的影响行数
     */
    int insertRep(Repair repair);

    /**
     *查询全部
     * @return
     */
    List<Repair> queryRepList();

    /**
     *修改方法
     * @param repair
     * @return
     */
    int updateRep(Repair repair);

    /**
     *删除方法
     * @param repair
     * @return
     */
    int deleteRep(Repair repair);

    /**
     * 条件查询
     * @param repair
     * @return
     */
    Repair selectRep(Repair repair);

}
