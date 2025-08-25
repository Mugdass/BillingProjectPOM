package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Page.ToBillingPagePage;
import Page.ToCustomerInvoicePageToValidateDataPagePage;
//import Page.ToHomePagePage;
import Page.ToListPagePage;
import Page.ToNewInvoicePagePage;

public class BaseTest {
	
	static WebDriver driver;
	
	//static ToHomePagePage tohomepagepage;
	
	static ToBillingPagePage tobillingpagepage;
	
	static ToNewInvoicePagePage tonewinvoicepagepage;
	
	static ToListPagePage tolistpagepage;
	
	
	static ToCustomerInvoicePageToValidateDataPagePage tocustomerinvoicepagetovalidatedatapagepage;
	
	@BeforeSuite
	public void setUp() {
		
System.setProperty("webdriver.chrome.driver", "/Users/matas/Downloads/chromedriver");


		



		ChromeOptions handleNotifications = new ChromeOptions();
		
		handleNotifications.addArguments("--disable-notifications");

		driver = new ChromeDriver(handleNotifications);
		
		
		
		//driver = new FirefoxDriver();
		
		driver.get("https://demo.dolibarr.org/public/demo/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
	}
	
	
	
	
	
	
	
	
	

	
	//public void getToHomePagePage() {
		
		//tohomepagepage = new ToHomePagePage(driver);
	//}
	
	
public void getToBillingPagePage() {
		
		tobillingpagepage = new ToBillingPagePage(driver);
	}


public void getToNewInvoicePagePage() {
	
	tonewinvoicepagepage = new ToNewInvoicePagePage(driver);
}




public void getToListPagePage() {
	
	tolistpagepage = new ToListPagePage(driver);
}
	




public void getToCustomerInvoicePageToValidateDataPage() {
	
	tocustomerinvoicepagetovalidatedatapagepage = new ToCustomerInvoicePageToValidateDataPagePage(driver);
}
	






	
	
	@AfterSuite
	public void endTest() throws InterruptedException {
		
	
		Thread.sleep(10000);
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
