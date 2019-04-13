package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class account_Page extends BasePage {

	public @FindBy(xpath ="//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_Footer;
	//public @FindBy(xpath ="//img[@alt='1800Flowers.com']") WebElement title_HomePage;
	public @FindBy(xpath ="//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_HomePage;
	//public @FindBy(xpath ="//a[contains(@name,'Sign In to Your Account')]") WebElement button_SignInFooter;
	//a[@href='/webapp/wcs/stores/servlet/LogonForm?langId=-1&storeId=20051&catalogId=13302'][contains(.,'Sign In to Your Account')]
	public @FindBy(xpath = "//a[contains(.,'Sign In to Your Account')]") WebElement button_SignInFooter;
	public @FindBy(xpath ="//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]") WebElement title_SignInPage;
	public @FindBy(xpath ="(//input[contains(@type,'text')])[2]") WebElement textfield_EmailAddress;
	public @FindBy(xpath ="(//input[contains(@id,'logonPassword')])[1]") WebElement textfield_Password;
	public @FindBy(xpath ="//input[contains(@alt,'Sign In')]") WebElement button_SignInMain;
	public @FindBy(xpath ="//div[@class='LN-Header'][contains(.,'My Account')]") WebElement title_AccountPage;
	public @FindBy(xpath ="//a[contains(.,'Edit My Billing Address')]") WebElement button_BillingAddress;
	public @FindBy(xpath ="(//a[@href='#'])[3]") WebElement button_EditBillingAddress;
	public @FindBy(xpath ="//input[contains(@name,'billing_phone1')]") WebElement textfield_TelephoneNumber;
	public @FindBy(xpath ="//img[contains(@alt,'Save')]") WebElement button_SaveChanges;
	public @FindBy(xpath ="//strong[contains(.,'Your default billing address was successfully updated.')]") WebElement title_ConfirmChangesMessage;
	public @FindBy(xpath ="//a[contains(.,'Billing Addresses & Payment Methods')]") WebElement button_BillingAddress2;
	public @FindBy(xpath ="(//a[@href='#'])[3]") WebElement button_Edit2;
	public @FindBy(xpath ="//h1[contains(.,'Edit Billing Address')]") WebElement title_BillingAddressPage2;
	public @FindBy(xpath ="//input[contains(@id,'mobileCarrierFlagCheck')]") WebElement button_CheckBox;
	public @FindBy(xpath ="//img[contains(@alt,'Save')]") WebElement button_SaveChanges2;
	
	
	
	
	
	
public account_Page() throws IOException {
		super();
		
	}





public account_Page getLoginPage() throws IOException { 
	driver.get("https://www.1800flowers.com");
	return new account_Page();
	
}

public account_Page confirmLandsOnHomePage() throws IOException {
	WaitUntilWebElementIsVisible(title_HomePage);
	WebElement homePageTitle =driver.findElement(By.xpath("//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]"));
	Assert.assertEquals(true, homePageTitle.isDisplayed());
	return new account_Page();
	
}

public account_Page confirmLandsOnSignInFooter() throws IOException {
	WaitUntilWebElementIsVisible(title_Footer);
	WebElement footerVerification = driver.findElement(By.xpath("(//img[contains(@alt,'Veterans Advantage logo')])[2]"));
    Assert.assertEquals(true, footerVerification.isDisplayed());
	return new account_Page();
}

public account_Page clickonSignIn() throws IOException, InterruptedException {
	waitAndClickElement(button_SignInFooter);
	return new account_Page();
	
}

public account_Page confirmLandsOnSignInPage() throws IOException {
	WebElement signInVerificationPage =driver.findElement(By.xpath("//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]"));
	Assert.assertEquals(true, signInVerificationPage.isDisplayed());
	
	return new account_Page();
	
}

public account_Page entersEmailAddress() throws Exception {
	
	sendKeysToWebElement(textfield_EmailAddress, "dewankabir100@gmail.com");
	
	return new account_Page();
	
}

public account_Page entersPassword() throws Exception {
	sendKeysToWebElement(textfield_Password, "Aa01920532258@");
	return new account_Page();
}

public account_Page clicksonSignInMain() throws InterruptedException, IOException {
	waitAndClickElement(button_SignInMain);
	return new account_Page();
}

public account_Page confirmsLandsOnAccountPage() throws IOException {
	WaitUntilWebElementIsVisible(title_AccountPage);
	WebElement verifyUserAccountPage =driver.findElement(By.xpath("//div[@class='LN-Header'][contains(.,'My Account')]"));
	Assert.assertEquals(true, verifyUserAccountPage.isDisplayed());
	return new account_Page();
}

public account_Page clicksOnBillingAddress() throws InterruptedException, IOException {
	waitAndClickElement(button_BillingAddress);
	return new account_Page();
}

public account_Page clicksOnEdit() throws InterruptedException, IOException {
	waitAndClickElement(button_EditBillingAddress);
	return new account_Page();
}

public account_Page entersPhoneNumber() throws Exception {
	sendKeysToWebElement(textfield_TelephoneNumber, "3474588569");
	return new account_Page();
}

public account_Page savesTelephoneNumber() throws Exception {
	waitAndClickElement(button_SaveChanges);
	return new account_Page();
}

public account_Page confirmChangesAreSaved() throws IOException {
	WaitUntilWebElementIsVisible(title_ConfirmChangesMessage);
	WebElement confirmChanges =driver.findElement(By.xpath("//strong[contains(.,'Your default billing address was successfully updated.')]"));
	Assert.assertEquals(true, confirmChanges.isDisplayed());
	return new account_Page();
}

public account_Page clicksOnBillingAddressAgain() throws Exception {
	waitAndClickElement(button_BillingAddress2);;
	return new account_Page();
}
public account_Page clicksOnEdit2() throws Exception {
	waitAndClickElement(button_Edit2);;
	return new account_Page();
}

public account_Page confirmLandsOnBillingPage2() throws IOException {
	WaitUntilWebElementIsVisible(title_BillingAddressPage2);
	WebElement confirmBillingPage = driver.findElement(By.xpath("//h1[contains(.,'Edit Billing Address')]"));
	Assert.assertEquals(true, confirmBillingPage.isDisplayed());
	return new account_Page();
}

public account_Page clicksOnCheckBox() throws Exception {
	waitAndClickElement(button_CheckBox);;
	return new account_Page();
}
public account_Page savesChangesAgain() throws Exception {
	waitAndClickElement(button_SaveChanges2);;
	return new account_Page();
}








}
