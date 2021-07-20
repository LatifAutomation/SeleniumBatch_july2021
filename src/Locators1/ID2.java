package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID2 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.manage().window().maximize();
		
		//Business email
		
		driver.findElement(By.id("usernameField")).sendKeys("Test");
		
		//Password
		
		
		driver.findElement(By.id("passwordField")).sendKeys("Test@1234");
		
		
	}

}
