package com.example.dorm.service;

import com.example.dorm.bean.Dorm;
import com.example.dorm.bean.Result;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 17:55
 * description:
 */
public interface DormService {

    Result insertDorm(Dorm dorm);
    Result deleteDorm(Dorm dorm);
    Result queryDormList(Dorm dorm);
    Result queryDorm(Dorm dorm);
    Result updateDorm(Dorm dorm);
}
