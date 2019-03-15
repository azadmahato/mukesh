package seleniumProg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import lib.UtilityScr;

public class FacebookScFailure {
	WebDriver driver;
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tmahato1987@gmail.com");
		
	}
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("tmahato1987");
			
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			UtilityScr.screenshot(driver, result.getName());
		}
	}
}
