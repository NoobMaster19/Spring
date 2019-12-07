 package com.luv2code.springdemo;

public class CricketCoach implements Coach   {

	private FortuneService fortuneService;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach:inside setter method setEmailAddress ");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket Coach:inside setter method setTeam ");

		this.team = team;
	}

	//add private fields
	private String emailAddress;
	private String team;
	
	
	//create a no args constructor
	public CricketCoach()
	{
		System.out.println("Cricket Coach:inside no args constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket Coach:inside setter method setFortuneService ");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
