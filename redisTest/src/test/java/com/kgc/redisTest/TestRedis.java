package com.kgc.redisTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import com.kgc.redisTest.pojo.Author;
import com.kgc.redisTest.service.RedisHelperImpl;
 
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
 
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
 
	@Autowired
	private RedisTemplate redisTemplate;
 
	@Autowired
	private RedisHelperImpl redisHelper;
 
	@Test
	public void test() throws Exception {
		Author user = new Author();
		user.setName("Alex");
		user.setIntro_l("不会打篮球的程序不是好男人");
 
		// 像redis中保存数据
		redisHelper.valuePut("aaa", user);
 
		// 根据key获取缓存数据
		Author autor = (Author) redisHelper.getValue("aaa");
 
		// 根据key删掉一条数据
		//redisHelper.remove("aaa");
		System.out.println(autor);
	}
 
	@Test
	public void testObj() throws Exception {
		Author user = new Author();
		user.setName("Jerry");
		user.setIntro_l("不会打篮球的程序不是好男人!");
 
		ValueOperations<String, Author> operations = redisTemplate.opsForValue();
		operations.set("502", user);
		Thread.sleep(500);
		boolean exists = redisTemplate.hasKey("502");
		if (exists) {
			System.out.println(redisTemplate.opsForValue().get("502"));
		} else {
			System.out.println("exists is false");
		}
	}
}

