package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before(order = 0)
	public void beforeScenario(){
		System.out.println("This will run before the every Scenario");
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario){
		System.out.println("This will run after the every Scenario");
		//https://www.guru99.com/take-screenshot-selenium-webdriver.html----Refer this one
		/*if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				//File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   
 
				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}*/
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
