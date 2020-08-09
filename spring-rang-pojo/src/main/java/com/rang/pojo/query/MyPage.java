package com.rang.pojo.query;

import lombok.Data;

/**
 * @ClassName MyPage
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 13:00
 * @Version 1.0
 **/
@Data
public class MyPage {
	private Integer pageNum = 1;
	private Integer pageSize = 10;
	private String OrderBy = "";
}
