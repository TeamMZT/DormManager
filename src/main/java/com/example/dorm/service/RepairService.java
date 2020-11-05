package com.example.dorm.service;

import com.example.dorm.bean.Repair;
import com.example.dorm.bean.Result;

/**
 * projectName: dorm
 *
 * @author: 赵振华
 * time: 2020/11/4 17:45
 * description:报修业务方法
 */
public interface RepairService {

    /**
     * 插入数据后保存类型的业务方法
     * @param repair
     * @return
     */
    Result insertSaveRep(Repair repair);

    /**
     *查询数据后保存类型的方法
     * @param repair
     * @return
     */
    Result querySaveRep(Repair repair);

    /**
     *修改数据后保存类型的方法
     * @param repair
     * @return
     */
    Result updateSaveRep(Repair repair);

    /**
     *删除数据后保存类型的方法
     * @param repair
     * @return
     */
    Result deleteSaveRep(Repair repair);
}
