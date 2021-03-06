package com.rang.dao.mapper;

import com.rang.pojo.entity.UserDO;
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
public interface UserMapper extends Mapper<UserDO>, MySqlMapper<UserDO> {

}
