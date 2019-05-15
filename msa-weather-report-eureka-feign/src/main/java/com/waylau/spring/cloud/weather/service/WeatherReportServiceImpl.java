package com.waylau.spring.cloud.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waylau.spring.cloud.weather.vo.Weather;
import com.waylau.spring.cloud.weather.vo.WeatherResponse;

/**
 * 天气预报服务
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月8日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	
	@Autowired
	private WeatherDataClient weatherDataClient;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		
		// 由天气数据API微服务来提供数据
		WeatherResponse response = weatherDataClient.getDataByCityId(cityId);
		return response.getData();
	}

}
