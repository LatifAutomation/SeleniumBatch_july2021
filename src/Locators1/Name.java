package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) 
	{

      ChromeDriver abc=new ChromeDriver();
      
      abc.get("file:///C:/Users/pc/Desktop/HTML/Name.html");
      
      abc.manage().window().maximize();
      
      //Fname
      
     abc.findElement(By.tagName("input")).sendKeys("dshdhguf");
     
     //Last Name
     
     abc.findElement(By.id("lname")).sendKeys("vzshsk");
      
     //email
     
     abc.findElement(By.name("email")).sendKeys("Test@1234");
      
	}

}
