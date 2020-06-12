package com.nirakar.poModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
public static void main(String[] args) {
        
        //initialize Chrome driver
        System.setProperty("webdriver.chrome.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\chromedriver.exe");        
         WebDriver driver = new ChromeDriver(); 
         WebElement element;
          
         //Open gmail
         driver.get("http://store.demoqa.com/products-page/your-account/");
        
         element = driver.findElement(By.name("log"));
         String uname ="nirakarpanda";
         element.sendKeys(uname);
        
          
      
          
         driver.findElement(By.id("signIn")).click();
        // driver.findElement(By.xpath("//div='z0']/div")).click();
         //Submit button
        // element.submit();
        // element1.submit();
          
          
        
          
          
}

}
