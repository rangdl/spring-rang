package com.rang.service.impl.user;

import com.rang.dao.mapper.UserMapper;
import com.rang.pojo.entity.User;
import com.rang.service.user.UserService;
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
	public Long saveUser(User user) {
		userMapper.insertUseGeneratedKeys(user);
		return user.getId();
	}
}
