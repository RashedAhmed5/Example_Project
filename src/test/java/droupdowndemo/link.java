package droupdowndemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class link {
	
	@Test
	public void aiilink() throws Exception	{
		
		System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	    ChromeOptions ops = new  ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.paychex.com/login");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	   List<WebElement> countall=driver.findElements(By.tagName("a"));
	   System.out.println("Total link of the page are"+countall.size());
	   
	   for(int i=0; i<countall.size(); i++) {
		  System.out.println(countall.get(i).getAttribute("href")); 
		  
	   }
	   driver.close();
		
	}
}
