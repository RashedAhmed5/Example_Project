package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class mous_overdemo {
@Test
public void tom() throws Exception{
	 System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	    ChromeOptions ops = new  ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.dell.com/en-us");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
	    Actions vc = new Actions(driver);
	    vc.moveToElement(driver.findElement(By.xpath("/html/body/main/section[1]/header/"
	    		+ "div[2]/div[2]/nav/ul/li[6]/ul/li[11]/button"))).build().perform();	    
	    WebElement bb =driver.findElement(By.linkText("View All Electronics & Accessories Deals"));
	    bb.click();  	    	  	  	   
	    Thread.sleep(3000);   	     
	    driver.close();
	    
	}
}
