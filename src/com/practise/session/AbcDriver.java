package com.practise.session;

import org.openqa.selenium.chrome.ChromeDriver;

public class AbcDriver{
	

	
public static void main(String args[]) throws InterruptedException
{
	
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
       //  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.18.0-win64");
         //System.setProperty("webdriver.ie.driver", "C:\\Users\\hp\\Downloads\\IEDriverServer_x64_3.5.0");
         ChromeDriver driver=new ChromeDriver();
         driver.get("http:\\www.amazon.in");
         driver.manage().window().maximize();//to maximise the window
         
         driver.manage().deleteAllCookies(); // to delete all the cookies in the website
        
          driver.navigate().back();// to get back from url
         
         Thread.sleep(3000);// to synchronize between web page and our script we r giving sometime
         
         driver.navigate().forward();// to forward the web page
         
         Thread.sleep(4000);
         
         driver.navigate().refresh();// to refresh the url
         
         String title=driver.getTitle(); // to get the title name of the page we are creating one variable
        System.out.println(title); // to print the title name
        
         String CurrentUrl=driver.getCurrentUrl(); // to get currenturl so we are creating one variable
         System.out.println(CurrentUrl);
        //driver.close(); to close the current tab in the browser
         
         //driver.quit(); to close all the tabs in the browser
}

}