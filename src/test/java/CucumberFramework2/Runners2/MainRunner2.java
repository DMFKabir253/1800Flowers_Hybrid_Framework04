package CucumberFramework2.Runners2;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/CucumberFramework2/featuresUnderTest" }, glue = {
		"CucumberFramework2.stepDefinitions" }, monochrome = true, tags = {}, 
				plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })


public class MainRunner2 {

}
