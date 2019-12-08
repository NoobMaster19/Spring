package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	//Field level injection
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}


	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}
	
	

}
