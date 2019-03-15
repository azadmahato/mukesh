package seleniumProg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroupDownAscending {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
        Select select=new Select(driver.findElement(By.id("month")));
        List actual=new ArrayList();
        
        List<WebElement> mysel=select.getOptions();
        for(WebElement ele:mysel)
        {
        	String data=ele.getText();
        	
        	System.out.println(data);
        	actual.add(data);
        	  
        	}
        List temp=new ArrayList();
        temp.addAll(actual);
        Collections.sort(temp);
        System.out.println(temp);
        
        
	}

}
