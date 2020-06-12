package com.nirakar.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.Log4jEntityResolver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClase {

	
	public String baseUrl ="http://demo.guru99.com/V4/";
	public String username="mngr265477";
	public String password="nEsubup";
	public static WebDriver driver;
	 public static Logger logger;

	@BeforeTest
	//@Parameters("browserValue")
	//public void OpenBrowser(String browserValue)
	public void setup()
	{
		
			
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//Drivers//chromedriver.exe");  
			 driver=new ChromeDriver();
			 
			  logger = Logger.getLogger("guruBanking");
			 PropertyConfigurator.configure("log4j.properties");
			 
				//driver = new FirefoxDriver();
		                
		            //    driver.get("http://store.demoqa.com/");
		 
			/*  if(browserValue.equalsIgnoreCase("firefox")) {
				// System.setProperty("webdriver.gecko.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\geckodriver.exe");        
				     
				//	WebDriver driver = new FirefoxDriver();
				  System.out.println("browser value="+browserValue);
				  driver = new FirefoxDriver();
				  System.out.println("after firefox");
				  driver.get("http://store.demoqa.com/");
			 
			  // If browser is IE, then do this	  
			 
			  }else if (browserValue.equalsIgnoreCase("crome")) { 
			 
				  // Here I am setting up the path for my IEDriver
			 
				 System.setProperty("webdriver.chrome.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\chromedriver.exe");      
					
					Reporter.log("=====Browser Session Started=====", true);
					
			                driver=new ChromeDriver();
					//driver = new FirefoxDriver();
			                
			                driver.get("http://store.demoqa.com/");
			 
		  } 
   	*/
       //Create Login Page object
			//  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
      		driver.manage().window().maximize();
      		

              //  System.out.println(driver);
               
		
	//	driver.get("http://demo.guru99.com/V4/");
		
		Reporter.log("=====Application Started=====", true);
	}
	
	
	@AfterClass
	public void tearDown()
	{
			if(driver!=null){
		driver.quit();
		}
		Reporter.log("=====Browser Session End=====", true);
		
	}

}
