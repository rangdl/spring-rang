package com.rang.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = {"com.rang.mapper.mapper"})
public class SpringRangMapperApplicationTests {

	@Test
	public void contextLoads() {
	}

}
