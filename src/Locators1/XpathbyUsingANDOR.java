package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathbyUsingANDOR {

	public static void main(String[] args) 
	{
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstnam']")).sendKeys("Tets");

	}

}
