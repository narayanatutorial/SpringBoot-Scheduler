package com.narayanatutorial.initialdelay;

import org.springframework.scheduling.annotation.Scheduled;

public class InitialDelayScheduler {
	@Scheduled(fixedRate = 10, initialDelay = 10)
	public void initialDelaySchedulerMethod() {
		System.out.println("initialDelaySchedulerMethod ..execution.");
	}
}
