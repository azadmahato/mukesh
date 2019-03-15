package seleniumProg;

import java.io.File;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.UtilityScr;

public class FacebookScreenShot {
	
	@Test
	public void screenshot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		UtilityScr.screenshot(driver, "loginpagescreenshot");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tmahato1987@gmail.com");
		UtilityScr.screenshot(driver,"unScreenshot");
	}

}
