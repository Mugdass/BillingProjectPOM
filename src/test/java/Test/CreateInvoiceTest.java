package Test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import lib.ExcelReader;

public class CreateInvoiceTest extends BaseTest{
	
	
	
	@Test(dataProvider="gm")
	public void maintest(String customerParameter, String paymentTermsParameter, String paymentMethodParameter, String bankAccountParameter, String projectParameter, String incotermParameter, String incotermInputParameter, String docTemplateParameter, String currencyParameter, String publicNoteParameter, String privateNoteParameter, String sn) throws IOException, EncryptedDocumentException, InvalidFormatException {
		
		
		
		//getToHomePagePage();
		
		
		
		//tohomepagepage.typeClickOnDemoProfile();
		
		//tohomepagepage.typePassword();
		
		//tohomepagepage.typeLoginButton();
		
		
		
		
		
		
		
		getToBillingPagePage();
		
		
		
		
		tobillingpagepage.typeClickBillingButton();
		
		
		
		
		
		
		
		getToNewInvoicePagePage();
		
		
		
		tonewinvoicepagepage.typeClickNewInvoiceButton();
		
		
		tonewinvoicepagepage.typeClickOnSelectThirdParty();
		
		tonewinvoicepagepage.typeSelectThirdParty(customerParameter);
		
		
		tonewinvoicepagepage.typeClickOnPaymentTerms();
		tonewinvoicepagepage.typeSelectPaymentTerms(paymentTermsParameter);

		
		tonewinvoicepagepage.typeSelectType();
		
		tonewinvoicepagepage.typeSelectInvoiceDate();
		
		
		tonewinvoicepagepage.typeClickOnPaymentMethod();
		tonewinvoicepagepage.typeSelectPaymentMethod(paymentMethodParameter);
		
		
		tonewinvoicepagepage.typeClickOnBankAccount();
		tonewinvoicepagepage.typeSelectBankAccount(bankAccountParameter);
		
		
		
		tonewinvoicepagepage.typeClickOnProject();
		tonewinvoicepagepage.typeSelectProject(projectParameter);
		
		
		tonewinvoicepagepage.typeSelectIncotermFromDropDown(incotermParameter);
		tonewinvoicepagepage.typeIncotermInput(incotermInputParameter);
		
		
		tonewinvoicepagepage.typeClickOnDocTemplate();
		tonewinvoicepagepage.typeSelectDocTemplate(docTemplateParameter);
		
		
		
		tonewinvoicepagepage.typeClickOnCurrency();
		tonewinvoicepagepage.typeSelectCurrency(currencyParameter);
		
		
		
		tonewinvoicepagepage.typeWritePublicNote(publicNoteParameter);
		tonewinvoicepagepage.typeWritePrivateNote(privateNoteParameter);
		
		
		
		
		
	
		
		
		
		
		tonewinvoicepagepage.typeClickOnCreateDraftButton();
		
		
		
		
		tonewinvoicepagepage.typeSaveToExcell();
		
		
		
		
		
		
		//tonewinvoicepagepage.typeClickOnDropDownLogOut();
		//tonewinvoicepagepage.typeClickOnLogOut();
		
		
		
		
		
		
		
		
		
		
		
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
