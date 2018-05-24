package com.cucumber.TestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		dryRun=false,
		//Features files - Gherkin language - User Stories
		features={"src/test/resources/Features"},
		//TestSuites
		glue= {"com/cucumber/stepdef/"},
		//Reporting Structure
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				}
	
		)

public class ScenarioOneTestRunner extends AbstractTestNGCucumberTests {

	
}





