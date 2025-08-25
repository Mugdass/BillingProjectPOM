package steps;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Page.ToBillingPagePage;
import Page.ToCustomerInvoicePageToValidateDataPagePage;
import Page.ToListPagePage;
import Page.ToNewInvoicePagePage;
import Test.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class CreateinvoiceTestSteps {
	
WebDriver driver = StepBase.driver;


	
ToBillingPagePage tobillingpagepage = new ToBillingPagePage(driver);

ToNewInvoicePagePage tonewinvoicepagepage = new ToNewInvoicePagePage(driver);

ToListPagePage tolistpagepage = new ToListPagePage(driver);


ToCustomerInvoicePageToValidateDataPagePage tocustomerinvoicepagetovalidatedatapagepage = new ToCustomerInvoicePageToValidateDataPagePage(driver);
	
	@Given("I am on the current page {string}")
	public void i_am_on_the_current_page(String string) {
	    
driver.navigate().to(string);
	}
	
	
	
	
	
	
	
	
	@When("I click on the manufacturer")
	public void i_click_on_the_manufacturer() {
	    
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
	

	
	
	
	
	

	@When("I click on the billing button")
	public void i_click_on_the_billing_button() {
	    
		tobillingpagepage.typeClickBillingButton();

	}

	@When("When I Click New Invoice button")
	public void when_i_click_new_invoice_button() {
	   
		tonewinvoicepagepage.typeClickNewInvoiceButton();
	}

	@When("When I Click On Select Third Party")
	public void when_i_click_on_select_third_party() {
	    
		tonewinvoicepagepage.typeClickOnSelectThirdParty();
	}

	@When("When I select third party {string}")
	public void when_i_select_third_party(String customerParameter) {
	    

		tonewinvoicepagepage.typeSelectThirdParty(customerParameter);
	}

	@When("When I Click On Payment Terms")
	public void when_i_click_on_payment_terms() {
	    
		tonewinvoicepagepage.typeClickOnPaymentTerms();
	}

	@When("When I Select Payment Terms {string}")
	public void when_i_select_payment_terms(String paymentTermsParameter) {
	    
		tonewinvoicepagepage.typeSelectPaymentTerms(paymentTermsParameter);
	}

	@When("When I Select Type")
	public void when_i_select_type() {
	    
		tonewinvoicepagepage.typeSelectType();
	}

	@When("When I Select Invoice Date")
	public void when_i_select_invoice_date() {
	   
		tonewinvoicepagepage.typeSelectInvoiceDate();
	}

	@When("When I Click On Payment Method")
	public void when_i_click_on_payment_method() {
	    
		tonewinvoicepagepage.typeClickOnPaymentMethod();
	}

	@When("When I Select Payment Method {string}")
	public void when_i_select_payment_method(String paymentMethodParameter) {
	    
		tonewinvoicepagepage.typeSelectPaymentMethod(paymentMethodParameter);
	}

	@When("When I Click On BankAccount")
	public void when_i_click_on_bank_account() {
	    
		tonewinvoicepagepage.typeClickOnBankAccount();
	}

	@When("When I Select Bank Account {string}")
	public void when_i_select_bank_account(String bankAccountParameter) {
	    
		tonewinvoicepagepage.typeSelectBankAccount(bankAccountParameter);
	}

	@When("When I Click On Project")
	public void when_i_click_on_project() {
	    
		tonewinvoicepagepage.typeClickOnProject();
	}

	@When("When I Select Project {string}")
	public void when_i_select_project(String projectParameter) {
	   
		tonewinvoicepagepage.typeSelectProject(projectParameter);
	}

	@When("When I Select Incoterm From Drop Down {string}")
	public void when_i_select_incoterm_from_drop_down(String incotermParameter) {
	    
		tonewinvoicepagepage.typeSelectIncotermFromDropDown(incotermParameter);
	}

	@When("When I put Incoterm Input {string}")
	public void when_i_put_incoterm_input(String incotermInputParameter) {
	    
		tonewinvoicepagepage.typeIncotermInput(incotermInputParameter);
	}

	@When("When I Click On Doc Template")
	public void when_i_click_on_doc_template() {
	    
		tonewinvoicepagepage.typeClickOnDocTemplate();
	}

	@When("When I Select Doc Template {string}")
	public void when_i_select_doc_template(String docTemplateParameter) {
	   
		tonewinvoicepagepage.typeSelectDocTemplate(docTemplateParameter);
	}

	@When("When I Click On Currency")
	public void when_i_click_on_currency() {
	    
		tonewinvoicepagepage.typeClickOnCurrency();
	}

	@When("When I Select Currency {string}")
	public void when_i_select_currency(String currencyParameter) {
	    
		tonewinvoicepagepage.typeSelectCurrency(currencyParameter);
	}

	@When("When I Write Public Note {string}")
	public void when_i_write_public_note(String publicNoteParameter) {
	   
		tonewinvoicepagepage.typeWritePublicNote(publicNoteParameter);
	}

	@When("When I Write Private Note {string}")
	public void when_i_write_private_note(String privateNoteParameter) {
	    
		tonewinvoicepagepage.typeWritePrivateNote(privateNoteParameter);
	}

	@When("When I Click On Create Draft button")
	public void when_i_click_on_create_draft_button() {
	    
		tonewinvoicepagepage.typeClickOnCreateDraftButton();
	}

	@When("When I Save To Excell")
	public void when_i_save_to_excell() throws EncryptedDocumentException, InvalidFormatException, IOException {
	    
		tonewinvoicepagepage.typeSaveToExcell();
	}


}
