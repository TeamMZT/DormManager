package com.example.dorm.service;

import com.example.dorm.bean.DormGuest;
import com.example.dorm.bean.Result;

/**
 * projectName: dorm
 *
 * @author: 12510
 * time: 2020/11/4 16:48
 * description:
 */
public interface DormGuestService {

    Result insertDormGuest(DormGuest dormguest);
    Result deleteDormGuest(DormGuest dormguest);
    Result queryDormGuestList(DormGuest dormguest);
    Result queryDormGuest(DormGuest dormguest);
    Result updateDormGuest(DormGuest dormguest);
}
