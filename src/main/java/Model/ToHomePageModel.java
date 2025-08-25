package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToHomePageModel extends BaseModel{

	public ToHomePageModel(WebDriver mainDriver) {
		super(mainDriver);
		
		
	}
	
	
	
//public WebElement getClickOnDemoProfile() {
		
	//WebElement ClickOnDemoProfile = driver.findElement(By.xpath("//div[text()='Company manufacturing products']"));
		
		//return ClickOnDemoProfile;
		
		
	//}




//public WebElement getPassword() {
	
	
	
	//WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		
		//return password;
		
		
	//}
	
	
	

//public WebElement getLoginButton() {
	
	//WebElement loginbutton = driver.findElement(By.xpath("//input[@class='button']"));
	
	//return loginbutton;
	
	
//}
	
	
	
	public WebElement getClickBillingButton() {
		
		WebElement BillingButton = driver.findElement(By.xpath("//span[text()='Billing | Payment']"));
		
		return BillingButton;
		
		
	

}

}
