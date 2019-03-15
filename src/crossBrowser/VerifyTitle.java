package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	WebDriver driver;
    @Test
   // @Parameters("browser")
	public void setup(String browser)
	{
//    	if(browser.equalsIgnoreCase("firefox"))
//    	{
//    		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rishi\\Desktop\\geckodriver.exe");
//    	    driver=new FirefoxDriver();
//    	}
//    	else if(browser.equalsIgnoreCase("chrome"))
//    	{   
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
//    		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rishi\\Desktop\\chromedriver.exe");	
//    	}
    	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
	
    	driver.get("https://www.facebook.com/");
    	System.out.println(driver.getTitle());
        driver.quit();
    }
	
	
}
