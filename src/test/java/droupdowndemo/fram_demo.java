package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class fram_demo {
	@Test
	public void rida() throws Exception {
		System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	    ChromeOptions ops = new  ChromeOptions();
	    ops.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://docs.oracle.com/javase/7/docs/api/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.switchTo().frame("classFrame");
	    System.out.println(driver.findElement(By.xpath("//h1[@class=\"title\"]")).getText());
	    Thread.sleep(5000);	    
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	}

}
