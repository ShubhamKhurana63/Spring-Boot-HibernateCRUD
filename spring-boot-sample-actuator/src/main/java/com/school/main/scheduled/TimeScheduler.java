package com.school.main.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeScheduler {

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void timeScheduler() {
		Date d = new Date();
		System.out.println(simpleDateFormat.format(d));
	}
}
