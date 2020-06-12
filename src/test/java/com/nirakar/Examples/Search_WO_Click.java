package com.nirakar.Examples;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.python.modules.thread.thread;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Search_WO_Click {
	@Test
	public void fileUpload(){
		
		
	}
	
	@Test
	public void SearchWithOutClick() throws IOException, InterruptedException, AWTException{
		//nirnnnninnnnnnnn
		/*WebElement element =driver.findElement(By.name("q"));
		Actions a = new Actions(driver);
		element.sendKeys("java");
		System.out.println("entered values=="
				+ ""+element.getAttribute("value"));
		element.sendKeys(Keys.ENTER);
		a.sendKeys(Keys.chord(Keys.CONTROL,"A")).perform();;
		WebElement image = driver.findElement(By.xpath(".//*[@id='hdtb-msb']/div[1]/div[4]/a"));
		image.click();
		WebElement image2 = driver.findElement(By.xpath(".//*[@id='rg_s']/div[3]/a/img"));
		a.contextClick(image2).build().perform();
		
		//image2.click();
		//WebElement image3 = driver.findElement(By.xpath(".//*[@id='irc_cc']/div[2]/div[1]/div[2]/div[2]/a/img"));
		 //Thread.sleep(2000);
		 a.sendKeys(Keys.CONTROL,"V").build().perform();
		 Thread.sleep(2000);
		// a.sendKeys(Keys.CONTROL,"s").build().perform();
		//Actions action = new Actions(driver);
		System.out.println("test");
		boolean breakIt = true;
        while (true) {
        breakIt = true;
        try {
            // write your code here
        	a.contextClick(image2).build().perform();
    		System.out.println("test2");
        } catch (Exception e) {
            if (e.getMessage().contains("element is not attached")) {
                breakIt = false;
            }
        }
        if (breakIt) {
            break;
        }

    }
       // Thread.sleep(4000);
		
		
		//action.sendKeys(Keys.CONTROL, "v").build().perform();
		*/
		
		 Runtime.getRuntime().exec("E:\\SOfT\\java\\Selenium\\save.exe"); 
        Thread.sleep(2000);
 
		 // Robot robot = new Robot();
		  // To press D key.
		 // robot.keyPress(KeyEvent.);
		  // To press : key.
		 /* robot.keyPress(KeyEvent.VK_SHIFT);
		  robot.keyPress(KeyEvent.VK_SEMICOLON);
		  robot.keyRelease(KeyEvent.VK_SHIFT);
		  // To press \ key.
		  robot.keyPress(KeyEvent.VK_BACK_SLASH);
		  // To press "test" key one by one.
		  robot.keyPress(KeyEvent.VK_T);
		  robot.keyPress(KeyEvent.VK_E);
		  robot.keyPress(KeyEvent.VK_S);
		  robot.keyPress(KeyEvent.VK_T);*/
		  // To press Save button.
		//  robot.keyPress(KeyEvent.VK_ENTER);  
	}
		WebDriver driver;
		@BeforeClass
		public void browseropen(){
			System.setProperty("webdriver.chrome.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\chromedriver.exe");        
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("http://google.com/");
	         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@AfterClass
		public void browserclose(){
			//driver.quit();
			
		}
		
	}


