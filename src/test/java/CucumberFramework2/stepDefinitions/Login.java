package CucumberFramework2.stepDefinitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



/***public class Login {**/

	
	
	/***WebDriver driver;
	
	
	@Before()
	public void setup() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DFKab\\Desktop\\1800Flowers_Cucumber\\CucumberFramework2\\src\\test\\java\\CucumberFramework2\\resources\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
} **/
	
	
	
	
	/***@Given("^Not a validated user$")
	public void not_a_validated_user() throws Throwable {
	    System.out.println("User is testing various email and password combinations");
	}

	@When("^User browse to the site4$")
	public void user_browse_to_the_site4() throws Throwable {
		driver.get("https://www.1800flowers.com");
	}

	@When("^User navigates to the footer4$")
	public void user_navigates_to_the_footer4() throws Throwable {
		 WebElement footerVerification5 = driver.findElement(By.xpath("(//div[contains(@class,'foot-title-big')])[6]"));
	     Assert.assertEquals(true, footerVerification5.isDisplayed());
	}

	@Then("^User clicks on sign-in to account4$")
	public void user_clicks_on_sign_in_to_account4() throws Throwable {
		driver.findElement(By.xpath("//a[contains(@title,'Sign In to Your Account')]")).click();
	}

	@Then("^User should be taken to the sign-in page4$")
	public void user_should_be_taken_to_the_sign_in_page4() throws Throwable {
		WebElement signInVerificationPage5 =driver.findElement(By.xpath("//div[@class='signInTitle'][contains(.,'Returning Customers, Sign In')]"));
		Assert.assertEquals(true, signInVerificationPage5.isDisplayed());
	}

	@When("^User enter user email as \"([^\"]*)\"$")
	public void user_enter_user_email_as(String EmailAddress) throws Throwable {
	    
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys(EmailAddress);
		
		
	}

	@When("^User enter user password as \"([^\"]*)\"$")
	public void user_enter_user_password_as(String Password) throws Throwable {
	    
		
		driver.findElement(By.xpath("(//input[contains(@id,'logonPassword')])[1]")).sendKeys(Password);
		
	}

	@When("^User clicks on Sign-In button$")
	public void user_clicks_on_Sign_In_button() throws Throwable {
	    
		driver.findElement(By.xpath("//input[contains(@alt,'Sign In')]")).click();
		
		
	}

	@Then("^(\\d+)flowers home page should display$")
	public void flowers_home_page_should_display(int arg1) throws Throwable {
	    
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//img[contains(@alt,'1800Flowers.com')]")).click();
	}

	@When("^User clicks on Sign-In$")
	public void user_clicks_on_Sign_In() throws Throwable {
	    
		driver.findElement(By.xpath("//input[contains(@alt,'Sign In')]")).click();
		
	}

	@Then("^Login error message should display$")
	public void login_error_message_should_display() throws Throwable {
		
		Thread.sleep(4000);
	    
		WebElement errorMessage = driver.findElement(By.xpath("//font[@color='red'][contains(.,'The email address and password you entered do not match any accounts on record. Passwords are case sensitive and must be entered exactly as entered when registering. If you forgot your password,')]"));
		Assert.assertEquals(true, errorMessage.isDisplayed());
	}

	@When("^User click the Forget Password Link$")
	public void user_click_the_Forget_Password_Link() throws Throwable {
	    driver.findElement(By.xpath("(//a[contains(.,'Forgot your password?')])[1]")).click();
	}

	@Then("^Forget Password page should display$")
	public void forget_Password_page_should_display() throws Throwable {
		
		Thread.sleep(3000);
	    
		
		WebElement forgotPasswordPage = driver.findElement(By.xpath("//td[@class='h1'][contains(.,'Need a New Password?')]"));
		Assert.assertEquals(true, forgotPasswordPage.isDisplayed());
	}

	@When("^When User enter user email as \"([^\"]*)\"$")
	public void when_User_enter_user_email_as(String forgotemail) throws Throwable {
	    
		driver.findElement(By.xpath("(//input[contains(@name,'logonId')])[1]")).sendKeys(forgotemail);
	}

	@When("^Click the submit button$")
	public void click_the_submit_button() throws Throwable {
	 
		driver.findElement(By.xpath("(//input[contains(@alt,'Submit')])[1]")).click();
	}

	@Then("^Thankyou page should display$")
	public void thankyou_page_should_display() throws Throwable {
		
		Thread.sleep(3000); 
	    
		
		WebElement confirmForgotPasswordPage = driver.findElement(By.xpath("//h1[contains(.,'Thank You!')]"));
		Assert.assertEquals(true, confirmForgotPasswordPage.isDisplayed());
		
		confirmForgotPasswordPage.getText();
		System.out.println(confirmForgotPasswordPage.getText());
	} 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
**/