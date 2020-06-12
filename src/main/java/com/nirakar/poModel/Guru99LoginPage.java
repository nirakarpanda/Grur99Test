package com.nirakar.poModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage {
	 WebDriver driver;
	 	
	 	

	 @FindBy(name="uid")
		@CacheLookup
		WebElement userid ;
		
		
		
		@FindBy(name="password")
		@CacheLookup
		WebElement pass ;

	    

	    @FindBy(className="entry-title")

	    WebElement titleText;

	    

	    @FindBy(name="btnLogin")

	    WebElement login;

	    

	    public Guru99LoginPage(WebDriver Idriver){

	        this.driver = Idriver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver,this);
	       // System.out.println("pom page object="+driver);

	    }

	    //Set user name in textbox

	    public void setUserName(String strUserName){

	    	userid.sendKeys(strUserName);

	        

	    }

	    

	    //Set password in password textbox

	    public void setPassword(String strPassword){

	    	pass.sendKeys(strPassword);

	    }

	    

	    //Click on login button

	    public void clickLogin(){

	            login.click();

	    }

	    

	    //Get the title of Login Page

	    public String getLoginTitle(){
	    	String titlepage=titleText.getText();
	     return    titlepage;

	    }

	    /**

	     * This POM method will be exposed in test case to login in the application

	     * @param strUserName

	     * @param strPasword

	     * @return

	     */

	    public void loginToGuru99(String strUserName,String strPasword){

	        //Fill user name

	        this.setUserName(strUserName);

	        //Fill password

	        this.setPassword(strPasword);

	        //Click Login button

	        this.clickLogin();
	      
		                

		    }
	    

	    }

	


