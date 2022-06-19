package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

abstract public class Vehicle{
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
public void test1()
{
	System.out.println("test 1");
	
}
@AfterMethod
public void afterMethod()
{
	System.out.println("after method");
}
@AfterClass
public void afterMethid()
{
	System.out.println("after method");
}
}
