package com.corejava;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class testngclass {
  
	ChromeDriver driver;
	@Test
  
  public void f() {

	  System.out.println("testng is working properly");
  }
  @BeforeMethod
  public void beforeMethod() {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
	driver=  new ChromeDriver();
	  driver.get("http:\\www.amazon.in");
	  driver.manage().window().maximize();//to maximise the window
	  
	  driver.manage().deleteAllCookies(); // to delete all the cookies in the website
  
  }

  @AfterMethod
  public void afterMethod() {
  driver.close();
  
  }

}
