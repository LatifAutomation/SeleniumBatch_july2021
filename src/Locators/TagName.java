package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Tagname.html");
		
		driver.manage().window().maximize();
		
		//Username
		
		
		//WebElement ele = driver.findElement(By.tagName("input"));
		
		//ele.sendKeys("Ankita");
		
		
		/*By fe = By.tagName("input");
		
		WebElement ele = driver.findElement(fe);
		
		ele.sendKeys("Ankitaaaaa");*/
		
		driver.findElement(By.tagName("input")).sendKeys("Ankiiii");
		
		
	}

}
