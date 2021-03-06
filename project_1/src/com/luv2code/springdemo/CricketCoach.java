package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;

	private String emailAdress;

	public String getTeam() {
		return team;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("emailadress setter for Cricket Coach");
		this.emailAdress = emailAdress;
	}

	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}

	public CricketCoach(FortuneService fortuneService) {
		setFortuneService(fortuneService);
	}


	// Setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Wicked Wickets dude!";
	}

	@Override
	public String getDailyFortune() {
		return "Crickets chirping... " + fortuneService.getFortune();
	}

	public void init() {
		System.out.println("Cricket coach init");
	}

	public void destroy() {
		System.out.println("Cricket coach destroy");
	}
}
