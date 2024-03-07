package com.SpringBootSchedulingDemo.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmpReportService {
	//@Scheduled(fixedDelay = 5000)	//mili sec
	//@Scheduled(fixedDelayString = "5000")
	//@Scheduled(initialDelay = 4000, fixedDelay = 5000)
	
	//@Scheduled(fixedRate = 5000)
	
	//@Scheduled(cron = "10 * * * * *")	//10th sec of a minute
	@Scheduled(cron = "*/10 * * * * *")	//10 sec gap
	public void executeReportA() {
		System.out.println("ABC REPORT DATA..." + new Date());
	}
	/*
	@Scheduled(fixedDelay = 3000)	//mili sec
	public void executeReportB() {
		System.out.println("IJK REPORT DATA..." + new Date());
	}
	*/
}
