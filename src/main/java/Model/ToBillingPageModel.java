package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToBillingPageModel extends BaseModel{

	public ToBillingPageModel(WebDriver mainDriver) {
		super(mainDriver);
		
		
	}
	
	
	

	
	
	public WebElement getClickBillingButton() {
		
		WebElement BillingButton = driver.findElement(By.xpath("//span[text()='Billing | Payment']"));
		
		return BillingButton;
		
		
	

}

}
