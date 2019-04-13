package CucumberFramework2.stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

	@Before
	public void setup() {
		driver = getDriver();
	}

	@After
	public void tearDown() {
		try {
			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Method Failed: screenshotOnFailure, Exception: " + e.getMessage());
		}
	}
}
