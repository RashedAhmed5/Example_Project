package com.example.qa.Example_projecr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fifth {

	public static void main(String[] args) throws Exception {
		
			// TODO Auto-generated method stub
	    System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	    ChromeOptions ops = new  ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	   // Thread.sleep(3000);
	    WebElement creataccount =driver.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']"));
	    creataccount.click();
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("rayna");
        
        
	}

}
