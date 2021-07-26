package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector4 {

	public static void main(String[] args) 
	{
		
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/CSS%20Selector.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input[id='user'][name='usr']")).sendKeys("Sample");
		
		driver.findElement(By.cssSelector("input[id='pass'][class='pass']")).sendKeys("Test@123");
		
	}

}
