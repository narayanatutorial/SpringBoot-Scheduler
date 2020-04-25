package com.narayanatutorial.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

public class AsyncSheduler {

	@Async
	@Scheduled(fixedRate = 10)
	public void asyncShedulerMethod() {
		System.out.println("asyncShedulerMethod ..execution.");
	}
	
	
	@Async
	@Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
	public void asyncShedulerStringMethod() {
		System.out.println("asyncShedulerStringMethod ..execution.");
	}
}
