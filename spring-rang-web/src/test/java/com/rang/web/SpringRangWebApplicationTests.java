package com.rang.web;

import com.thebeastshop.forest.springboot.annotation.ForestScan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.rang.dao")
@ComponentScan({"com.rang.core","com.rang.service","com.rang.web"})
@ForestScan(basePackages = "com.rang.web.site")
public class SpringRangWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
