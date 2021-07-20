package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/ClassName.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		
		driver.findElement(By.tagName("input")).sendKeys("Tets");
		
		
		//Last Name
		
		driver.findElement(By.id("lname")).sendKeys("Tezdgfgh");
		
		
		
		//Email
		
		
		driver.findElement(By.className("email")).sendKeys("Test@test.com");
		

	}

}
