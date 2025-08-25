package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class ToCustomerInvoicePageToValidateDataPageModel extends BaseModel{

	public ToCustomerInvoicePageToValidateDataPageModel(WebDriver mainDriver) {
		super(mainDriver);
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
public String getVerifyCustomerName(String customerParameter) {
		
		String VerifyCustomerName = driver.findElement(By.xpath("//a[@class='classfortooltip refurl']")).getText();
	
		
		System.out.println("\n\nCustomer Name found:  "+customerParameter+"\n Customer Name:  "+VerifyCustomerName + " successfully verified. \n\n");
		//return VerifyCustomerName;
		
		
	
		return VerifyCustomerName;
		
	}






































public String getVerifyPaymentTerms() {
	
	String VerifyPaymentTerms = driver.findElement(By.xpath("//td[contains(child::text(),'Due')]")).getText();

	
	System.out.println("\n\nPayment Terms:  "+VerifyPaymentTerms + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyPaymentTerms;
	
}












//public String getlol() {
	
	//String lol = driver.findElement(By.xpath("//div[@id=\"id-right\"]/div/div[2]/div[1]/div/div[5]/text()")).getText();

	
	//System.out.println("\n\nlol:  "+lol + "\n has been successfully verified. \n\n");
	
	
	

	//return lol;
	
//}














public String getVerifyPaymentMethod() {
	
	String VerifyPaymentMethod = driver.findElement(By.xpath("//table/descendant::td[20]")).getText();

	
	System.out.println("\n\nPayment Method:  "+VerifyPaymentMethod + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyPaymentMethod;
	
}









public WebElement getClickOnBankAccountLink() {
	
	WebElement ClickOnBankAccountLink = driver.findElement(By.xpath("//a[@title='<span class=\"fas fa-university infobox-bank_account\" style=\"\"></span> <u class=\"paddingrightnow\">Bank account</u> <span class=\"badge  badge-status4 badge-status\" title=\"Open\">Open</span><br><b>Label:</b> test<br><b>Account number:</b> <br><b>IBAN:</b> <br><b>BIC/SWIFT:</b> <br><b>Account currency:</b> EUR<br><b>Accounting account:</b> <br><b>Accounting code journal:</b> ']"));

	
	
	
	

	return ClickOnBankAccountLink;
	
}












public String getVerifyBankAccount() {
	
	String VerifyBankAccount = driver.findElement(By.xpath("//div[@class='refidno']")).getText();

	
	System.out.println("\n\nBank Account:  "+VerifyBankAccount + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyBankAccount;
	
}





















public String getVerifyProject() {
	
	String VerifyProject = driver.findElement(By.xpath("//a[contains(text(),'PJ')]")).getText();
	
	//a[text()='PJ2208-0012'+' - test projet']
	//a[text()='PJ2208-0012']
	
	System.out.println("\n\nProject:  "+VerifyProject + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyProject;
	
}




















public String getVerifyIncoterm(String term) {
	
	String locator = "//td[contains(text(),'"+term+"')]";
	
	String VerifyIncoterm = driver.findElement(By.xpath(locator)).getText();
	
	//a[text()='PJ2208-0012'+' - test projet']
	//a[text()='PJ2208-0012']
	
	System.out.println("\n\nIncoterms:  "+VerifyIncoterm + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyIncoterm;
	
}











public String getVerifydocTemplate() {
	
	String VerifydocTemplate = driver.findElement(By.xpath("//span[@id='select2-model-container']")).getText();
	
	//a[text()='PJ2208-0012'+' - test projet']
	//a[text()='PJ2208-0012']
	
	System.out.println("\n\nDoc Template:  "+VerifydocTemplate + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifydocTemplate;
	
}










public String getVerifyCurrency() {
	
	String VerifyCurrency = driver.findElement(By.xpath("//td[contains(text(),'Dol')]")).getText();
	
	//a[text()='PJ2208-0012'+' - test projet']
	//a[text()='PJ2208-0012']
	
	System.out.println("\n\nCurrency:  "+VerifyCurrency + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyCurrency;
	
}








public WebElement getClickOnNotes() {
	
	WebElement ClickOnNotes = driver.findElement(By.xpath("//a[@id='note']"));

	
	
	
	

	return ClickOnNotes;
	
}











public String getVerifyPublicNote() {
	
	String VerifyPublicNote = driver.findElement(By.xpath("//div[@class='tagtd wordbreak table-val-border-col sensiblehtmlcontent']")).getText();
	
	//a[text()='PJ2208-0012'+' - test projet']
	//a[text()='PJ2208-0012']
	
	System.out.println("\n\nNote (public):  "+VerifyPublicNote + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyPublicNote;
	
}










public String getVerifyPrivateNote() {
	
	String VerifyPrivateNote = driver.findElement(By.xpath("//div[contains(child::text(),'PRIV')]")).getText();
	
	//a[text()='PJ2208-0012'+' - test projet']
	//a[text()='PJ2208-0012']
	
	System.out.println("\n\nNote (private):  "+VerifyPrivateNote + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return VerifyPrivateNote;
	
}





































//public WebElement getDELETEinvoice() {
	
	//WebElement DELETEinvoice = driver.findElement(By.xpath("//a[text()='Delete']"));

	
	
	
	

	//return DELETEinvoice;
	
//}








//public WebElement getYesDELETEinvoice() {
	
	//WebElement YesDELETEinvoice = driver.findElement(By.xpath("//button[text()='Yes']"));

	
	
	
	

	//return YesDELETEinvoice;
	
//}









}








	


