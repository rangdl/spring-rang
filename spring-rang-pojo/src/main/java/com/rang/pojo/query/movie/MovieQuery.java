package com.rang.pojo.query.movie;

import com.github.pagehelper.IPage;
import com.github.pagehelper.page.PageParams;
import com.rang.pojo.query.MyPage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName MovieQuery
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/9 11:45
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieQuery extends MyPage implements IPage {
	private String name;
	private String type;
}
