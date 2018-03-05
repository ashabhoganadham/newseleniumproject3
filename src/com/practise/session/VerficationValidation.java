package com.practise.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerficationValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https:\\www.facebook.com");
        
        WebElement v = driver.findElement(By.id("email"));
        v.sendKeys("ashabhoganadham");
        String actvalue = v.getAttribute("value");
      //  String actvalue = driver.findElementByLinkText("Forgotten account?").getText();
        String expvalue = "Forgotten account?";
        
        System.out.println("act value is"  + actvalue);
        System.out.println("exp value is"  + expvalue);
        if(actvalue.contentEquals(expvalue))//we can use equals or contenteqauls or equals ignore case or contains methods for comparing two values
        	
        {
        	System.out.println("both values are aqual so we are getting text");
        }
        
        else
        {
        	System.out.println("values are not equal");//get attribute and get page source are also methods used for verifications and validations of web elements
        }
	}

}
