package readExcelData;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Rishi\\workspace\\MukeshSelenium\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int count=sheet1.getLastRowNum();
		System.out.println("total number of row= "+(count+1));
		for(int i=0;i<=count;i++)
		{
		 String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
		 System.out.println("the values of sheet is =" +data0);
		 wb.close();
		}

	}

}
