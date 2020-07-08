package com.rang.dao.mapper;

import com.rang.dao.SpringRangDaoApplicationTests;
import com.rang.pojo.entity.User;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName TestMapperTest
 * @Description TODO
 * @Author rdl
 * @Date 2020/7/7 17:00
 * @Version 1.0
 **/
@Slf4j
public class TestMapperTest extends SpringRangDaoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 测试通用Mapper - 保存
	 */
	@Test
	public void testInsert() {
		User testSave3 = User.builder().name("testSave3").age(11).state(1).time(LocalDate.now()).build();
		userMapper.insertUseGeneratedKeys(testSave3);
		Assert.assertNotNull(testSave3.getId());
		log.debug("【测试主键回写#testSave3.getId()】= {}", testSave3.getId());
	}
}
