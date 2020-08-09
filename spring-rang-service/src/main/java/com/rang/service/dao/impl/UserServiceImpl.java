package com.rang.service.dao.impl;

import com.rang.dao.mapper.UserMapper;
import com.rang.pojo.entity.UserDO;
import com.rang.service.dao.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/8 10:04
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;


	@Override
	public Long saveUser(UserDO userDO) {
		userMapper.insertUseGeneratedKeys(userDO);
		return userDO.getId();
	}
}
