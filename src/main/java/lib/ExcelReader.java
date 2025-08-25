package lib;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ExcelReader {

	Sheet sh;
	
	
	WebDriver driver;

	
	public ExcelReader(String filename, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(filename);
		
		
		//Workbook wb = new HSSFWorkbook(fis);
		Workbook wb = new XSSFWorkbook(fis);
		
		sh = wb.getSheet(sheetname);
		
		
		
		
			
				
		
		
		
	
		
		
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	public Object[][]  excelToArray(){
		
		// how many rows?

		int totalRows = sh.getPhysicalNumberOfRows();
		//System.out.println("totalRows " + totalRows);

		// how many cells/columns?
		int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
	//	System.out.println("totalCells " + totalColumns);
		
		Object[][] x;
		x = new Object[totalRows-1][totalColumns];
		

		//you are reading from excel.
		for (int r = 1; r < totalRows; r = r + 1) {

			for (int c = 0; c < totalColumns; c = c + 1) {
				
				// store into array              = read excel data
				
				 x[r-1][c]= getCellData(r, c);
				
			}

		}
		return x;
	}

	@SuppressWarnings("deprecation")
	public  String getCellData(int row, int col) {

		String value = "";

		// we need cell
		Cell ce = sh.getRow(row).getCell(col);

		// we have two options: cell type can be String or numberic.

		if (ce.getCellType() == Cell.CELL_TYPE_STRING) {
			// string part

			value = ce.getStringCellValue();
			// System.out.println(value);
		} else {
			// numeric part
			// again two options: int and double
			// first read the value from cell and try to find out whether it is int or
			// double.

			if (ce.getNumericCellValue() % 1 == 0) {
				// int
				value = "" + (long) ce.getNumericCellValue();
				// System.out.println(value);
			} else {

				value = "" + ce.getNumericCellValue();
				// System.out.println(value);

			}

		}
		return value;
	}
}
