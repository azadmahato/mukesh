package lib;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataConfig(String Excelpath) throws IOException
	{
		File src=new File(Excelpath);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		//sheet1=wb.getSheetAt(0);
		
		
	}
	public String getData(int sheetnumber,int row,int col)
	{   sheet1=wb.getSheetAt(sheetnumber);
		String data1=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data1;
	}
}
