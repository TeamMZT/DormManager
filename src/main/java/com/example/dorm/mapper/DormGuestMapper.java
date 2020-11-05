package com.example.dorm.mapper;

import com.example.dorm.bean.DormGuest;

import java.util.List;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 17:13
 * description:
 */
public interface DormGuestMapper {

    int insertDormGuest(DormGuest dormguest);

    int deleteDormGuest(DormGuest dormguest);

    List<DormGuest> queryDormGuestList();

    DormGuest queryDormGuest(DormGuest dormguest);

    int updateDormGuest(DormGuest dormguest);

}
