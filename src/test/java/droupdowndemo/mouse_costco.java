package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse_costco {
@Test
public void rayba() throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
    ChromeOptions ops = new  ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.costco.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement searchfield = driver.findElement(By.id("search-field"));
    searchfield.sendKeys("iphone  15 pro max");
    Thread.sleep(3000);
    WebElement searchbutton =driver.findElement(By.xpath("//i[@automation-id=\"searchWidgetButton\"]"));    
    searchbutton.click();
    Thread.sleep(3000);
    driver.navigate().back();
    Actions as = new Actions(driver);
    as.moveToElement(driver.findElement(By.id("navigation-dropdown"))).build().perform();
    Thread.sleep(3000);
    WebElement a = driver.findElement(By.linkText("Computers"));
    
    a.click();
    Thread.sleep(3000);
    driver.close();
    
}
}
