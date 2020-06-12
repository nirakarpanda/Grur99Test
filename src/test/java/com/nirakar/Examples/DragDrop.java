package com.nirakar.Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DragDrop {
	WebDriver driver;
	@BeforeClass
	public void browseropen(){
		System.setProperty("webdriver.chrome.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\chromedriver.exe");        
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void browserclose(){
		driver.quit();
		
	}
	@Test
	public void draganddrop(){
		WebElement dragElement = driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		  WebElement dropElement = driver.findElement(By.xpath(".//*[@id='droppable']"));
		  Actions dragdrop= new Actions(driver);
		  dragdrop.dragAndDrop(dragElement,dropElement).click().perform();
		
		
		
	}

}
