package CucumberFramework2.stepDefinitions;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author DFKab
 *
 */
public class Account extends DriverFactory {

	/***
	 * DesiredCapabilities cap = null;
	 * 
	 * if(b.equals("firefox")){ cap = DesiredCapabilities.firefox();
	 * cap.setBrowserName("firefox"); cap.setPlatform(Platform.ANY); }else if
	 * (b.equals("chrome")){ cap = DesiredCapabilities.chrome();
	 * cap.setBrowserName("chrome"); cap.setPlatform(Platform.ANY); }else if
	 * (b.equals("iexplore")){ cap = DesiredCapabilities.internetExplorer();
	 * cap.setBrowserName("iexplore"); cap.setPlatform(Platform.WINDOWS); }
	 * 
	 * driver = new RemoteWebDriver(new
	 * URL("http://192.168.99.100:4446/wd/hub"),cap);
	 **/

	@Given("^A validated user$")
	public void a_validated_user() throws Throwable {
		accountPage.getLoginPage();
	}

	@When("^User browse to the site$")
	public void user_browse_to_the_site() throws Throwable {

		accountPage.confirmLandsOnHomePage();

	}

	@When("^User navigates to the footer$")
	public void user_navigates_to_the_footer() throws Throwable {

		accountPage.confirmLandsOnSignInFooter();

	}

	@Then("^User clicks on sign-in to account$")
	public void user_clicks_on_sign_in_to_account() throws Throwable {

		Thread.sleep(9000);

		accountPage.clickonSignIn();
	}

	@Then("^User should be taken to the sign-in page$")
	public void user_should_be_taken_to_the_sign_in_page() throws Throwable {
		Thread.sleep(3000);

		accountPage.confirmLandsOnSignInPage();
		accountPage.entersEmailAddress();
		accountPage.entersPassword();
		accountPage.clicksonSignInMain();

	}

	@Then("^User clicks on account tab$")
	public void user_clicks_on_account_tab() throws Throwable {
		System.out.println("The User has successfully taken to the Account Page");
	}

	@Then("^User should land on account page$")
	public void user_should_land_on_account_page() throws Throwable {

		accountPage.confirmsLandsOnAccountPage();
	}

	@When("^User clicks on Billing Address$")
	public void user_clicks_on_Billing_Address() throws Throwable {

		accountPage.clicksOnBillingAddress();

	}

	@When("^User clicks edit$")
	public void user_clicks_edit() throws Throwable {
		Thread.sleep(3000);

		accountPage.clicksOnEdit();
	}

	@When("^User changes the telephone number$")
	public void user_changes_the_telephone_number() throws Throwable {
		Thread.sleep(3000);

		accountPage.entersPhoneNumber();
	}

	@Then("^User clicks the save button$")
	public void user_clicks_the_save_button() throws Throwable {

		accountPage.savesTelephoneNumber();
	}

	@Then("^User should get confirmation message$")
	public void user_should_get_confirmation_message() throws Throwable {

		Thread.sleep(4000);

		accountPage.confirmChangesAreSaved();

	}

	@When("^User clicks on Billing address$")
	public void user_clicks_on_Billing_address() throws Throwable {

		accountPage.clicksOnBillingAddressAgain();

	}

	@When("^User clicks on edit$")
	public void user_clicks_on_edit() throws Throwable {

		Thread.sleep(4000);

		accountPage.clicksOnEdit2();
		// System.out.println("This feature is under development");

	}

	@When("^User should be taken to billing Information page$")
	public void user_should_be_taken_to_billing_Information_page() throws Throwable {

		Thread.sleep(4000);

		accountPage.confirmLandsOnBillingPage2();
		// System.out.println("This feature is under development");
	}

	@Then("^User clicks the checkbox to sign up for exclusive discounts$")
	public void user_clicks_the_checkbox_to_sign_up_for_exclusive_discounts() throws Throwable {

		// accountPage.clicksOnCheckBox();
		// accountPage.savesChangesAgain();
		System.out.println("This feature is under development");

	}

}
