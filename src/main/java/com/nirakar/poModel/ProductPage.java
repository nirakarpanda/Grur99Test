package com.nirakar.poModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='footer']/section[2]/ul/li[1]/a[1]")
	WebElement product_1_name;
	
	@FindBy(xpath=".//*[@id='footer']/section[2]/ul/li[1]/a[2]/img")
	WebElement product_1_image;
	
	@FindBy(xpath=".//*[@id='footer']/section[2]/ul/li[1]/a[3]")
	WebElement link_details;
	//.//*[@id='footer']/section[2]/ul/li[1]/a[3]
	//.//*[@id='footer']/section[2]/ul/li[1]/a[3]
	
	@FindBy(xpath=".//*[@id='single_product_page_container']/div[1]/div[2]/form/div[1]/p[2]/span")
	WebElement product_price;
	//.//*[@id='single_product_page_container']/div[1]/div[2]/form/div[1]/p[2]/span
	//.//*[@id='single_product_page_container']/div[1]/div[2]/form/div[1]/p[2]/span
	
	@FindBy(xpath=".//*[@id='single_product_page_container']/div[1]/div[2]/form/div[2]/div[1]/span/input")
	WebElement addtokart;
	@FindBy(xpath=".//*[@id='menu-item-33']/a")
	WebElement product_catogery;
	
	public ProductPage(WebDriver idriver){
		this.driver=idriver;
		PageFactory.initElements(driver,this);
	}
	
	public void category(){
		
		 Actions actions = new Actions(driver);
	       //  WebElement moveonmenu = driver.findElement(By.xpath("//*[@id='js_2h']"));
	         actions.moveToElement(product_catogery).perform();
	          List<WebElement> links = driver.findElements(By.xpath(".//html/body/div[2]/div/div/header/nav/ul/li[2]/ul/li//a"));
	      int list_count=links.size();
	      for(int i=0;i<list_count;i++){
	    	  String s=links.get(i).getText();
	    //	String s=  name.getAttribute("innerHTML");
	    	
	    	 System.out.println("names are "+s);
	    	 
	    	 if(s.equalsIgnoreCase("<span></span>iPads")){
	    		 System.out.println("before click");
	    		//.click();
	    		 System.out.println("after click");
	    		 break; 
	    	 }
	}}
	 public void clickproductdetails(){

		 link_details.click();
		 System.out.println("product page clicked");

 }
	 public String  productPrice(){
		 
		 String productprice1=product_price.getText();
		 return productprice1;
	 }

	 public void clickaddtokart(){
		 addtokart.click();
		 System.out.println("product added to cart");
		 
	 }
}
