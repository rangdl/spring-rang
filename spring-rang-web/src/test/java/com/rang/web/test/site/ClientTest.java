package com.rang.web.test.site;

import com.rang.web.SpringRangWebApplicationTests;
import com.rang.web.site.TestClient;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName TestClient
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/14 9:00
 * @Version 1.0
 **/
@Slf4j
public class ClientTest extends SpringRangWebApplicationTests {

	@Autowired
	private TestClient testClient;
	@Test
	public void testGetLocation(){
		Map result = testClient.getLocation("121.475078", "31.223577");
		System.out.println(result);
	}
}
