package com.kgc.timing.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimingImpl2 {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 6000)
	public void reportCurrentTime() {
		System.out.println("现在的时间为：" + dateFormat.format(new Date()));
	}

}
