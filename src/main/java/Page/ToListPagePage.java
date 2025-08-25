package Page;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.ToListPageModel;

public class ToListPagePage extends ToListPageModel{

	public ToListPagePage(WebDriver mainDriver) {
		super(mainDriver);
		

	}
	
	
	





public void typeClickOnList() {
	
	WebElement ClickOnList = getClickOnList();
	
	ClickOnList.click();
	
	
	
	
}














public void typePasteInvoiceNumber() throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	WebElement PasteInvoiceNumber = getPasteInvoiceNumber();
	
	//Actions a2 = new Actions(driver);
	InputStream intoExistingExcellFile = new FileInputStream("data/b.xlsx");

	Workbook wb = WorkbookFactory.create(intoExistingExcellFile);
	Sheet sheet = wb.getSheetAt(0);
	Row row = sheet.getRow(1);
	Cell cell = row.getCell(11);
	String prj = cell.getStringCellValue();
	PasteInvoiceNumber.sendKeys(prj);
	PasteInvoiceNumber.sendKeys(Keys.ENTER);
	
	

	
	 
	
	//a2.contextClick(PasteInvoiceNumber);
	//a2.perform();
	
	/*
	 
	PasteInvoiceNumber.sendKeys(Keys.ARROW_DOWN);
	PasteInvoiceNumber.sendKeys(Keys.ARROW_DOWN);
	PasteInvoiceNumber.sendKeys(Keys.ARROW_DOWN);
	
	
	PasteInvoiceNumber.sendKeys(Keys.ENTER);
	
	*/
	
}
















//public String typeSn() {
	
	//String Sn = getSn();

	
	
	


//return Sn;
	
//}










public String typeSn() throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	String Sn = getSn();

	
	
	
	


return Sn;
	
}



















public void typeClickOnInvoiceNumberAfterSearch() {
	
	WebElement ClickOnInvoiceNumberAfterSearch = getClickOnInvoiceNumberAfterSearch();
	
	ClickOnInvoiceNumberAfterSearch.click();
	
	

	
	
}




















}
