package com.example.qa.Example_projecr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class firstday {

	public static void main(String[] args) throws Exception {
	//setup system	
   System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");   
   ChromeOptions ops = new ChromeOptions();
   ops.addArguments("--remote-allow-origins=*");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.dell.com/en-us");
   driver.manage().window().maximize();
   Thread.sleep(5000);
   WebElement tom = driver.findElement(By.id("mh-search-input"));   
   tom.sendKeys("Monitor");
   Thread.sleep(5000);
   driver.quit();
   
	}

}
