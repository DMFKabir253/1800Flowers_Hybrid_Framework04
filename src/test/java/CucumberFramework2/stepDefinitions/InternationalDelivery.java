package CucumberFramework2.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class InternationalDelivery extends DriverFactory {

	@Given("^A validated user3$")
	public void a_validated_user3() throws Throwable {

		System.out.println("This is a valid User");
	}

	@When("^User browse to the site3$")
	public void user_browse_to_the_site3() throws Throwable {

		internationalDelivery.getLoginPage();
	}

	@When("^User navigates to the footer3$")
	public void user_navigates_to_the_footer3() throws Throwable {

		internationalDelivery.confirmLandsOnSignInFooter();
	}

	@Then("^User clicks on sign-in to account3$")
	public void user_clicks_on_sign_in_to_account3() throws Throwable {

		internationalDelivery.clickonSignIn();

	}

	@Then("^User should be taken to the sign-in page3$")
	public void user_should_be_taken_to_the_sign_in_page3() throws Throwable {

		internationalDelivery.confirmLandsOnSignInPage();

	}

	@Then("^User enters username3$")
	public void user_enters_username3() throws Throwable {

		internationalDelivery.entersEmailAddress();

	}

	@Then("^User enters Password3$")
	public void user_enters_Password3() throws Throwable {

		internationalDelivery.entersPassword();

	}

	@Then("^User Clicks on sign-in3$")
	public void user_Clicks_on_sign_in3() throws Throwable {

		internationalDelivery.clicksonSignInMain();
	}

	@Then("^User lands on home page3$")
	public void user_lands_on_home_page3() throws Throwable {

		Thread.sleep(4000);

		internationalDelivery.confirmsLandsOnAccountPage();
		internationalDelivery.clickson1800Flowers();
		internationalDelivery.confirmLandsOnHomePage();

	}

	@When("^User clicks on International Delivery$")
	public void user_clicks_on_International_Delivery() throws Throwable {

		internationalDelivery.clicksonInternationalDelivery();
	}

	@When("^User lands on International Delivery Page$")
	public void user_lands_on_International_Delivery_Page() throws Throwable {

		internationalDelivery.confirmsLandsOnInternationalDeliveryPage();

	}

	@When("^User enters designated country$")
	public void user_enters_designated_country() throws Throwable {

		internationalDelivery.entersDesignatedCountry();
	}

	@Then("^User clicks on the search button$")
	public void user_clicks_on_the_search_button() throws Throwable {

		internationalDelivery.clicksonSearchCountry();

	}

	@Then("^User should get results$")
	public void user_should_get_results() throws Throwable {

		internationalDelivery.cofirmUserReceivesErrorMessage();
	}

	@When("^User clicks on Internationl Delivery2$")
	public void user_clicks_on_Internationl_Delivery2() throws Throwable {

		internationalDelivery.clicksonInternationalDelivery();
	}

	@When("^User lands on International Delivery Page2$")
	public void user_lands_on_International_Delivery_Page2() throws Throwable {

		internationalDelivery.confirmsLandsOnInternationalDeliveryPage();

	}

	@When("^User enters designated country2$")
	public void user_enters_designated_country2() throws Throwable {

		internationalDelivery.entersDesignatedCountry2();
	}

	@Then("^User clicks on the search button2$")
	public void user_clicks_on_the_search_button2() throws Throwable {

		internationalDelivery.clicksonSearchCountry();
	}

	@Then("^User should get results2$")
	public void user_should_get_results2() throws Throwable {

		internationalDelivery.confirmUserLandsOnSearchResults();

	}

	@Then("^User clicks on Birthday$")
	public void user_clicks_on_Birthday() throws Throwable {

		internationalDelivery.clicksonBithday();

	}

	@Then("^User should lan on brthday results page$")
	public void user_should_lan_on_brthday_results_page() throws Throwable {

		internationalDelivery.confirmUserLandsOnBirthdayResults();

	}

}
