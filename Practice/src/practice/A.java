package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class A {
//void showA()
//	{
//	System.out.println("A class method");
//	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
		

	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@Test
	public void testB()
	{
		System.out.println("test B");
	
	}
	@Test (dependsOnMethods = {"testB,testD"})
	public void testA()
	{
		System.out.println("test A");
		
	}
	@Test ( priority = 1)
	public void testC()
	{
		System.out.println("test C");
		
	}
	@Test ( priority = 2)
	public void testD()
	{
		System.out.println("test D");
		
	}
	@AfterMethod
	public void afterMethod1()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterMethod()
	{
		System.out.println("after method");
	}
}
