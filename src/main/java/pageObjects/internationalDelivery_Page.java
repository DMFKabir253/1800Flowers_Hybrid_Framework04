package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class internationalDelivery_Page extends BasePage {

	public @FindBy(xpath = "//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_Footer;
	// public @FindBy(xpath ="//img[contains(@alt,'1800Flowers.com')]") WebElement
	// title_HomePage;
	public @FindBy(xpath = "//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_HomePage;
	public @FindBy(xpath = "//a[contains(.,'Sign In to Your Account')]") WebElement button_SignInFooter;
	public @FindBy(xpath = "//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]") WebElement title_SignInPage;
	public @FindBy(xpath = "(//input[contains(@type,'text')])[2]") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "(//input[contains(@id,'logonPassword')])[1]") WebElement textfield_Password;
	// public @FindBy(xpath ="//input[contains(@alt,'Sign In')]") WebElement
	// button_SignInMain;
	// a[@href='/webapp/wcs/stores/servlet/LogonForm?langId=-1&storeId=20051&catalogId=13302'][contains(.,'Sign
	// In to Your Account')]
	public @FindBy(xpath = "//a[@href='/webapp/wcs/stores/servlet/LogonForm?langId=-1&storeId=20051&catalogId=13302'][contains(.,'Sign In to Your Account')]") WebElement button_SignInMain;
	// public @FindBy(xpath ="//div[@class='LN-Header'][contains(.,'My Account')]")
	// WebElement title_AccountPage;
	// span[contains(.,'RADIO OFFERS | CLICK HERE >')]
	public @FindBy(xpath = "//span[contains(.,'RADIO OFFERS | CLICK HERE >')]") WebElement title_AccountPage;
	public @FindBy(xpath = "//img[contains(@alt,'1800Flowers.com')]") WebElement button_1800Flowers;
	public @FindBy(xpath = "//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]") WebElement title_LandsOnMainPage;
	public @FindBy(xpath = "//a[contains(@class,'link-inter-a')]") WebElement button_InternationalDelivery;
	public @FindBy(xpath = "//h2[contains(.,'Shop By Delivery Country')]") WebElement title_InternationalDelivery;
	public @FindBy(xpath = "//input[contains(@class,'country-textfield')]") WebElement textfield_DeliveryCountry;
	public @FindBy(xpath = "//input[contains(@class,'country-btn')]") WebElement button_Search;
	public @FindBy(xpath = "//td[contains(@class,'searchpageerror')]") WebElement title_SearchPage;
	public @FindBy(xpath = "//span[contains(.,'Need a Gift Now?')]") WebElement title_CanadianResults;
	public @FindBy(xpath = "//h2[@class='mini-coll-title'][contains(.,'BIRTHDAY')]") WebElement button_BirthdayCanadian;
	public @FindBy(xpath = "//div[@class='Product__name'][contains(.,'Floral Treasures Bouquet™')]") WebElement title_CanadianBirthdayPage;

	public internationalDelivery_Page() throws IOException {
		super();

	}

	public internationalDelivery_Page getLoginPage() throws IOException {
		driver.get("https://www.1800flowers.com");
		return new internationalDelivery_Page();

	}

	public internationalDelivery_Page confirmLandsOnHomePage() throws IOException {
		WaitUntilWebElementIsVisible(title_HomePage);
		WebElement homePageTitle = driver
				.findElement(By.xpath("//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]"));
		Assert.assertEquals(true, homePageTitle.isDisplayed());
		return new internationalDelivery_Page();

	}

	public internationalDelivery_Page confirmLandsOnSignInFooter() throws IOException {
		WaitUntilWebElementIsVisible(title_Footer);
		WebElement footerVerification = driver
				.findElement(By.xpath("//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]"));
		Assert.assertEquals(true, footerVerification.isDisplayed());
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page clickonSignIn() throws IOException, InterruptedException {
		waitAndClickElement(button_SignInFooter);
		return new internationalDelivery_Page();

	}

	public internationalDelivery_Page confirmLandsOnSignInPage() throws IOException {
		WebElement signInVerificationPage = driver
				.findElement(By.xpath("//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]"));
		Assert.assertEquals(true, signInVerificationPage.isDisplayed());

		return new internationalDelivery_Page();

	}

	public internationalDelivery_Page entersEmailAddress() throws Exception {

		sendKeysToWebElement(textfield_EmailAddress, "dewankabir100@gmail.com");

		return new internationalDelivery_Page();

	}

	public internationalDelivery_Page entersPassword() throws Exception {
		sendKeysToWebElement(textfield_Password, "Aa01920532258@");
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page clicksonSignInMain() throws InterruptedException, IOException {
		waitAndClickElement(button_SignInMain);
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page confirmsLandsOnAccountPage() throws IOException {
		WaitUntilWebElementIsVisible(title_AccountPage);
		WebElement verifyUserAccountPage = driver
				.findElement(By.xpath("//span[contains(.,'RADIO OFFERS | CLICK HERE >')]"));
		Assert.assertEquals(true, verifyUserAccountPage.isDisplayed());
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page clickson1800Flowers() throws InterruptedException, IOException {
		waitAndClickElement(button_1800Flowers);
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page confirmsLandsOnHomePage() throws IOException {
		WaitUntilWebElementIsVisible(title_LandsOnMainPage);
		WebElement verifyHomePageforUser = driver
				.findElement(By.xpath("//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]"));
		Assert.assertEquals(true, verifyHomePageforUser.isDisplayed());
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page clicksonInternationalDelivery() throws InterruptedException, IOException {
		waitAndClickElement(button_InternationalDelivery);
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page confirmsLandsOnInternationalDeliveryPage() throws IOException {
		WaitUntilWebElementIsVisible(title_InternationalDelivery);
		WebElement verifyInternationalDeliveryPage = driver
				.findElement(By.xpath("//h2[contains(.,'Shop By Delivery Country')]"));
		Assert.assertEquals(true, verifyInternationalDeliveryPage.isDisplayed());
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page entersDesignatedCountry() throws Exception {
		sendKeysToWebElement(textfield_DeliveryCountry, "Bangladesh");
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page clicksonSearchCountry() throws InterruptedException, IOException {
		waitAndClickElement(button_Search);
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page cofirmUserReceivesErrorMessage() throws IOException {

		WebElement verifyNoResultsMessage = driver.findElement(By.xpath("//td[contains(@class,'searchpageerror')]"));
		Assert.assertEquals(true, verifyNoResultsMessage.isDisplayed());
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page entersDesignatedCountry2() throws Exception {
		sendKeysToWebElement(textfield_DeliveryCountry, "Canada");
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page confirmUserLandsOnSearchResults() throws IOException {
		WaitUntilWebElementIsVisible(title_CanadianResults);
		WebElement verifyResultsPage = driver.findElement(By.xpath("//span[contains(.,'Need a Gift Now?')]"));
		Assert.assertEquals(true, verifyResultsPage.isDisplayed());
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page clicksonBithday() throws InterruptedException, IOException {
		waitAndClickElement(button_BirthdayCanadian);
		return new internationalDelivery_Page();
	}

	public internationalDelivery_Page confirmUserLandsOnBirthdayResults() throws IOException {
		WaitUntilWebElementIsVisible(title_CanadianBirthdayPage);
		WebElement birthdayResultsPage = driver
				.findElement(By.xpath("//div[@class='Product__name'][contains(.,'Floral Treasures Bouquet™')]"));
		Assert.assertEquals(true, birthdayResultsPage.isDisplayed());
		return new internationalDelivery_Page();
	}

}
