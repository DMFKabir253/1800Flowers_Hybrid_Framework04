package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class storeLocator_Page extends BasePage{
	
	
	
	
	public @FindBy(xpath ="//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_Footer;
	//public @FindBy(xpath ="//img[contains(@alt,'1800Flowers.com')]") WebElement title_HomePage;
	public @FindBy(xpath ="//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_HomePage;
	//public @FindBy(xpath ="//a[contains(@name,'Sign In to Your Account')]") WebElement button_SignInFooter;
	public @FindBy(xpath ="//a[@href='/webapp/wcs/stores/servlet/LogonForm?langId=-1&storeId=20051&catalogId=13302'][contains(.,'Sign In to Your Account')]") WebElement button_SignInFooter;
	public @FindBy(xpath ="//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]") WebElement title_SignInPage;
	public @FindBy(xpath ="(//input[contains(@type,'text')])[2]") WebElement textfield_EmailAddress;
	public @FindBy(xpath ="(//input[contains(@id,'logonPassword')])[1]") WebElement textfield_Password;
	public @FindBy(xpath ="//input[contains(@alt,'Sign In')]") WebElement button_SignInMain;
	public @FindBy(xpath ="//div[@class='LN-Header'][contains(.,'My Account')]") WebElement title_AccountPage;
	//-------------------------------------------------------------------------------------------------------------
	public @FindBy(xpath ="//img[contains(@alt,'1800Flowers.com')]") WebElement button_1800Flowers;
	public @FindBy(xpath ="//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]") WebElement title_LandsOnMainPage;
	public @FindBy(xpath ="(//a[contains(.,'Store Locator')])[1]") WebElement button_StoreLocator;
	public @FindBy(xpath ="//h2[contains(.,'Flowers and Gifts for Every Occasion')]") WebElement title_StoreLocatorPage;
	public @FindBy(xpath ="//input[contains(@name,'zipcode')]") WebElement textfield_Zipcode;
	public @FindBy(xpath ="(//input[contains(@type,'image')])[1]") WebElement button_FindStores;
	public @FindBy(xpath ="//h1[contains(.,'Local  New York Florists')]") WebElement title_ResultsPage;
	public @FindBy(xpath ="(//a[@href='/us-ny/1-800-flowers-new-hyde-park'])[1]") WebElement button_OnDesiredLocation;
	public @FindBy(xpath ="//span[@itemprop='streetAddress'][contains(.,'2101 Hillside Ave.')]") WebElement title_LocationInfoPage;
	
	
	
	
	
	
	
	
	
	
	
public storeLocator_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



public storeLocator_Page getLoginPage() throws IOException {
	driver.get("https://www.1800flowers.com");
	return new storeLocator_Page();
	
}

public storeLocator_Page confirmLandsOnHomePage() throws IOException {
	WaitUntilWebElementIsVisible(title_HomePage);
	WebElement homePageTitle =driver.findElement(By.xpath("//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]"));
	Assert.assertEquals(true, homePageTitle.isDisplayed());
	return new storeLocator_Page();
	
}

public storeLocator_Page confirmLandsOnSignInFooter() throws IOException {
	WaitUntilWebElementIsVisible(title_Footer);
	WebElement footerVerification = driver.findElement(By.xpath("//div[@class='foot-title-big'][contains(.,'ACCOUNT LOGIN')]"));
    Assert.assertEquals(true, footerVerification.isDisplayed());
	return new storeLocator_Page();
}

public storeLocator_Page clickonSignIn() throws IOException, InterruptedException {
	waitAndClickElement(button_SignInFooter);
	return new storeLocator_Page();
	
}

public storeLocator_Page confirmLandsOnSignInPage() throws IOException {
	WebElement signInVerificationPage =driver.findElement(By.xpath("//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]"));
	Assert.assertEquals(true, signInVerificationPage.isDisplayed());
	
	return new storeLocator_Page();
	
}

public storeLocator_Page entersEmailAddress() throws Exception {
	
	sendKeysToWebElement(textfield_EmailAddress, "dewankabir100@gmail.com");
	
	return new storeLocator_Page();
	
}

public storeLocator_Page entersPassword() throws Exception {
	sendKeysToWebElement(textfield_Password, "Aa01920532258@");
	return new storeLocator_Page();
}

public storeLocator_Page clicksonSignInMain() throws InterruptedException, IOException {
	waitAndClickElement(button_SignInMain);
	return new storeLocator_Page();
}

public storeLocator_Page confirmsLandsOnAccountPage() throws IOException {
	WaitUntilWebElementIsVisible(title_AccountPage);
	WebElement verifyUserAccountPage =driver.findElement(By.xpath("//div[@class='LN-Header'][contains(.,'My Account')]"));
	Assert.assertEquals(true, verifyUserAccountPage.isDisplayed());
	return new storeLocator_Page();
}


public storeLocator_Page clickson1800Flowers() throws InterruptedException, IOException {
	waitAndClickElement(button_1800Flowers);
	return new storeLocator_Page();
}

public storeLocator_Page confirmsLandsOnHomePage() throws IOException {
	WaitUntilWebElementIsVisible(title_LandsOnMainPage);
	WebElement verifyHomePageforUser = driver.findElement(By.xpath("//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]"));
	Assert.assertEquals(true, verifyHomePageforUser.isDisplayed());
	return new storeLocator_Page();
}

public storeLocator_Page clicksonStorelocator() throws InterruptedException, IOException {
	waitAndClickElement(button_StoreLocator);
	return new storeLocator_Page();
}


public storeLocator_Page confirmsLandsLocatorPage() throws IOException {
	WaitUntilWebElementIsVisible(title_StoreLocatorPage);
	WebElement verifyHomePageforUser = driver.findElement(By.xpath("//h2[contains(.,'Flowers and Gifts for Every Occasion')]"));
	Assert.assertEquals(true, verifyHomePageforUser.isDisplayed());
	return new storeLocator_Page();
}

public storeLocator_Page entersZipcode() throws Exception {
	
	sendKeysToWebElement(textfield_Zipcode, "11423");
	
	return new storeLocator_Page();
	
}

public storeLocator_Page clicksonFindsStores() throws InterruptedException, IOException {
	waitAndClickElement(button_FindStores);
	return new storeLocator_Page();
}


public storeLocator_Page confirmsLandsonResultsPage() throws IOException {
	WaitUntilWebElementIsVisible(title_ResultsPage);
	WebElement verifyHomePageforUser = driver.findElement(By.xpath("//h1[contains(.,'Local  New York Florists')]"));
	Assert.assertEquals(true, verifyHomePageforUser.isDisplayed());
	return new storeLocator_Page();
}

public storeLocator_Page clicksonDesiredLocation() throws InterruptedException, IOException {
	waitAndClickElement(button_OnDesiredLocation);
	return new storeLocator_Page();
}



public storeLocator_Page confirmsLandsonLocationInfoPage() throws IOException {
	WaitUntilWebElementIsVisible(title_LocationInfoPage);
	WebElement verifyHomePageforUser = driver.findElement(By.xpath("//span[@itemprop='streetAddress'][contains(.,'2101 Hillside Ave.')]"));
	Assert.assertEquals(true, verifyHomePageforUser.isDisplayed());
	return new storeLocator_Page();
}

}
