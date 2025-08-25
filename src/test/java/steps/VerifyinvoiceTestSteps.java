package steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Page.ToBillingPagePage;
import Page.ToCustomerInvoicePageToValidateDataPagePage;
import Page.ToListPagePage;
import Page.ToNewInvoicePagePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class VerifyinvoiceTestSteps {
	
WebDriver driver = StepBase.driver;


	
ToBillingPagePage tobillingpagepage = new ToBillingPagePage(driver);

ToNewInvoicePagePage tonewinvoicepagepage = new ToNewInvoicePagePage(driver);

ToListPagePage tolistpagepage = new ToListPagePage(driver);


ToCustomerInvoicePageToValidateDataPagePage tocustomerinvoicepagetovalidatedatapagepage = new ToCustomerInvoicePageToValidateDataPagePage(driver);
	
	@Given("Again I am on the current page {string}")
	public void Again_i_am_on_the_current_page(String string) {
	    
driver.navigate().to(string);
	}
	
	
	
	
	
	
	
	
	@When("Again I click on the manufacturer")
	public void Again_i_click_on_the_manufacturer() {
	    
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
	

	
	
	
	
	

	@When("Again I click on the billing button")
	public void Again_i_click_on_the_billing_button() {
	    
		tobillingpagepage.typeClickBillingButton();

	}
	
	
	@When("When I Click on List")
	public void when_i_click_on_list() {
	    
		tolistpagepage.typeClickOnList();
	}

	@When("When I Paste Invoice Number")
	public void when_i_paste_invoice_number() throws EncryptedDocumentException, InvalidFormatException, IOException {
	    
		tolistpagepage.typePasteInvoiceNumber();
	}

	@Then("I verify that Invoice Number saved in the Excel spreadsheet is the same invoice number pasted here")
	public void i_verify_that_invoice_number_saved_in_the_excel_spreadsheet_is_the_same_invoice_number_pasted_here() throws EncryptedDocumentException, InvalidFormatException, IOException {
	    

String ActualSn = tolistpagepage.typeSn();
		
		InputStream intoExistingExcellFile = new FileInputStream("data/b.xlsx");

		Workbook wb = WorkbookFactory.create(intoExistingExcellFile);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(11);
		String prj = cell.getStringCellValue();
		String ExpectedSn = prj;
		
		
		Assert.assertEquals(ActualSn, ExpectedSn);
	}

	@Then("When I Click On Invoice Number After Search")
	public void when_i_click_on_invoice_number_after_search() {
	    
		tolistpagepage.typeClickOnInvoiceNumberAfterSearch();
	}

	@Then("Then I Verify Customer Name {string}")
	public void then_i_verify_customer_name(String customerParameter) {
	    
		String ActualCustomerName = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyCustomerName(customerParameter);
		Assert.assertEquals(ActualCustomerName, customerParameter);
	}

	@Then("Then I Verify Payment Terms {string}")
	public void then_i_verify_payment_terms(String paymentTermsParameter) {
	    
		String ActualPaymentTerms = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPaymentTerms();
		Assert.assertEquals(ActualPaymentTerms, paymentTermsParameter);
	}

	@Then("Then I Verify Payment Method {string}")
	public void then_i_verify_payment_method(String paymentMethodParameter) {
	   
		String ActualPaymentMethod = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPaymentMethod();
		Assert.assertEquals(ActualPaymentMethod, paymentMethodParameter);
	}

	@Then("Then I Verify Project {string}")
	public void then_i_verify_project(String projectParameter) {
	    
		String ActualProject = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyProject();
		Assert.assertEquals(ActualProject, projectParameter);
	}

	@Then("Then I Verify Incoterm {string}")
	public void then_i_verify_incoterm(String incotermParameter) {
	    
		String incotermInputParameter = "don't know what an incoterm is!";
String t = incotermParameter+" - " + incotermInputParameter;
		
		String ActualIncoterm = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyIncoterm(incotermParameter);
		Assert.assertEquals(ActualIncoterm, t);
	}

	@Then("Then I Verify doc Template {string}")
	public void then_i_verify_doc_template(String docTemplateParameter) {
	    
		String ActualdocTemplate = tocustomerinvoicepagetovalidatedatapagepage.typeVerifydocTemplate();
		Assert.assertEquals(ActualdocTemplate, docTemplateParameter);
	}

	@Then("Then I Verify Currency {string}")
	public void then_i_verify_currency(String currencyParameter) {
	    
String c = "USD - "+ currencyParameter;
		
		
		String ActualCurrency = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyCurrency();
		Assert.assertEquals(ActualCurrency, c);
	}

	@Then("When I Click On Notes")
	public void when_i_click_on_notes() {
	    
		tocustomerinvoicepagetovalidatedatapagepage.typeClickOnNotes();
	}

	@Then("Then I Verify Public Note {string}")
	public void then_i_verify_public_note(String publicNoteParameter) {
	    
		String ActualPublicNote = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPublicNote();
		Assert.assertEquals(ActualPublicNote, publicNoteParameter);
	}

	@Then("Then I Verify Private Note {string}")
	public void then_i_verify_private_note(String privateNoteParameter) {
	    
		String ActualPrivateNote = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPrivateNote();
		Assert.assertEquals(ActualPrivateNote, privateNoteParameter);
	}
}

	