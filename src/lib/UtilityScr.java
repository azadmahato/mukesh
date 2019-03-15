package lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class UtilityScr {

	
	
	public static void screenshot(WebDriver driver,String screenshotname)
	{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcFile=ts.getScreenshotAs(OutputType.FILE);
			File destFile=new File("C:\\Users\\Rishi\\workspace\\MukeshSelenium\\screenshot\\"+screenshotname+".png");
			FileUtils.copyFile(srcFile, destFile);
		} catch (Exception e) {
			
			System.out.println("screenshot exception"+e.getMessage());
		} 
	}
}
