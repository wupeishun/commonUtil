package com.wps.gsonUtil;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JunitTest {
	
	/**
	 * 
	 * Description:对于要格式化多种类型的数据，只要注册多个适配器就可以了
	 */
	@Test
	public <T> void test() {
		Map<String, Object> resMap = new HashMap<String, Object>();
		GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls().
				registerTypeAdapter(String.class, new ConvertNull<T>()).
				registerTypeAdapter(Long.class, new ConvertNull<T>());
		Gson gson = gsonBuilder.create();
		gson.toJson(resMap);
	}

}
