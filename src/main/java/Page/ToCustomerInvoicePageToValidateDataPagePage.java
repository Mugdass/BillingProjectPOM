package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.ToCustomerInvoicePageToValidateDataPageModel;
import Model.ToNewInvoicePageModel;

public class ToCustomerInvoicePageToValidateDataPagePage extends ToCustomerInvoicePageToValidateDataPageModel{

	public ToCustomerInvoicePageToValidateDataPagePage(WebDriver mainDriver) {
		super(mainDriver);
		

	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public String typeVerifyCustomerName(String customerParameter) {
		
		String VerifyCustomerName = getVerifyCustomerName(customerParameter);
	
		
		
		
	
	
	return VerifyCustomerName;
		
	}























public String typeVerifyPaymentTerms() {
	
	String VerifyPaymentTerms = getVerifyPaymentTerms();

	
	
	


return VerifyPaymentTerms;
	
}
	













//public String typelol() {
	
	//String lol = getlol();

	
	
	


//return lol;
	
//}













public String typeVerifyPaymentMethod() {
	
	String VerifyPaymentMethod = getVerifyPaymentMethod();

	
	
	


return VerifyPaymentMethod;
	
}
	





public void typeClickOnBankAccountLink() {
	
	WebElement ClickOnBankAccountLink = getClickOnBankAccountLink();

	
	
	
	

	ClickOnBankAccountLink.click();
	
}









public String typeVerifyBankAccount() {
	
	String VerifyBankAccount = getVerifyBankAccount();

	
	
	


return VerifyBankAccount;
	
}











public String typeVerifyProject() {
	
	String VerifyProject = getVerifyProject();

	
	
	


return VerifyProject;
	
}






public String typeVerifyIncoterm(String term) {
	
	String VerifyIncoterm = getVerifyIncoterm(term);

	
	
	


return VerifyIncoterm;
	
}







public String typeVerifydocTemplate() {
	
	String VerifydocTemplate = getVerifydocTemplate();

	
	
	


return VerifydocTemplate;
	
}




public String typeVerifyCurrency() {
	
	String VerifyCurrency = getVerifyCurrency();

	
	
	


return VerifyCurrency;
	
}














public void typeClickOnNotes() {
	
	WebElement ClickOnNotes = getClickOnNotes();

	
	
	
	

	ClickOnNotes.click();
	
}









public String typeVerifyPublicNote() {
	
	String VerifyPublicNote = getVerifyPublicNote();

	
	
	


return VerifyPublicNote;
	
}






public String typeVerifyPrivateNote() {
	
	String VerifyPrivateNote = getVerifyPrivateNote();

	
	
	


return VerifyPrivateNote;
	
}















































//public void typeDELETEinvoice() {
	
	//WebElement DELETEinvoice = getDELETEinvoice();

	
	//DELETEinvoice.click();
	
	
	
//}





//public void typeYesDELETEinvoice() {
	
	//WebElement YesDELETEinvoice = getYesDELETEinvoice();

	
	//YesDELETEinvoice.click();
	
	
	
//}








}
