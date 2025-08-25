package Model;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ToNewInvoicePageModel extends BaseModel{

	public ToNewInvoicePageModel(WebDriver mainDriver) {
		super(mainDriver);
		
		
	}
	
	
	

	
	public WebElement getClickNewInvoiceButton() {
		
		WebElement NewInvoiceButton = driver.findElement(By.xpath("//a[text()='New invoice']"));
		
		return NewInvoiceButton;
		
		
	

}
	
	
public WebElement getClickOnSelectThirdParty() {
		
	WebElement ClickOnSelectThirdParty = driver.findElement(By.xpath("//span[@class='placeholder']"));
		
		return ClickOnSelectThirdParty;
		
		
	

}



public WebElement getSelectThirdParty() {
	
	WebElement SelectThirdParty = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		
		return SelectThirdParty;
		
		
	

}



	
	

public WebElement getClickOnPaymentTerms() {
	
	WebElement ClickOnPaymentTerms = driver.findElement(By.xpath("//span[text()='Due Upon Receipt']"));
		
		return ClickOnPaymentTerms;
		
		
	

}






public WebElement getSelectPaymentTerms() {
	
	WebElement SelectPaymentTerms = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	
		
		return SelectPaymentTerms;
		
		
	

}




public WebElement getSelectType() {
	
	WebElement SelectType = driver.findElement(By.xpath("//label[text()='Down payment invoice']"));
	
	
		
		return SelectType;
		
		
	

}





public WebElement getSelectInvoiceDate() {
	
	WebElement SelectInvoiceDate = driver.findElement(By.xpath("//button[@name='_useless']"));
	
	
		
		return SelectInvoiceDate;
		
		
	

}















public WebElement getClickOnPaymentMethod() {
	
	WebElement ClickOnPaymentMethod = driver.findElement(By.xpath("//span[@id='select2-selectmode_reglement_id-container']"));
		
		return ClickOnPaymentMethod;
		
		
	

}






public WebElement getSelectPaymentMethod() {
	
	WebElement SelectPaymentMethod = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	
		
		return SelectPaymentMethod;
		
		
	

}











public WebElement getClickOnBankAccount() {
	
	WebElement ClickOnBankAccount = driver.findElement(By.xpath("//span[@id='select2-selectfk_account-container']"));
		
		return ClickOnBankAccount;
		
		
	

}






public WebElement getSelectBankAccount() {
	
	WebElement SelectBankAccount = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	
		
		return SelectBankAccount;
		
		
	

}

















public WebElement getClickOnProject() {
	
	WebElement ClickOnProject = driver.findElement(By.xpath("//span[@id='select2-projectid-container']"));
		
		return ClickOnProject;
		
		
	

}






public WebElement getSelectProject() {
	
	WebElement SelectProject = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	
		
		return SelectProject;
		
		
	

}





public WebElement getSelectIncotermFromDropDown() {
	
	WebElement SelectIncotermFromDropDown = driver.findElement(By.xpath("//select[@class='flat selectincoterm width75']"));
	
	
		
		return SelectIncotermFromDropDown;
		
		
	

}







public WebElement getIncotermInput() {
	
	WebElement IncotermInput = driver.findElement(By.xpath("//input[@id='location_incoterms']"));
	
	
		
		return IncotermInput;
		
		
	

}












public WebElement getClickOnDocTemplate() {
	
	WebElement ClickOnDocTemplate = driver.findElement(By.xpath("//span[@id='select2-model-container']"));
		
		return ClickOnDocTemplate;
		
		
	

}






public WebElement getSelectDocTemplate() {
	
	WebElement SelectDocTemplate = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	
		
		return SelectDocTemplate;
		
		
	

}















public WebElement getClickOnCurrency() {
	
	WebElement ClickOnCurrency = driver.findElement(By.xpath("//span[@id='select2-multicurrency_code-container']"));
		
		return ClickOnCurrency;
		
		
	

}






public WebElement getSelectCurrency() {
	
	WebElement SelectCurrency = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	
	
		
		return SelectCurrency;
		
		
	

}










public WebElement getWritePublicNote() {
	
	WebElement WritePublicNote = driver.findElement(By.xpath("//textarea[@id='note_public']"));
	
	
		
		return WritePublicNote;
		
		
	

}




public WebElement getWritePrivateNote() {
	
	WebElement WritePrivateNote = driver.findElement(By.xpath("//textarea[@id='note_private']"));
	
	
		
		return WritePrivateNote;
		
		
	

}














public WebElement getClickOnCreateDraftButton() {
	
	WebElement ClickOnCreateDraftButton = driver.findElement(By.xpath("//input[@class='button button-save ']"));
		
		return ClickOnCreateDraftButton;
		
		
		
		
	
		
		
	

}









public WebElement getSaveToExcell() throws IOException {
	
	WebElement SaveToExcell = driver.findElement(By.xpath("//div[contains(text(),'Ref. customer ')]/parent::div"));
		
	
		
	

	return SaveToExcell;
	
}












//public WebElement getClickOnDropDownLogOut() {
	//WebElement ClickOnDropDownLogOut = driver.findElement(By.xpath("//div[@class='userimg atoplogin dropdown user user-menu inline-block']/descendant::span"));
		
		//return ClickOnDropDownLogOut;
		
		
		
		
		
	
		
		
	

//}






//public WebElement getClickOnLogOut() {
	//WebElement ClickOnLogOut = driver.findElement(By.xpath("//a[text()=' Logout']"));
		
		//return ClickOnLogOut;
		
		
		
		
		
	
		
		
	

//}





}

























	


