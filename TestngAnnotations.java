package automation.selenium;  

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
  @Test
  public void iamfirst() {
	  System.out.println("I an @Test");
	  
  }
@BeforeMethod
public void beforemethod() {
	System.out.println("I am @BeforeMethod");
}
@AfterMethod
public void aftermethod() {
	System.out.println("I am @AfterMethod");
}
@BeforeClass
public void beforeclass() {
	System.out.println("I am @BeforeClass");
}
@AfterClass
public void afterclass( ) {
	System.out.println("I am @AfterClass");
}
@BeforeSuite
public void beforesuite( ) {
	System.out.println("I am @BeforeSuite");
}
@AfterSuite
public void aftersuite() {
	System.out.println("I am @AfterSuite");
}
}
