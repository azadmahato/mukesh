package readExcelData;

import java.io.IOException;

import lib.ExcelDataConfig;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {
		ExcelDataConfig excel1=new ExcelDataConfig("C:\\Users\\Rishi\\workspace\\MukeshSelenium\\ExcelData\\TestData.xlsx");
		System.out.println(excel1.getData(1, 0, 0));

	}

}
