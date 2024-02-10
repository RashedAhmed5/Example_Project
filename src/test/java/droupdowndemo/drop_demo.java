package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class drop_demo {
 @Test
 public void jahan() throws Exception {
	 
	 System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");   
	   ChromeOptions ops = new ChromeOptions();
	   ops.addArguments("--remote-allow-origins=*");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.ebay.com/");
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	  WebElement searchfield= driver.findElement(By.id("gh-ac"));
	  searchfield.sendKeys("iphone 14 pro max");
	  WebElement searchbutton=driver.findElement(By.id("gh-btn"));
	  searchbutton.click();
	  Select sl = new Select(driver.findElement(By.name("_sacat")));
	  sl.selectByValue("20081");
	  Thread.sleep(3000);
	  ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
	  Thread.sleep(3000);
	  driver.navigate().back();
	  //driver.navigate().forward();
	  System.out.println(driver.findElement(By.xpath("//a[@_sp=\'p4375194.m150506.l9803\']")).getText());
	  System.out.println(driver.getCurrentUrl());
	  driver.close();
 }
	
		 
	
}
