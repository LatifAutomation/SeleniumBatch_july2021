package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/ID.html");
		
		
		driver.manage().window().maximize();
		
		//First Name
		
		driver.findElement(By.tagName("input")).sendKeys("Ankita");
		
		//Last Name
		
		driver.findElement(By.id("lname")).sendKeys("Khfdd");
		
		
		
	}

}
