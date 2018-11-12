package cucumberTest;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "Feature"

		, glue = { "stepDefinition" }

		// ,plugin = {"pretty"}

		// ,plugin = {"pretty", "html:target/cucumber-reports"}

		// ,plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"}

		// ,plugin = {"pretty", "junit:target/cucumber-reports/Cucumber.xml"}

		// ,plugin = {"usage"}

		// Generate all together all the reports
		// , plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		// "junit:target/cucumber-reports/Cucumber.xml",
		// "html:target/cucumber-reports" }

		// Now generate extent reports
		, plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html" }

		, monochrome = true

// , tags = { "@SmokeTest1" }
)

public class TestRunner {
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");

	}

}
