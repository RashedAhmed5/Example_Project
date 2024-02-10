package droupdowndemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Enter_opt {
@Test
public void ent() throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
	ChromeOptions ops = new  ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/finance/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement searchfield =driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div[3]/div[3]/div/div/div/div[1]/input[2]"));
	searchfield.sendKeys("google");
	WebElement Enter =driver.findElement(By.xpath("/html/body/c-wiz[2]/div/div[3]/div[3]/div/div/div/div[1]/input[2]"));
	Enter.sendKeys(Keys.ENTER);
	driver.close();

}
}
