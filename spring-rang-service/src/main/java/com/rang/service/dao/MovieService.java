package com.rang.service.dao;

import com.github.pagehelper.PageInfo;
import com.rang.pojo.query.movie.MovieQuery;

/**
 * @ClassName MovieService
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:41
 * @Version 1.0
 **/
public interface MovieService {
	PageInfo selectMovies(MovieQuery movieQuery);
}
