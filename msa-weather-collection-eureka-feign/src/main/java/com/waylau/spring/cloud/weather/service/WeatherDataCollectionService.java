package com.waylau.spring.cloud.weather.service;

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
public interface WeatherDataCollectionService {
	
	/**
	 * 根据城市ID同步天气数据
	 * 
	 * @param cityId
	 * @return
	 */
	void syncDataByCityId(String cityId);

}
