package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName3 {

	public static void main(String[] args)
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/Tagname3.html");
		
		driver.manage().window().maximize();
		
		
		//First Name
		
		WebElement fn = driver.findElement(By.tagName("input"));
		
		fn.sendKeys("Ankita");
		
		
		//Last Name
		
		WebElement ln = driver.findElement(By.tagName("input"));
		
		ln.sendKeys("Kulkarni");
		
		//Email
		
		
		WebElement em = driver.findElement(By.tagName("input"));
		em.sendKeys("test@test.com");
		
		

	}

}
