package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName2 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Tagname2.html");
		
		driver.manage().window().maximize();
		
		
		//Email
		
		WebElement ele = driver.findElement(By.tagName("input"));
		
		ele.sendKeys("testZ@test.com");
		
	}

}
