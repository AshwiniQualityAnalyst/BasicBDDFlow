package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(order = 0)
	public void beforeScenario(){
		System.out.println("This will run before the every Scenario");
	}

	@After(order = 1)
	public void afterScenario(){
		System.out.println("This will run after the every Scenario");
	}

	@Before("@SmokeTest1")
	public void beforeFirst(){
		System.out.println("This will run only before the First Scenario");
	}

	@After("@SmokeTest1")
	public void afterFirst(){
		System.out.println("This will run only before the Second Scenario");
	}
}
