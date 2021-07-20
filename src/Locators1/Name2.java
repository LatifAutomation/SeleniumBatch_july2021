package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name2 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.airbnb.co.in/");
		
		driver.manage().window().maximize();
		
		//fisrt Name
		
		driver.findElement(By.className("_1xq16jy")).sendKeys("Punw");
		
		
		//last Name
		
		//driver.findElement(By.name("lastname")).sendKeys("xbcjdkdkpdkld");
		
		
	}

}
