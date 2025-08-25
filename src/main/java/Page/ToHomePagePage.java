package Page;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



import Model.ToHomePageModel;

public class ToHomePagePage extends ToHomePageModel{

	public ToHomePagePage(WebDriver mainDriver) {
		super(mainDriver);
		

	}
	
	
	
	//public void typeClickOnDemoProfile() {
		
		//WebElement ClickOnDemoProfile = getClickOnDemoProfile();
			
			
			//ClickOnDemoProfile.click();
			
			
		//}
	
	
	
	
	
	
	
	//public void typePassword() {
		
		//WebElement password = getPassword();
		
		//Actions a = new Actions(driver);
			
		//a.doubleClick(password);
		//a.perform();
		
		//password.clear();
		//password.sendKeys("demo");
		
		//password.sendKeys(Keys.ENTER);
		

		
			
			
		//}
	
	
	
	
	
	//public void typeLoginButton() {
		
		//WebElement loginbutton = getLoginButton();
		
		//loginbutton.click();
		
		
		
	
	
	
	//}
	
	
	
	
	public void typeClickBillingButton() {
		
		WebElement BillingButton = getClickBillingButton();
		
		BillingButton.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(BillingButton));
	
	

	}
	
}
