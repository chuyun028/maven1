package com.waylau.spring.cloud.weather.service;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *  天气数据采集服务.
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月8日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

	private final static Logger logger = LoggerFactory.getLogger(WeatherDataCollectionServiceImpl.class);  
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	private final String WEATHER_API = "http://wthrcdn.etouch.cn/weather_mini";

	private final Long TIME_OUT = 1800L; // 缓存超时时间

	@Override
	public void syncDataByCityId(String cityId) {
		logger.info("Start 同步天气.cityId:"+cityId);
		
		String uri = WEATHER_API + "?citykey=" + cityId;
		this.saveWeatherData(uri);
		
		logger.info("End 同步天气");
	}
	
	private void saveWeatherData(String uri) {
		ValueOperations<String, String> ops = this.stringRedisTemplate.opsForValue();
		String key = uri;
		String strBody = null;
 
		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
		
		if (response.getStatusCodeValue() == 200) {
			strBody = response.getBody();
		}

		ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);
	}

}