package Page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import Model.ToBillingPageModel;


public class ToBillingPagePage extends ToBillingPageModel{

	public ToBillingPagePage(WebDriver mainDriver) {
		super(mainDriver);
		

	}
	
	
	
	
	
	
	
	public void typeClickBillingButton() {
		
		WebElement BillingButton = getClickBillingButton();
		
		BillingButton.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(BillingButton));
	
	

	}
	
}
