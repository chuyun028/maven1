package com.waylau.spring.cloud.weather.job;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.waylau.spring.cloud.weather.service.CityClient;
import com.waylau.spring.cloud.weather.service.WeatherDataCollectionService;
import com.waylau.spring.cloud.weather.vo.City;

/**
 *  天气数据同步任务. 同步到redis中
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  姓名 工号
 * @version  [版本号, 2019年3月8日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class WeatherDataSyncJob extends QuartzJobBean
{
    
    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
    
    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;
    
    @Autowired
    private CityClient cityClient;
    
    @Override
    protected void executeInternal(JobExecutionContext context)
        throws JobExecutionException
    {
        logger.info("Start 天气数据同步任务");
        
        // 由城市数据API微服务来提供数据
        List<City> cityList = null;
        try
        {
            // 调用城市数据API
            cityList = cityClient.listCity();
            logger.info("  ************* :  "+cityList );
        }
        catch (Exception e)
        {
            logger.error("获取城市信息异常！", e);
            throw new RuntimeException("获取城市信息异常！", e);
        }
        
        for (City city : cityList)
        {
            String cityId = city.getCityId();
            logger.info("天气数据同步任务中，cityId:" + cityId);
            // 根据城市ID同步天气数据
            weatherDataCollectionService.syncDataByCityId(cityId);
        }
        
        logger.info("End 天气数据同步任务");
    }
    
}
