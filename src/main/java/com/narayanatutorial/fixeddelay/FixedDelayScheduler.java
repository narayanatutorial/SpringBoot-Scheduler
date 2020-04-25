package com.narayanatutorial.fixeddelay;

import org.springframework.scheduling.annotation.Scheduled;

public class FixedDelayScheduler {

	@Scheduled(fixedDelay = 10)
	public void fixedDelaySchedulerMethod() {
		System.out.println("fixedDelaySchedulerMethod ..execution.");
	}
	@Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
	public void fixedDelaySchedulerStringMethod() {
		System.out.println("fixedDelaySchedulerStringMethod ..execution.");
	}
}
