package com.nirakar.poModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='account']/a/span[1]")
	WebElement accountLink;
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement userid ;
	
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement pass ;

	public void clickHomePage() {
System.out.println("click homepage method");
		accountLink.click();

	}
	
	 public  HomePage(WebDriver Idriver){

	        this.driver = Idriver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver,this);
	       // System.out.println("pom page object="+driver);

	    }
}
