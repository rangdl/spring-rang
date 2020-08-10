package com.rang.web.controller;

import com.rang.core.model.ResultVO;
import com.rang.pojo.entity.movie.SiteDO;
import com.rang.service.dao.SiteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SiteController
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 13:14
 * @Version 1.0
 **/
@RestController
@RequestMapping("sites")
public class SiteController {

	@Autowired
	private SiteService siteService;

	@GetMapping
	public ResultVO queryMovies(Integer mId){
		List<SiteDO> list = siteService.selectSites(mId);
		return ResultVO.ofSuccess(list);
	}
}
