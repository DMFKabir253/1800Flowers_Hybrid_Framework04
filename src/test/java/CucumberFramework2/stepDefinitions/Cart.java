package CucumberFramework2.stepDefinitions;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class Cart extends DriverFactory {

	@Given("^A validated user2$")
	public void a_validated_user2() throws Throwable {
		System.out.println("User has access to site");
	}

	@When("^User browse to the site2$")
	public void user_browse_to_the_site2() throws Throwable {
		cartPage.getLoginPage();
	}

	@When("^User navigates to the footer2$")
	public void user_navigates_to_the_footer2() throws Throwable {

		cartPage.confirmLandsOnSignInFooter();
	}

	@Then("^User clicks on sign-in to account2$")
	public void user_clicks_on_sign_in_to_account2() throws Throwable {

		cartPage.clickonSignIn();
	}

	@Then("^User should be taken to the sign-in page2$")
	public void user_should_be_taken_to_the_sign_in_page2() throws Throwable {

		cartPage.confirmLandsOnSignInPage();

	}

	@Then("^User enters valid username2$")
	public void user_enters_valid_username2() throws Throwable {

		cartPage.entersEmailAddress();

	}

	@Then("^User enters valid password2$")
	public void user_enters_valid_password2() throws Throwable {

		cartPage.entersPassword();

	}

	@Then("^User clicks on Sign-In2$")
	public void user_clicks_on_Sign_In2() throws Throwable {

		cartPage.clicksonSignInMain();
	}

	@Then("^User should be taken to home page2$")
	public void user_should_be_taken_to_home_page2() throws Throwable {
		Thread.sleep(4000);

		cartPage.confirmsLandsOnAccountPage();
		cartPage.clickson1800Flowers();
		cartPage.confirmLandsOnHomePage();

	}

	@Then("^Click on plants$")
	public void click_on_plants() throws Throwable {

		cartPage.clicksonPlants();
	}

	@Then("^User should be taken to plan results page$")
	public void user_should_be_taken_to_plan_results_page() throws Throwable {

		cartPage.confirmsLandsOnPlantsPage();

	}

	@Then("^User clicks on Dish Garden with Fresh Cut Flowers$")
	public void user_clicks_on_Dish_Garden_with_Fresh_Cut_Flowers() throws Throwable {

		cartPage.entersZipCode();
		cartPage.clicksonSearch3();
		Thread.sleep(6000);
		cartPage.clicksonDishGarden();

	}

	@Then("^User should be taken to the plants information page$")
	public void user_should_be_taken_to_the_plants_information_page() throws Throwable {

		cartPage.confirmsLandsOnDishGardenPage();

	}

	@Then("^User clicks on large$")
	public void user_clicks_on_large() throws Throwable {

		// driver.findElement(By.xpath("(//span[contains(@class,'productprice')])[1]")).click();
	}

	@Then("^User clicks on medium$")
	public void user_clicks_on_medium() throws Throwable {

		// driver.findElement(By.xpath("//span[@class='pdp__sku--desc'][contains(.,'Medium')]")).click();

	}

	@Then("^User clicks on small$")
	public void user_clicks_on_small() throws Throwable {

		cartPage.selectsPlantSize();

	}

	@Then("^User enters the postal code$")
	public void user_enters_the_postal_code() throws Throwable {

		cartPage.entersPostalCode();
	}

	@Then("^User selects residence type$")
	public void user_selects_residence_type() throws Throwable {

		cartPage.selectResidenceType();
	}

	@Then("^User clicks on date$")
	public void user_clicks_on_date() throws Throwable {

		cartPage.selectDate();

	}

	@Then("^User is presented witha popup to slect the date$")
	public void user_is_presented_witha_popup_to_slect_the_date() throws Throwable {

		cartPage.confirmsPopupOpens();

	}

	@Then("^User selects the date$")
	public void user_selects_the_date() throws Throwable {

		cartPage.clicksonDesiredDate();
	}

	@Then("^User cliks on the chocolate option and selects large$")
	public void user_cliks_on_the_chocolate_option_and_selects_large() throws Throwable {

		cartPage.clicksonChocolate();
	}

	@Then("^User should be taken to the confirmation page$")
	public void user_should_be_taken_to_the_confirmation_page() throws Throwable {

		cartPage.clicksonAddToCart();
	}

	@Then("^Verify the price in the cart should be \\$(\\d+)\\.(\\d+)$")
	public void verify_the_price_in_the_cart_should_be_$(int arg1, int arg2) throws Throwable {

		cartPage.confirmsPriceInCart();
	}

	@Then("^User clicks on continue shopping$")
	public void user_clicks_on_continue_shopping() throws Throwable {

		driver.findElement(By.xpath("//a[contains(.,'Continue Shopping >')]")).click();
	}

	@Then("^User clicks on checkout$")
	public void user_clicks_on_checkout() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User will continue shopping");
	}

	@Then("^User should be landing on checkout page$")
	public void user_should_be_landing_on_checkout_page() throws Throwable {
		System.out.println("User will continue shopping");
	}

}
