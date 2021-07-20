package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText2 {

	public static void main(String[] args) 
	{

      ChromeDriver driver=new ChromeDriver();
      
      driver.get("file:///C:/Users/pc/Desktop/HTML/LinkText2.html");
      
      driver.manage().window().maximize();
      
     driver.findElement(By.tagName("a")).click();
     
     
     
     
     driver.findElement(By.linkText("Login")).click();
      
      
	}

}
