package Page;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import Model.ToNewInvoicePageModel;

public class ToNewInvoicePagePage extends ToNewInvoicePageModel{

	public ToNewInvoicePagePage(WebDriver mainDriver) {
		super(mainDriver);
		

	}
	
	
	
	
	
	
	
	public void typeClickNewInvoiceButton() {
		
		WebElement NewInvoiceButton = getClickNewInvoiceButton();
		
		NewInvoiceButton.click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(BillingButton));
	
	

	}
	
	
	
	
	public void typeClickOnSelectThirdParty() {
		
		WebElement ClickOnSelectThirdParty = driver.findElement(By.xpath("//span[@class='placeholder']"));
			
		ClickOnSelectThirdParty.click();
			
			
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		By loc = (By.xpath("//span[@class='placeholder']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(loc));
		

	}
	
	
	
	public void typeSelectThirdParty(String customerParameter) {
		
		WebElement SelectThirdParty = getSelectThirdParty();
		
		/*Select selectChoice = new Select(SelectThirdParty);
		
		selectChoice.selectByVisibleText(customerParameter);*/
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//By locator = By.xpath("//span[text()='Select a third party']");
		
		//wait.until(ExpectedConditions.elementToBeClickable(locator));
		
		
			
			SelectThirdParty.sendKeys(customerParameter);
			
			SelectThirdParty.sendKeys(Keys.ENTER);
			
			
			
			
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			
			By loc = By.xpath("//input[@class='select2-search__field']");
			
			wait.until(ExpectedConditions.invisibilityOfElementWithText(loc, customerParameter));
			
			
	}
	
	
	
	
	
	
public void typeClickOnPaymentTerms() {
		
		WebElement ClickOnPaymentTerms = getClickOnPaymentTerms();
		
		/*Select selectPaymentTermsChoice = new Select(SelectPaymentTerms);
		
		selectPaymentTermsChoice.selectByVisibleText(paymentTermsParameter);*/
			
			
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//By locator = By.xpath("//span[text()='Due Upon Receipt']");
		
		//wait.until(ExpectedConditions.elementToBeClickable(locator));
			
		//SelectPaymentTerms.sendKeys(paymentTermsParameter);
		
		ClickOnPaymentTerms.click();
		
		
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		//By loc = By.xpath("//input[@class='select2-search__field']");
		
		wait.until(ExpectedConditions.elementToBeClickable(ClickOnPaymentTerms));
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

	public void typeSelectPaymentTerms(String paymentTermsParameter) {
		
		WebElement SelectPaymentTerms = getSelectPaymentTerms();
		
		/*Select selectPaymentTermsChoice = new Select(SelectPaymentTerms);
		
		selectPaymentTermsChoice.selectByVisibleText(paymentTermsParameter);*/
			
			
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//By locator = By.xpath("//span[text()='Due Upon Receipt']");
		
		//wait.until(ExpectedConditions.elementToBeClickable(locator));
			
		SelectPaymentTerms.sendKeys(paymentTermsParameter);
		
		SelectPaymentTerms.sendKeys(Keys.ENTER);
		

	}
	
	
	
	
	
	public void typeSelectType() {
		
		WebElement SelectType = getSelectType();
		
		
			
			SelectType.click();
			
			
		

	}
	
	
	
	
	
	
public void typeSelectInvoiceDate() {
		
		WebElement SelectInvoiceDate = getSelectInvoiceDate();
		
		
			
		SelectInvoiceDate.click();
	
			
			
		

	}
















public void typeClickOnPaymentMethod() {
	
	WebElement ClickOnPaymentMethod = getClickOnPaymentMethod();
	
	
	ClickOnPaymentMethod.click();
	

}













public void typeSelectPaymentMethod(String paymentMethodParameter) {
	
	WebElement SelectPaymentMethod = getSelectPaymentMethod();
	
	
		
	SelectPaymentMethod.sendKeys(paymentMethodParameter);
	
	SelectPaymentMethod.sendKeys(Keys.ENTER);
	

}














public void typeClickOnBankAccount() {
	
	WebElement ClickOnBankAccount = getClickOnBankAccount();
	
	
	ClickOnBankAccount.click();
	

}













public void typeSelectBankAccount(String bankAccountParameter) {
	
	WebElement SelectBankAccount = getSelectBankAccount();
	
	
		
	SelectBankAccount.sendKeys(bankAccountParameter);
	
	SelectBankAccount.sendKeys(Keys.ENTER);
	

}

	
	















public void typeClickOnProject() {
	
	WebElement ClickOnProject = getClickOnProject();
	
	
	ClickOnProject.click();
	

}













public void typeSelectProject(String projectParameter) {
	
	WebElement SelectProject = getSelectProject();
	
	
		
	SelectProject.sendKeys(projectParameter);
	
	SelectProject.sendKeys(Keys.ENTER);
	

}








public void typeSelectIncotermFromDropDown(String incotermParameter) {
	
	WebElement SelectIncotermFromDropDown = getSelectIncotermFromDropDown();
	
	Select selectIncotermChoice = new Select(SelectIncotermFromDropDown);
	
	selectIncotermChoice.selectByVisibleText(incotermParameter);
		
		
	

}








public void typeIncotermInput(String incotermInputParameter) {
	
	WebElement IncotermInput = getIncotermInput();
	
	
		
	IncotermInput.sendKeys(incotermInputParameter);
		
		
	

}










public void typeClickOnDocTemplate() {
	
	WebElement ClickOnDocTemplate = getClickOnDocTemplate();
	
	
	ClickOnDocTemplate.click();
	

}













public void typeSelectDocTemplate(String docTemplateParameter) {
	
	WebElement SelectDocTemplate = getSelectDocTemplate();
	
	
		
	SelectDocTemplate.sendKeys(docTemplateParameter);
	
	SelectDocTemplate.sendKeys(Keys.ENTER);
	

}












public void typeClickOnCurrency() {
	
	WebElement ClickOnCurrency = getClickOnCurrency();
	
	
	ClickOnCurrency.click();
	

}













public void typeSelectCurrency(String currencyParameter) {
	
	WebElement SelectCurrency = getSelectCurrency();
	
	
		
	SelectCurrency.sendKeys(currencyParameter);
	
	SelectCurrency.sendKeys(Keys.ENTER);
	

}








public void typeWritePublicNote(String publicNoteParameter) {
	
	WebElement WritePublicNote = getWritePublicNote();
	
	
		
	WritePublicNote.sendKeys(publicNoteParameter);
	
		
	
}






public void typeWritePrivateNote(String privateNoteParameter) {
	
	WebElement WritePrivateNote = getWritePrivateNote();
	
	
		
	WritePrivateNote.sendKeys(privateNoteParameter);
	
		
	
}



















public void typeClickOnCreateDraftButton() {
	
	WebElement ClickOnCreateDraftButton = getClickOnCreateDraftButton();
		
	ClickOnCreateDraftButton.click();
		
		
	

}












public String typeSaveToExcell() throws IOException, EncryptedDocumentException, InvalidFormatException {
	
	String SaveToExcell = getSaveToExcell().getText();

	/*

	String filename = "data/ReferenceNumberSaved.xlsx";
	
	FileOutputStream fis = new FileOutputStream(filename);
	
	Workbook workbook1 = new HSSFWorkbook();
	

	
	Sheet Sheet1 = workbook1.createSheet("Sheet1");
	
	Row Row2 = Sheet1.createRow(3);
	
	Cell Cell2 = Row2.createCell(1);
	
	Cell2.setCellValue(driver.findElement(By.partialLinkText("(PROV5")).getText());
	
	//multiply
	
	
	
	
	
	workbook1.write(fis);
	
	
	
	
	
	fis.close();
	
	workbook1.close();
	*/
	
	
	InputStream intoExistingExcellFile = new FileInputStream("data/b.xlsx");

	Workbook wb = WorkbookFactory.create(intoExistingExcellFile);
	Sheet sheet = wb.getSheetAt(0);
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(11);
	if (cell == null || cell != null)
	    cell = row.createCell(11);
	cell.setCellType(Cell.CELL_TYPE_STRING);
	cell.setCellValue(driver.findElement(By.xpath("//div[contains(text(),'Ref. customer ')]/parent::div")).getText().split("\n") [0]);
	
	
	
	// Write the output to a file
	FileOutputStream fileOut = new FileOutputStream("data/b.xlsx");
	wb.write(fileOut);
	fileOut.close();
	
	
	
	
	
	
	
	return SaveToExcell;
	
	
}






//public void typeClickOnDropDownLogOut() {
	
	//WebElement ClickOnDropDownLogOut = getClickOnDropDownLogOut();
		
	//ClickOnDropDownLogOut.click();
	
	
	
		
		
	

//}








//public void typeClickOnLogOut() {
	
	//WebElement ClickOnLogOut = getClickOnLogOut();
		
	//ClickOnLogOut.click();
	
	
	
	
	
	
	
	
		
		
	

//}














}












