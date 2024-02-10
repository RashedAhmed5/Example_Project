package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ama {
@Test
public void ahn() throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
    ChromeOptions ops = new  ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    Thread.sleep(5000);
   // Actions ac = new Actions(driver);
   // ac.moveToElement(driver.findElement(By.linkText("Groceries"))).build().perform();
    WebElement serchfield=driver.findElement(By.id("twotabsearchtextbox"));
    serchfield.sendKeys("iphone 15 pro");
    WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
    searchbutton.click();
}
}
