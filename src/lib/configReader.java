package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	Properties prop;
	public configReader()
	{
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Rishi\\workspace\\MukeshSelenium\\src\\configProperty\\config.properties");
			prop.load(ip);
		} catch (Exception e) {
			System.out.println("exception is"+e.getMessage());
			
		} 
	}
	public String getChromePath()
	{
		String path=prop.getProperty("ChromeDriverPath");
		return path;
	}

}
