package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	/*
	static
	{
		System.out.print("Tennis Coach : ");
	}
	*/
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;


/*	//constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}
*/	
	//default constructor
	public TennisCoach()
	{
		System.out.println(">>Inside tennisCoach default constructor");
	}
	
	
	//define my init  method
	@PostConstruct
	public void doMyStartUpStaff()
	{
		System.out.println(">>TennisCoach:inside of doMyStartUpStaff");
	}
	
	@PreDestroy
	public void doMyCleanUpStaff()
	{
		System.out.println(">>TennisCoach:inside of doMyCleanUpStaff");
	}
/*	@Autowired
	//define a setter method
	public void doSomeCrazyStuff(FortuneService theFortuneService)
	{
		System.out.println(">>Inside tennisCoach inside doSomeCrazyStuff() method");
		fortuneService=theFortuneService;
	}
	*/
	
	
	
	//define my init method 
	public void doMyStartStuff()
	{
		System.out.println(">>Tenniscoach :inside of doMyStartUpStiff()");
	}
	
	// define my destory method
	
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Coach :Pratice your back hand volley";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	

}
