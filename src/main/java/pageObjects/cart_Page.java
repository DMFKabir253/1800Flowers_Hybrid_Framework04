package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class cart_Page extends BasePage {

	public @FindBy(xpath = "//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_Footer;
	// public @FindBy(xpath ="//img[contains(@alt,'1800Flowers.com')]") WebElement
	// title_HomePage;
	public @FindBy(xpath = "//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]") WebElement title_HomePage;
	// public @FindBy(xpath ="//a[contains(@name,'Sign In to Your Account')]")
	// WebElement button_SignInFooter;
	public @FindBy(xpath = "//a[@href='/webapp/wcs/stores/servlet/LogonForm?langId=-1&storeId=20051&catalogId=13302'][contains(.,'Sign In to Your Account')]") WebElement button_SignInFooter;
	public @FindBy(xpath = "//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]") WebElement title_SignInPage;
	public @FindBy(xpath = "(//input[contains(@type,'text')])[2]") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "(//input[contains(@id,'logonPassword')])[1]") WebElement textfield_Password;
	public @FindBy(xpath = "//input[contains(@alt,'Sign In')]") WebElement button_SignInMain;
	public @FindBy(xpath = "//div[@class='LN-Header'][contains(.,'My Account')]") WebElement title_AccountPage;
	// -------------------------------------------------------------------------------------------------------------
	public @FindBy(xpath = "//img[contains(@alt,'1800Flowers.com')]") WebElement button_1800Flowers;
	public @FindBy(xpath = "//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]") WebElement title_LandsOnMainPage;
	public @FindBy(xpath = "(//a[contains(@title,'Plants')])[11]") WebElement button_Plants;
	public @FindBy(xpath = "//h1[contains(.,'Plant Gifts')]") WebElement title_PlantsPage;
	public @FindBy(xpath = "//img[@src='//cdn2.1800flowers.com/wcsstore/Flowers/images/catalog/1870l120418x.jpg?height=378&width=345']") WebElement button_DishGarden;
	public @FindBy(xpath = "//h1[@itemprop='name'][contains(.,'Dish Garden with Fresh Cut Flowers')]") WebElement title_DishGardenPage;
	public @FindBy(xpath = "//span[@class='pdp__sku--desc'][contains(.,'Small')]") WebElement button_SmallSize;
	public @FindBy(xpath = "//input[@id='zipCode']") WebElement textfield_PostalCode;
	public @FindBy(xpath = "//select[contains(@id,'locationCode')]") WebElement button_DrpResidence;

	public @FindBy(xpath = "//a[contains(@id,'calendarLink')]") WebElement button_SelectDate;
	public @FindBy(xpath = "//h3[contains(.,'Select a delivery date below')]") WebElement title_SelectDatePopup;
	public @FindBy(xpath = "//div[@class='date'][contains(.,'18')]") WebElement button_ConfirmDate;
	public @FindBy(xpath = "(//select[contains(@event-data-change-method,'selectedAddonItem')])[3]") WebElement button_DrpSelectChocolate;
	public @FindBy(xpath = "//a[contains(@id,'addItemTocartButton')]") WebElement button_AddToCart;
	public @FindBy(xpath = "//span[@class='cartsubttl'][contains(.,'$79.98')]") WebElement title_ConfirmPriceInCart;
	public @FindBy(xpath = "//a[contains(.,'Continue Shopping >')]") WebElement button_ContinueShopping;
	public @FindBy(xpath = "(//select[contains(@event-data-change-method,'selectedAddonItem')])[3]") WebElement button_SelectChocolateSize;
	public @FindBy(xpath = "//input[contains(@id,'gn-zipcode-txt')]") WebElement tetxfield_Zipcode;
	public @FindBy(xpath = "//img[contains(@alt,'Submit this form')]") WebElement button_Search3;

	public cart_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public cart_Page getLoginPage() throws IOException {
		driver.get("https://www.1800flowers.com");
		return new cart_Page();

	}

	public cart_Page confirmLandsOnHomePage() throws IOException {
		WaitUntilWebElementIsVisible(title_HomePage);
		WebElement homePageTitle = driver
				.findElement(By.xpath("//img[contains(@alt,'Chris McCann, CEO & Jim McCann, Founder')]"));
		Assert.assertEquals(true, homePageTitle.isDisplayed());
		return new cart_Page();

	}

	public cart_Page confirmLandsOnSignInFooter() throws IOException {
		WaitUntilWebElementIsVisible(title_Footer);
		WebElement footerVerification = driver
				.findElement(By.xpath("//div[@class='foot-title-big'][contains(.,'ACCOUNT LOGIN')]"));
		Assert.assertEquals(true, footerVerification.isDisplayed());
		return new cart_Page();
	}

	public cart_Page clickonSignIn() throws IOException, InterruptedException {
		waitAndClickElement(button_SignInFooter);
		return new cart_Page();

	}

	public cart_Page confirmLandsOnSignInPage() throws IOException {
		WebElement signInVerificationPage = driver
				.findElement(By.xpath("//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]"));
		Assert.assertEquals(true, signInVerificationPage.isDisplayed());

		return new cart_Page();

	}

	public cart_Page entersEmailAddress() throws Exception {

		sendKeysToWebElement(textfield_EmailAddress, "dewankabir100@gmail.com");

		return new cart_Page();

	}

	public cart_Page entersPassword() throws Exception {
		sendKeysToWebElement(textfield_Password, "Aa01920532258@");
		return new cart_Page();
	}

	public cart_Page clicksonSignInMain() throws InterruptedException, IOException {
		waitAndClickElement(button_SignInMain);
		return new cart_Page();
	}

	public cart_Page confirmsLandsOnAccountPage() throws IOException {
		WaitUntilWebElementIsVisible(title_AccountPage);
		WebElement verifyUserAccountPage = driver
				.findElement(By.xpath("//div[@class='LN-Header'][contains(.,'My Account')]"));
		Assert.assertEquals(true, verifyUserAccountPage.isDisplayed());
		return new cart_Page();
	}

	public cart_Page clickson1800Flowers() throws InterruptedException, IOException {
		waitAndClickElement(button_1800Flowers);
		return new cart_Page();
	}

	public cart_Page confirmsLandsOnHomePage() throws IOException {
		WaitUntilWebElementIsVisible(title_LandsOnMainPage);
		WebElement verifyHomePageforUser = driver
				.findElement(By.xpath("//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]"));
		Assert.assertEquals(true, verifyHomePageforUser.isDisplayed());
		return new cart_Page();
	}

	public cart_Page clicksonPlants() throws InterruptedException, IOException {
		waitAndClickElement(button_Plants);
		return new cart_Page();
	}

	public cart_Page confirmsLandsOnPlantsPage() throws IOException {
		WaitUntilWebElementIsVisible(title_PlantsPage);
		WebElement verifyPlantsPage = driver.findElement(By.xpath("//h1[contains(.,'Plant Gifts')]"));
		Assert.assertEquals(true, verifyPlantsPage.isDisplayed());
		return new cart_Page();
	}

	public cart_Page clicksonDishGarden() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//img[contains(@alt,'Dish Garden with Fresh Cut Flowers')]")).click();
		return new cart_Page();
	}

	public cart_Page confirmsLandsOnDishGardenPage() throws IOException {
		WaitUntilWebElementIsVisible(title_DishGardenPage);
		WebElement verifyPlantInformationPage = driver
				.findElement(By.xpath("//h1[@itemprop='name'][contains(.,'Dish Garden with Fresh Cut Flowers')]"));
		Assert.assertEquals(true, verifyPlantInformationPage.isDisplayed());
		return new cart_Page();
	}

	public cart_Page selectsPlantSize() throws InterruptedException, IOException {
		waitAndClickElement(button_SmallSize);
		return new cart_Page();
	}

	public cart_Page entersPostalCode() throws Exception {
		sendKeysToWebElement(textfield_PostalCode, "11423");
		return new cart_Page();
	}

	public cart_Page selectResidenceType() throws IOException {
		WaitUntilWebElementIsVisible(button_DrpResidence);
		Select drpResidenceType = new Select(
				driver.findElement(By.xpath("//select[contains(@id,'locationCode')]")));
		drpResidenceType.selectByVisibleText("Residence");
		return new cart_Page();
	}

	public cart_Page selectDate() throws InterruptedException, IOException {
		waitAndClickElement(button_SelectDate);
		return new cart_Page();
	}

	public cart_Page confirmsPopupOpens() throws IOException {
		WaitUntilWebElementIsVisible(title_SelectDatePopup);
		WebElement verifyCalender = driver
				.findElement(By.xpath("//h3[contains(.,'Select a delivery date below')]"));
		Assert.assertEquals(true, verifyCalender.isDisplayed());
		return new cart_Page();
	}

	public cart_Page clicksonDesiredDate() throws InterruptedException, IOException {
		waitAndClickElement(button_ConfirmDate);
		return new cart_Page();
	}

	public cart_Page clicksonChocolate() throws InterruptedException, IOException {
		waitAndClickElement(button_DrpSelectChocolate);
		Select drpAdditional = new Select(driver
				.findElement(By.xpath("(//select[contains(@event-data-change-method,'selectedAddonItem')])[3]")));
		drpAdditional.selectByVisibleText("$19.99 - Large");
		return new cart_Page();
	}

	public cart_Page clicksonAddToCart() throws InterruptedException, IOException {
		waitAndClickElement(button_AddToCart);
		return new cart_Page();
	}

	public cart_Page confirmsPriceInCart() throws IOException {
		WaitUntilWebElementIsVisible(title_ConfirmPriceInCart);
		WebElement totalPriceofOrder = driver
				.findElement(By.xpath("//span[@class='cartsubttl'][contains(.,'$79.98')]"));
		Assert.assertEquals(true, totalPriceofOrder.isDisplayed());
		return new cart_Page();
	}

	public cart_Page entersZipCode() throws Exception {
		sendKeysToWebElement(tetxfield_Zipcode, "11423");
		return new cart_Page();
	}

	public cart_Page clicksonSearch3() throws InterruptedException, IOException {
		waitAndClickElement(button_Search3);
		return new cart_Page();
	}

}
