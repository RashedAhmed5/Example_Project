package droupdowndemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Window_handle {
	
	@Test
	
	public void window() throws Exception
	{
		
		System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	    ChromeOptions ops = new  ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.paychex.com/login");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);	    
	    driver.findElement(By.xpath("//a[text()='Paychex Flex login']")).click();
	    Set<String> window= driver.getWindowHandles();
	     Iterator<String> ite= window.iterator();
	     
	    String window1= ite.next();
	    String window2= ite.next();
	    driver.switchTo().window(window2);
	    System.out.println("I am second window");
	    Thread.sleep(5000);
	    driver.switchTo().window(window1);	    
	    System.out.println("I am first window");
	    Thread.sleep(5000);
	    driver.quit();
	}
	
	
}
