package readExcelData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import lib.configReader;

public class TestConfig {
	@Test
	public void TestChrome()
	{
		configReader config=new configReader();
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
