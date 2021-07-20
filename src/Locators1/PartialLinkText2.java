package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText2 {

	public static void main(String[] args) 
	{
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/PartialLinkText2.html");
		
		driver.manage().window().maximize();
		
		
		String text = driver.findElement(By.partialLinkText("2")).getText();
		
		System.out.println(text);
		
		
	}

}
