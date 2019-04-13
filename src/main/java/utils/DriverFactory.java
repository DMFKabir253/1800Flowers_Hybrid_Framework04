package utils;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BasePage;
import pageObjects.account_Page;
import pageObjects.cart_Page;
import pageObjects.internationalDelivery_Page;
import pageObjects.storeLocator_Page;
import utils.Constant;

public class DriverFactory {
	public static WebDriver driver;
	public static BasePage basepage;
	public static account_Page accountPage;
	public static cart_Page cartPage;
	public static DriverFactory instance = null;
	public static internationalDelivery_Page internationalDelivery;
	public static storeLocator_Page storelocator;

	public static final String LOCAL_GRID_URL ="http://localhost:4444/wd/hub";
	
	 //public static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
	
	private static final String USERNAME = "dewankabir2";
    private static final String AUTOMATE_KEY = "mqZrceJFHWypkXkgsT5w";
    private static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@SuppressWarnings("deprecation")
	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "firefox":
				// code
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			/***case "chrome":
				// code
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					ChromeOptions chromeOptions = new ChromeOptions();

					
					driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL), chromeOptions);
					//driver = new ChromeDriver();
					//driver.manage().window().maximize();
				}
				break;**/
				
				
			case "grid_firefox":
				// code
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities caps = new DesiredCapabilities();
					caps.setPlatform(Platform.ANY);
					caps.setBrowserName("firefox");
					
					
					
					
					driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps);
				}
				break;
				
				
			case "grid_chrome":
				// code
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					DesiredCapabilities caps = new DesiredCapabilities();
					caps.setPlatform(Platform.ANY);
					caps.setBrowserName("chrome");
					
					/***
					 try {
				            drivers.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL),caps));
				        } catch (MalformedURLException e) {
				            e.printStackTrace();
				        } **/
					
					
					
					
					driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps);
				}
				break;
				
				
			case "grid_chrome_cloud":
				// code
				if (driver == null) {
					
					DesiredCapabilities caps = new DesiredCapabilities();
				    caps.setCapability("browser", "Chrome");
				    caps.setCapability("browser_version", "69.0");
				    caps.setCapability("os", "Windows");
				    caps.setCapability("os_version", "7");
				    caps.setCapability("resolution", "1920x1080");

		            
		            
		            
		            URL remoteURL = new URL(URL);
		            driver = new RemoteWebDriver(remoteURL, caps);
					
					//driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps);
				}
				break;
				
				
			case "grid_chrome_cloud_Windows10":
				// code
				if (driver == null) {
					
					 DesiredCapabilities caps = new DesiredCapabilities();
					    caps.setCapability("browser", "Chrome");
					    caps.setCapability("browser_version", "72.0");
					    caps.setCapability("os", "Windows");
					    caps.setCapability("os_version", "10");
					    caps.setCapability("resolution", "1024x768");
					    caps.setCapability("browserstack.debug", "true");

		            
		            
		            
		            URL remoteURL = new URL(URL);
		            driver = new RemoteWebDriver(remoteURL, caps);
					
					//driver = new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps);
				}
				break;
				
	// ------------------------------------------------------------------------------------------------------
				
				
			/***
			 * case "grid_chrome_32":
			 
				// code
				if (null == driver) {
					DesiredCapabilities caps =new DesiredCapabilities();
					caps.setPlatform(Platform.WINDOWS);
					caps.setBrowserName("chrome");
					try {
						instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
					}catch (MalformedURLException e) {
						e.printStackTrace();
					}
					
				}
				break;
				
			case "grid_firefox_32":
				// code
				if (null == driver) {
					DesiredCapabilities caps =new DesiredCapabilities();
					caps.setPlatform(Platform.WINDOWS);
					caps.setBrowserName("firefox");
					try {
						instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
					}catch (MalformedURLException e) {
						e.printStackTrace();
					}
					
				}
				break;
				
			case "grid_ie_32":
				// code
				if (null == driver) {
					DesiredCapabilities caps =new DesiredCapabilities();
					caps.setPlatform(Platform.WINDOWS);
					caps.setBrowserName("internet explorer");
					try {
						instance.driver.set(new RemoteWebDriver(new URL(LOCAL_GRID_URL), caps));
					}catch (MalformedURLException e) {
						e.printStackTrace();
					}
					
				}
				break;
				
				**/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	//-------------------------------------------------------------------------------------------------------			

			case "ie":
				// code
				if (driver == null) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			basepage = PageFactory.initElements(driver, BasePage.class);
			accountPage = PageFactory.initElements(driver, account_Page.class);
			cartPage = PageFactory.initElements(driver, cart_Page.class);
			internationalDelivery = PageFactory.initElements(driver, internationalDelivery_Page.class);
			storelocator = PageFactory.initElements(driver, storeLocator_Page.class);

		}
		return driver;
	}
}
