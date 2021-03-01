package com.rang.service.dao.impl;

import com.rang.dao.mapper.SiteMapper;
import com.rang.pojo.entity.movie.SiteDO;
import com.rang.pojo.query.movie.SiteQuery;
import com.rang.service.dao.SiteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

/**
 * @ClassName SiteServiceImpl
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 13:09
 * @Version 1.0
 **/
@Service
public class SiteServiceImpl implements SiteService {

    @Autowired
    private SiteMapper siteMapper;

    @Override
    public List<SiteDO> selectSites(Integer mId) {
        Sqls sqls = Sqls.custom().andEqualTo("state", 1)
                .andEqualTo("mId", mId);
        Example example = Example.builder(SiteDO.class).where(sqls).build();
        List<SiteDO> list = siteMapper.selectByExample(example);
        return list;
    }
}
