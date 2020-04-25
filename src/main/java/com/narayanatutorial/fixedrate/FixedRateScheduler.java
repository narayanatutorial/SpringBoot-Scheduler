package com.narayanatutorial.fixedrate;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class FixedRateScheduler {
	
	@Scheduled(fixedRate = 10)
	public void fixedRateSchedulerMethod() {
		System.out.println("fixedRateSchedulerMethod ..execution.");
	}
	
	@Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
	public void fixedRateSchedulerStringMethod() {
		System.out.println("fixedRateSchedulerStringMethod ..execution.");
	}
	
}
