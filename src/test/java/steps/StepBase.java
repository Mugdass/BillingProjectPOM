package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Page.ToBillingPagePage;
import Page.ToCustomerInvoicePageToValidateDataPagePage;
import Page.ToListPagePage;
import Page.ToNewInvoicePagePage;


public class StepBase {

	static WebDriver driver;
	
ToBillingPagePage tobillingpagepage;
	
	ToNewInvoicePagePage tonewinvoicepagepage;
	
	ToListPagePage tolistpagepage;
	
	
	ToCustomerInvoicePageToValidateDataPagePage tocustomerinvoicepagetovalidatedatapagepage;
	
	@io.cucumber.java.Before
	public void before() {
		
System.setProperty("webdriver.chrome.driver", "/Users/matas/Downloads/chromedriver");
		
ChromeOptions handleNotifications = new ChromeOptions();

handleNotifications.addArguments("--disable-notifications");

driver = new ChromeDriver(handleNotifications);
		
	    driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   
	    	    
	        }
	       
	
	


	@io.cucumber.java.After
	public void after() throws InterruptedException {
		
		Thread.sleep(7000);
	   driver.quit();
	}
	
	
	
	
	
	
	
	
	@BeforeMethod
	public void logIn() {
		
		
		WebElement ClickOnDemoProfile = driver.findElement(By.xpath("//div[text()='Company manufacturing products']"));
		
		ClickOnDemoProfile.click();
		
		
WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		Actions a = new Actions(driver);
			
		a.doubleClick(password);
		a.perform();
		
		password.clear();
		password.sendKeys("demo");
		
		password.sendKeys(Keys.ENTER);
		
		
		
		
		
		
WebElement loginbutton = driver.findElement(By.xpath("//input[@class='button']"));
		
		loginbutton.click();
		
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void logOut() throws InterruptedException {
		
		
		WebElement ClickOnDropDownLogOut = driver.findElement(By.xpath("//img[@class='photouserphoto photouserphoto userphoto photologo__photos_thumbs_person__small_jpeg']"));
		
		ClickOnDropDownLogOut.click();
		
	
		
		
		
		WebElement ClickOnLogOut = driver.findElement(By.xpath("//a[text()=' Logout']"));
		
		ClickOnLogOut.click();
		
		Thread.sleep(5000);
	}
	
	
}
