package com.nirakar.script;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nirakar.poModel.Guru99LoginPage;
import com.nirakar.poModel.HomePage;
import com.nirakar.poModel.ProductPage;



public class LoginPageTest extends BaseClase {
	
	@Test(priority=0)
	public void MoveToLoginPage(){
	driver.get(baseUrl);
	
	logger.info("url opened");
		Guru99LoginPage guru99LoginPage= new Guru99LoginPage(driver);
		guru99LoginPage.setUserName(username);
		guru99LoginPage.setPassword(password);
		guru99LoginPage.clickLogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")){
			
			Assert.assertTrue(true);
			
			logger.info("test case passed");
		}else{
			
			Assert.assertFalse(false);
		}
	}
	   

   // @Test(priority=1)

    public void test_Home_Page_Appear_Correct(){
    	
    	
        //Create Login Page object
    		 Guru99LoginPage loginpageobj = new Guru99LoginPage(driver);
    		 
   

    //Verify login page title

   String loginPageTitle = loginpageobj.getLoginTitle();
   System.out.println("loginPageTitle="+loginPageTitle);

    Assert.assertTrue(loginPageTitle.contains("Your"));

    //login to application

    loginpageobj.loginToGuru99("nirakarpanda", "G))HC8J@(csuh%Nm");

    // go the next page
   // loginpageobj.setUserName("nirakarpanda");

    

    //Verify home page

 
    }
   // @Test(priority=2)
    public void product_1_Details(){
    	ProductPage productPage = new ProductPage(driver);
    	
    	productPage.category();
    	 //String productprice = productPage.productPrice();
    	// System.out.println("price of product"+productprice);
    	 
    	// productPage.clickaddtokart();
    }

    

}
