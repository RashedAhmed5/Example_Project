package com.example.qa.Example_projecr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class forth_selenu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chrome.exe");
    ChromeOptions ops = new  ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
   // Thread.sleep(5000);
    //WebElement username = driver.findElement(By.name("email"));
    //username.sendKeys("rashed.ahmmed@yahoo.com");
    //WebElement password = driver.findElement(By.name("pass"));
    //password.sendKeys("Rida2013");
    //WebElement login =driver.findElement(By.name("login"));
    //login.click();
    //Thread.sleep(5000);
   
    WebElement creataccount= driver.findElement(By.xpath("//a[@class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']"));
    creataccount.click();
    WebElement firstname =driver.findElement(By.xpath("//input[@fdprocessedid=\"31dtjh\"]"));
    firstname.sendKeys("Rayna");
   // Thread.sleep(3000);
    WebElement lastname =driver.findElement(By.name("lastname"));
    lastname.sendKeys("ahmed");
   // Thread.sleep(3000);
    WebElement passwors = driver.findElement(By.id("password_step_input"));
    passwors.sendKeys("radaa");
  //  Thread.sleep(3000);
  
    WebElement email =driver.findElement(By.id("u_3_g_wm"));
    email.sendKeys("ahmmmed@yahoo.com");
   // Thread.sleep(3000);
    WebElement genderF=driver.findElement(By.xpath("//label[@for=\'u_3_4_3Z\']"));
    genderF.click();
    Thread.sleep(3000);
    WebElement GenderF=driver.findElement(By.xpath("//label[@for=\'u_3_5_QZ\']"));
    GenderF.click();
    Thread.sleep(3000);
    
    
    
    // driver.close();
    
	}

}
