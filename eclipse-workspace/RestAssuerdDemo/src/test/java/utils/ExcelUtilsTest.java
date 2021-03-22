package utils;

public class ExcelUtilsTest {
	
	public static void main(String[] args) {
		
		String excelPath = "./Data/TestData.xlsx";
		String SheetName = "Sheet1";
		 
		ExcelUtils excel = new ExcelUtils(excelPath, SheetName);
		
		excel.getRowCount();
		excel.getCellData(1,0);
		excel.getCellData(1,1);
		excel.getCellData(1,2);
		
	}

}
