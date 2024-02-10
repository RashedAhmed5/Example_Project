package com.example.qa.Example_projecr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sixth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");   
		   ChromeOptions ops = new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.ebay.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   WebElement searchop =driver.findElement(By.id("gh-ac"));
		   searchop.sendKeys("laptop");
		   WebElement chi =driver.findElement(By.id("gh-btn"));
		   chi.click();
		   driver.close();
	}

}
