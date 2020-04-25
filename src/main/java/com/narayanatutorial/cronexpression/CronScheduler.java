package com.narayanatutorial.cronexpression;


import org.springframework.scheduling.annotation.Scheduled;

public class CronScheduler {
	
	//every 30 Sec will be executed 
	@Scheduled(cron = "0/30 * * * * ? *")
	public void cronSchedulerMethod() {
		System.out.println("cronSchedulerMethod ..execution.");
	}
}
