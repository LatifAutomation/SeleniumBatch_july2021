package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		//Xpath By attribute first Name
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ank");
		
		//Xpath By attribute Last Name
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("gdchd");
	}

}
