package com.rang.service.dao;

import com.rang.pojo.entity.UserDO;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/8 8:40
 * @Version 1.0
 **/
public interface UserService {

    Long saveUser(UserDO userDO);
}
