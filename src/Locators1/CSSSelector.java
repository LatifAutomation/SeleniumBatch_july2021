package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/CSS%20Selector.html");
		
		driver.manage().window().maximize();
		
		
		//Username
		
		driver.findElement(By.cssSelector("input[name='usr']")).sendKeys("test@1234");
		
		//Password
		
		driver.findElement(By.cssSelector("input[class='pass']")).sendKeys("Teagshshduj");
		

	}

}
