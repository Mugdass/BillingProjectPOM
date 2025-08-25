package Test;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class VerifyInvoiceTest extends BaseTest{
	

	
	
	
	
	@Test(dataProvider="gm")
	public void maintest(String customerParameter, String paymentTermsParameter, String paymentMethodParameter, String bankAccountParameter, String projectParameter, String incotermParameter, String incotermInputParameter, String docTemplateParameter, String currencyParameter, String publicNoteParameter, String privateNoteParameter, String sn) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		
		
		//getToHomePagePage();
		
		
		
		//tohomepagepage.typeClickOnDemoProfile();
		
		//tohomepagepage.typePassword();
		
		//tohomepagepage.typeLoginButton();
		
		
		
		
		
		
		
		getToBillingPagePage();
		
		
		
		
		tobillingpagepage.typeClickBillingButton();
		
		
		
		
		
		
		
		
		
	
		
		
		
		getToListPagePage();
		
		
		tolistpagepage.typeClickOnList();
		
		
		
	
		
		
		//String ActualSn = tolistpagepage.typeSn();
		//Assert.assertEquals(ActualSn, sn);
		
		
		
		tolistpagepage.typePasteInvoiceNumber();
		
		
		
		
		
		
		

		String ActualSn = tolistpagepage.typeSn();
		
		InputStream intoExistingExcellFile = new FileInputStream("data/b.xlsx");

		Workbook wb = WorkbookFactory.create(intoExistingExcellFile);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(11);
		String prj = cell.getStringCellValue();
		String ExpectedSn = prj;
		
		
		Assert.assertEquals(ActualSn, ExpectedSn);
		
		
		
		
		
		
		
		
		
		tolistpagepage.typeClickOnInvoiceNumberAfterSearch();
		
		
		
		
		
	
		
		
		getToCustomerInvoicePageToValidateDataPage();
		
		
		
		
		
		
		
		String ActualCustomerName = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyCustomerName(customerParameter);
		Assert.assertEquals(ActualCustomerName, customerParameter);
		
		
		
		
		
		
		
		String ActualPaymentTerms = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPaymentTerms();
		Assert.assertEquals(ActualPaymentTerms, paymentTermsParameter);
		
		
		
		

		
		//String Actuallol = tocustomerinvoicepagetovalidatedatapagepage.typelol();
		//Assert.assertEquals(Actuallol, driver.findElement(By.xpath("//div[@id=\"id-right\"]/div/div[2]/div[1]/div/div[5]/text()")).getText());
		
		
		
		
		
		
		String ActualPaymentMethod = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPaymentMethod();
		Assert.assertEquals(ActualPaymentMethod, paymentMethodParameter);
		
		
		
		
		
		
		//tocustomerinvoicepagetovalidatedatapagepage.typeClickOnBankAccountLink();
		
		
		
		
		//String ActualBankAccount = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyBankAccount();
		//Assert.assertEquals(ActualBankAccount, bankAccountParameter);
		
	
		
		
		String ActualProject = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyProject();
		Assert.assertEquals(ActualProject, projectParameter);
		 
		
		
		
		
		String t = incotermParameter+" - " + incotermInputParameter;
		
		String ActualIncoterm = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyIncoterm(incotermParameter);
		Assert.assertEquals(ActualIncoterm, t);

		 
		
		
		String ActualdocTemplate = tocustomerinvoicepagetovalidatedatapagepage.typeVerifydocTemplate();
		Assert.assertEquals(ActualdocTemplate, docTemplateParameter);

		
		
		
		
		String c = "USD - "+ currencyParameter;
		
		
		String ActualCurrency = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyCurrency();
		Assert.assertEquals(ActualCurrency, c);
		
		
		
		
	
		
		
		
		tocustomerinvoicepagetovalidatedatapagepage.typeClickOnNotes();
		
		
		

		String ActualPublicNote = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPublicNote();
		Assert.assertEquals(ActualPublicNote, publicNoteParameter);
		 
		String ActualPrivateNote = tocustomerinvoicepagetovalidatedatapagepage.typeVerifyPrivateNote();
		Assert.assertEquals(ActualPrivateNote, privateNoteParameter);
		 

		 

		 
		 
		 
		
		
		
		
		getToNewInvoicePagePage();
		
		
		
		
		//tonewinvoicepagepage.typeClickOnDropDownLogOut();
		//tonewinvoicepagepage.typeClickOnLogOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
		//tocustomerinvoicepagetovalidatedatapagepage.typeDELETEinvoice();
		//tocustomerinvoicepagetovalidatedatapagepage.typeYesDELETEinvoice();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String actual = verifyphonenumberpage.getPhoneNumber();
		//Assert.assertEquals(actual, nr);
		
		
		
		
	}
	
	
	
	
	@DataProvider(name="gm")
	public Object[][] dataloader() throws IOException {
		Object[][] t;
		
		String filename = "data/b.xlsx";
		
		String sheetname = "Sheet1";
		
		
		
		
		
		ExcelReader er = new ExcelReader(filename, sheetname);
		t = er.excelToArray();
		
		
		return t;
		
		
		
		}
	
	

}
