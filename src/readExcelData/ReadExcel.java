package readExcelData;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Rishi\\workspace\\MukeshSelenium\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		wb.close();
	}

}
