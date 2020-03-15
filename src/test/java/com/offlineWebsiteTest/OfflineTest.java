package com.offlineWebsiteTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OfflineTest {
	WebDriver driver=null;
	
	@BeforeSuite
	public void seUp() {

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("C:\\Users\\Admin\\Desktop\\Sellenium\\Offline Website\\index.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test01_login() {
		
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Test
	public void test02_addUser() {
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		driver.findElement(By.xpath("//button[text()='Add User']")).click();
		driver.findElement(By.id("username")).sendKeys("mangesh");
		driver.findElement(By.id("mobile")).sendKeys("5875648967");
		driver.findElement(By.id("email")).sendKeys("mangesh@gmail.com");
		driver.findElement(By.id("Male")).click();
		WebElement state= driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select= new Select(state);
		select.selectByVisibleText("Maharashtra");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.id("submit")).click();
		//Alert alert= driver.switchTo().alert();
		//alert.accept();
		
	}
	
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
}
