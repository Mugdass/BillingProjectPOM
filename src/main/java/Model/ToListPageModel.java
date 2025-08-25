package Model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ToListPageModel extends BaseModel{

	public ToListPageModel(WebDriver mainDriver) {
		super(mainDriver);
		
		
	}
	
	
	




public WebElement getClickOnList() {
	
	WebElement ClickOnList = driver.findElement(By.xpath("//a[text()='List']"));
		
	 
	
	
	
		return ClickOnList;
		
		
	

}










public WebElement getPasteInvoiceNumber() {
	
	WebElement PasteInvoiceNumber = driver.findElement(By.xpath("//input[@name='search_ref']"));
		
	 
	
	
	
		return PasteInvoiceNumber;
		
		
	

}








public String getSn() {
	
	String Sn = driver.findElement(By.partialLinkText("(PROV")).getText();

	
	System.out.println("\n\nThe Current Invoice Number:  "+Sn + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	return Sn;
	
}










//public String getSn() {
	
	//String Sn= driver.findElement(By.partialLinkText("(PROV5")).getText();

	
	//System.out.println("\n\nInvoice Number:  "+Sn + "\n has been successfully verified. \n\n");
	//return VerifyCustomerName;
	
	

	//return Sn;
	
//}











public WebElement getClickOnInvoiceNumberAfterSearch() {
	
	WebElement ClickOnInvoiceNumberAfterSearch = driver.findElement(By.xpath("//a[@class='classfortooltip']"));
		
	 
	
	
	
		return ClickOnInvoiceNumberAfterSearch;
		
		
	

}



























}








	


