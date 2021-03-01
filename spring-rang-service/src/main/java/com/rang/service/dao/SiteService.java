package com.rang.service.dao;

import com.rang.pojo.entity.movie.SiteDO;

import java.util.List;

/**
 * @ClassName SiteService
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 13:08
 * @Version 1.0
 **/
public interface SiteService {
    List<SiteDO> selectSites(Integer mId);
}
