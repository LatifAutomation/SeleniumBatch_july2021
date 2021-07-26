package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstName {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/AbsoluteXpath.html");
		
		driver.manage().window().maximize();
		
		
		//first name
		
		driver.findElement(By.xpath("html/body/div[1]/input[1]")).sendKeys("Akash");
		

	}

}
