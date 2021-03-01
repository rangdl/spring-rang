package com.rang.web.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.rang.core.model.ResultVO;
import com.rang.pojo.entity.movie.MovieDO;
import com.rang.pojo.query.movie.MovieQuery;
import com.rang.service.dao.MovieService;
import com.rang.service.dao.UserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MovieController
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:51
 * @Version 1.0
 **/
@RestController
@RequestMapping("movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    /**
     * 按照id查询
     *
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public ResultVO queryMoviesById(@PathVariable Integer id) {
        return ResultVO.ofSuccess(id);
    }

    @GetMapping
    public ResultVO queryMovies(MovieQuery movieQuery) {
        PageInfo pageInfo = movieService.selectMovies(movieQuery);
        return ResultVO.ofSuccess(pageInfo);
    }
}
