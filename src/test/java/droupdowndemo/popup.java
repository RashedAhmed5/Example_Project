package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class popup {

	@Test
	public void pop() throws Exception{
		System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	    ChromeOptions ops = new  ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    	 
	    WebElement username=driver.findElement(By.id("login1"));
	    username.sendKeys("gldjllg");
	    WebElement click=driver.findElement(By.name("proceed"));
	    click.click();
	    Thread.sleep(3000);
	   driver.switchTo().alert().accept();	   
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("barisl");	   
	    Thread.sleep(3000);
	    driver.close();
	    
	}

}
