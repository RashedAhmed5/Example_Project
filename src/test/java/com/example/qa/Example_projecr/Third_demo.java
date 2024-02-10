package com.example.qa.Example_projecr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Third_demo {

	public static void main(String[] args) throws Exception {
		 System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");   
		   ChromeOptions ops = new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.ebay.com/");
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
         
         WebElement droupdoun= driver.findElement(By.id("gh-cat"));
         Select sel = new Select(droupdoun);
         //sel.selectByVisibleText("Antiques");
        // Thread.sleep(5000);
        // sel.selectByValue("12576");
         //Thread.sleep(5000);
         sel.selectByIndex(3);
         Thread.sleep(5000);
          driver.close();
	}

}
