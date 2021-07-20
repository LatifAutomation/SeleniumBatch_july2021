package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/LinkText2.html");
		
		Thread.sleep(300);
		
		
		//Partial Link Text
		
		driver.findElement(By.partialLinkText("Rg")).click();
		
		
	}

}
