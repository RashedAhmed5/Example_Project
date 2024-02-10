package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class facebookdrop {
@Test
public void rina() throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
    ChromeOptions ops = new  ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    WebElement creatacct=driver.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']"));
    creatacct.click();
    Thread.sleep(3000);
    WebElement first=driver.findElement(By.xpath("//input[@placeholder=\"First name\"]"));
    first.sendKeys("Rayna");
    WebElement lastn=driver.findElement(By.name("lastname"));
    lastn.sendKeys("ahmed");
    WebElement email=driver.findElement(By.name("reg_email__"));
    email.sendKeys("rarna.ahmed@yahoo.com");
    WebElement pass=driver.findElement(By.id("password_step_input"));
    pass.sendKeys("r1233");
    Thread.sleep(3000);
    Select sl= new Select(driver.findElement(By.id("month")));
    sl.selectByVisibleText("Aug");
    Thread.sleep(3000);
    Select ap = new Select(driver.findElement(By.id("day")));
    ap.selectByValue("1");    
    Thread.sleep(3000);
    Select abc= new Select(driver.findElement(By.id("year")));
    abc.selectByValue("2015");     
    Thread.sleep(3000);
    WebElement fem= driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label"));
    fem.click();
    Thread.sleep(3000);
    WebElement signup=driver.findElement(By.name("websubmit"));
    signup.click();
    Thread.sleep(3000);
    driver.close();
}
}
