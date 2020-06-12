package com.nirakar.Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationOrder {
	@BeforeSuite
	public void Test(){
		System.out.println("before suite");
	}
	@AfterSuite
	public void Test12(){
		System.out.println("after suite");
	}
	@BeforeClass
	public void Test1(){
		System.out.println("before class");
	}
	@BeforeMethod
	public void Test2(){
		System.out.println("before method");
	}

	@BeforeTest
	public void Test3(){
		System.out.println("before test");
	}
	@BeforeGroups
	public void Test4(){
		System.out.println("before group");
	}
	
	@AfterSuite
	public void Test5(){
		System.out.println("After ==suite");
	}
	
	@AfterClass
	public void Test6(){
		System.out.println("After class");
	}
	@AfterMethod
	public void Test7(){
		System.out.println("after method");
	}

	@AfterTest
	public void Test8(){
		System.out.println("after test");
	}
	@org.testng.annotations.Test(priority=0)
	public void Test11(){
		System.out.println("test case11 priority=0");
	}
	@org.testng.annotations.Test(priority=-2)
	public void Test16(){
		System.out.println("test case 16 priority=---2");
	}
	@org.testng.annotations.Test
	public void Test13(){
		System.out.println("test case 13 without priority");
	}
	@org.testng.annotations.Test(priority=1)
	public void Test15(){
		System.out.println("test case 15 priority=1");
	}
	@AfterGroups
	public void Test10(){
		System.out.println("after group");
	}
}
