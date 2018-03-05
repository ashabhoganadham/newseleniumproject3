package com.practise.session;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
      
		FirefoxDriver fd=new FirefoxDriver();
		
		fd.get("https://www.facebook.com"); //gecko.navigate().to("https://www.facebook.com"); we can navigate url like this statem
		
		fd.manage().window().maximize();
		
		 WebElement var = fd.findElement(By.id("email"));//entering text in the input field and creating a webelement variable to store the value
		
	    var.sendKeys("bhoganadham.asha@yahoo.com");
	
	    //fd.findElement(By.id("email")).clear();//clearing the entered text 
	    //fd.findElement(By.className("inputtext")).sendKeys("manisv");//entering another text in the same field 
	    
	    //fd.findElement(By.xpath(".//*[@id='email']")).sendKeys("manisv");// we can enter by using xpath also
	    
	    //fd.findElement(By.linkText("Log In")).click();// script will automatically click the link
	    
	    //fd.findElement(By.partialLinkText("Log")).click();//we no need to enter the complete link name it is called partial link text
		
		List<WebElement> mvar = fd.findElements(By.tagName("a"));
    
		for(int i=0;i<mvar.size();i++)// to get the link name so we need to iterate by using a variable called i
		{
			if(!mvar.get(i).getText().isEmpty())// to delete empty spaces in the output while printing link names.y empty spaces means there r some hidden links
			{
			 String txt = mvar.get(i).getText();//to print the link names so we need to store in a variable called txt
	         System.out.println(txt);//without creating variable also we can print like this.. without using above statement and system.out.println("mvar.get(i).gettext()");
				}
		
	}
		
	}
	
}
	

