package com.rang.dao.mapper;

import com.rang.pojo.entity.movie.MovieDO;
import com.rang.pojo.entity.movie.SiteDO;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName SiteMapper
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 13:07
 * @Version 1.0
 **/
@Component
public interface SiteMapper  extends Mapper<SiteDO>, MySqlMapper<SiteDO> {

}
