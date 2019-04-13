package CucumberFramework2.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class StoreLocator extends DriverFactory {

	@Given("^A validated user9$")
	public void a_validated_user9() throws Throwable {

		System.out.println("User will be testing the store locator page");
	}

	@When("^User browse to the site9$")
	public void user_browse_to_the_site9() throws Throwable {

		storelocator.getLoginPage();

	}

	@When("^User navigates to the footer9$")
	public void user_navigates_to_the_footer9() throws Throwable {

		storelocator.confirmLandsOnSignInFooter();

	}

	@Then("^User clicks on sign-in to account9$")
	public void user_clicks_on_sign_in_to_account9() throws Throwable {
		storelocator.clickonSignIn();

	}

	@Then("^User should be taken to the sign-in page9$")
	public void user_should_be_taken_to_the_sign_in_page9() throws Throwable {

		storelocator.confirmLandsOnSignInPage();

	}

	@Then("^User enters valid username9$")
	public void user_enters_valid_username9() throws Throwable {

		storelocator.entersEmailAddress();

	}

	@Then("^User enters valid password9$")
	public void user_enters_valid_password9() throws Throwable {

		storelocator.entersPassword();

	}

	@Then("^User clicks on Sign-In9$")
	public void user_clicks_on_Sign_In9() throws Throwable {

		storelocator.clicksonSignInMain();
	}

	@Then("^User should be taken to home page9$")
	public void user_should_be_taken_to_home_page9() throws Throwable {

		storelocator.confirmsLandsOnAccountPage();
		storelocator.clickson1800Flowers();
		storelocator.confirmLandsOnHomePage();

	}

	@Then("^User should be able to click the store locator button$")
	public void user_should_be_able_to_click_the_store_locator_button() throws Throwable {

		storelocator.clicksonStorelocator();
	}

	@Then("^User should land on the store locator page$")
	public void user_should_land_on_the_store_locator_page() throws Throwable {

		storelocator.confirmsLandsLocatorPage();
	}

	@Then("^User enters zipcode$")
	public void user_enters_zipcode() throws Throwable {

		storelocator.entersZipcode();
	}

	@Then("^User clicks on Find$")
	public void user_clicks_on_Find() throws Throwable {

		storelocator.clicksonFindsStores();
	}

	@Then("^User should be landing on results page$")
	public void user_should_be_landing_on_results_page() throws Throwable {

		storelocator.confirmsLandsonResultsPage();

	}

	@Then("^User clicks on the desired location$")
	public void user_clicks_on_the_desired_location() throws Throwable {

		storelocator.clicksonDesiredLocation();
	}

	@Then("^User should be taken to the location information page$")
	public void user_should_be_taken_to_the_location_information_page() throws Throwable {

		storelocator.confirmsLandsonLocationInfoPage();
	}

}
