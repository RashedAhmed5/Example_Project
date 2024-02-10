
package com.example.qa.Example_projecr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class second_demo {

	public static void main(String[] args) throws Exception{
		 System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");   
		   ChromeOptions ops = new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.demoblaze.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   WebElement loginlink =  driver.findElement(By.id("login2"));
		   loginlink.click();
		   
		   WebElement username = driver.findElement(By.id("loginusername"));
		   username.sendKeys("rida");
		   Thread.sleep(3000);
		   WebElement  password =driver.findElement(By.id("loginpassword"));
		   password.sendKeys("r42322");
		   Thread.sleep(3000);		  
		   driver.close();
	}

}
