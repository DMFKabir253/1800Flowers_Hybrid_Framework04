package CucumberFramework2.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/***public class Orders {**/
	
	/***WebDriver driver; 

	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DFKab\\Desktop\\1800Flowers_Cucumber\\CucumberFramework2\\src\\test\\java\\CucumberFramework2\\resources\\chromedriver.exe");
	this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

}**/ 
	
	/***
	@Given("^A validated user6$")
	public void a_validated_user6() throws Throwable {
	    System.out.println("This is a valid user testing the order page functionality");
	}

	@When("^User browse to the site6$")
	public void user_browse_to_the_site6() throws Throwable {
	    
		driver.get("https://www.1800flowers.com");
	}

	@When("^User navigates to the footer6$")
	public void user_navigates_to_the_footer6() throws Throwable {
		Thread.sleep(4000);
	    
		WebElement footerVerification7 = driver.findElement(By.xpath("//div[@class='foot-title-big'][contains(.,'ACCOUNT LOGIN')]"));
	     Assert.assertEquals(true, footerVerification7.isDisplayed());
	}

	@Then("^User clicks on sign-in to account6$")
	public void user_clicks_on_sign_in_to_account6() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@title,'Sign In to Your Account')]")).click();
	}

	@Then("^User should be taken to the sign-in page6$")
	public void user_should_be_taken_to_the_sign_in_page6() throws Throwable {
		
		WebElement signInVerificationPage7 =driver.findElement(By.xpath("//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]"));
		Assert.assertEquals(true, signInVerificationPage7.isDisplayed());
	}

	@Then("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
	    
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("dewankabir100@gmail.com");
	}

	@Then("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		
		driver.findElement(By.xpath("(//input[contains(@id,'logonPassword')])[1]")).sendKeys("Aa01920532258@");
	}

	@Then("^User clicks on Sign-In6$")
	public void user_clicks_on_Sign_In6() throws Throwable {

		driver.findElement(By.xpath("//input[contains(@alt,'Sign In')]")).click();
	}

	@Then("^User should be taken to home page$")
	public void user_should_be_taken_to_home_page() throws Throwable {


		
Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[contains(@alt,'1800Flowers.com')]")).click();
		Thread.sleep(3000);
	    
		WebElement verifyHomePageforUser8 = driver.findElement(By.xpath("//span[@data-color='#fff'][contains(.,'Need a Gift Now?')]"));
		Assert.assertEquals(true, verifyHomePageforUser8.isDisplayed());
		
		verifyHomePageforUser8.getText();
		
		System.out.println(verifyHomePageforUser8.getText());
		}
		
		
	

	@Then("^User clicks on My Orders$")
	public void user_clicks_on_My_Orders() throws Throwable {

driver.findElement(By.xpath("(//a[contains(.,'Track Your Order')])[3]")).click();
	}

	@Then("^User should be taken to track your orders page$")
	public void user_should_be_taken_to_track_your_orders_page() throws Throwable {

	Thread.sleep(4000);
	
	WebElement orderPageVerification = driver.findElement(By.xpath("//div[@class='titletext'][contains(.,'Track Your Orders')]"));
	Assert.assertEquals(true, orderPageVerification.isDisplayed());
		
		
		
		
	}


	
	
	
	
	
}
**/
