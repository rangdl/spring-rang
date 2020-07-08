package com.rang.mapper.mapper;

import com.rang.pojo.entity.User;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName TestMapper
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/7 16:44
 * @Version 1.0
 **/
@Component
public interface UserMapper extends Mapper<User>, MySqlMapper<User> {

}
