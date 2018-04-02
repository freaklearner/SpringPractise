package com.shub.model;

public class BaseBallCoach implements Coach {

	private FortuneService fs;
	
	public BaseBallCoach(FortuneService fs) {
		this.fs = fs;
	}
	@Override
	public String getDailyWorkout() {
		return "Do 30 mins batting";
	}
	
	@Override
	public String getFortune() {
		return fs.today();
	}
}
