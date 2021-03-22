package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String SheetName )
	{
		try {
			
		
		 workbook = new XSSFWorkbook(excelPath);
		 sheet = workbook.getSheet(SheetName); 	
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void getCellData(int rowNum, int colNum) {

			//To get the integer or any data type value we can use....DataFormatter object
			
			DataFormatter formatter = new DataFormatter();
			Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			
			//String value = sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(value);
	}
	
	
	public static void getRowCount() {
		
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows: " + rowCount);
	}

}
