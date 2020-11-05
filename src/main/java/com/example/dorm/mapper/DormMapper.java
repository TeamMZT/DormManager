package com.example.dorm.mapper;

import com.example.dorm.bean.Dorm;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 17:54
 * description:
 */
public interface DormMapper {

    int insertDorm(Dorm dorm);

    int deleteDorm(Dorm dorm);

    List<Dorm> queryDormList();

    int updateDorm(Dorm dorm);

    Dorm query(Dorm dorm);
}