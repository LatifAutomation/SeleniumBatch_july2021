package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Test");
		
		driver.findElement(By.xpath("input[class='inputtext _58mg _5dba _2ph-']")).sendKeys("Ramesh");
		

	}

}
