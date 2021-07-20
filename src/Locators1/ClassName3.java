package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName3 {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		
		//First Name
		
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Testn");
		

	}

}
