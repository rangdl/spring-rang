package com.rang.dao.mapper;

import com.rang.pojo.entity.movie.MovieDO;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName MovieMapper
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:35
 * @Version 1.0
 **/
@Component
public interface MovieMapper extends Mapper<MovieDO>, MySqlMapper<MovieDO> {

}
