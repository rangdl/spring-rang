package com.rang.service.dao.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rang.dao.mapper.MovieMapper;
import com.rang.dao.mapper.UserMapper;
import com.rang.pojo.entity.movie.MovieDO;
import com.rang.pojo.query.movie.MovieQuery;
import com.rang.service.dao.MovieService;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

/**
 * @ClassName MovieServiceImpl
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:41
 * @Version 1.0
 **/
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public PageInfo selectMovies(MovieQuery movieQuery) {
        Sqls sqls = Sqls.custom().andEqualTo("state", 1);
        if (!Objects.isNull(movieQuery.getName())) {
            sqls.andLike("name", "%" + movieQuery.getName() + "%");
        }
        if (!Objects.isNull(movieQuery.getType())) {
            sqls.andLike("type", "%" + movieQuery.getType() + "%");
        }
        Example example = Example.builder(MovieDO.class).where(sqls).orderByDesc("updateTime").build();
        PageHelper.startPage(movieQuery.getPageNum(), movieQuery.getPageSize());
        List<MovieDO> list = movieMapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
