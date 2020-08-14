package com.rang.web.site;

import com.dtflys.forest.annotation.Request;
import java.util.Map;

/**
 * @ClassName TestClient
 * @Description TODO
 * @Author rdl
 * @Date 2020/8/14 8:56
 * @Version 1.0
 **/
public interface TestClient {

	@Request(
			url = "http://ditu.amap.com/service/regeo?longitude=${0}&latitude=${1}",
			dataType = "json"
	)
	Map getLocation(String longitude, String latitude);
}
