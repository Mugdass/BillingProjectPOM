package Model;

import org.openqa.selenium.WebDriver;

public class BaseModel {
	
	 protected WebDriver driver;
	 
	public BaseModel(WebDriver mainDriver) {
		
		driver = mainDriver;
	}

}
