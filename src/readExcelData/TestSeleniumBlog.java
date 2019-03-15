package readExcelData;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumBlog {
	
	@Test
	public void testconfig() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\Rishi\\workspace\\MukeshSelenium\\src\\configProperty\\config.properties");
	    prop.load(ip);
	    System.out.println(prop.getProperty("ChromeDriverPath"));
	    System.out.println(prop.getProperty("url"));
	}

}
