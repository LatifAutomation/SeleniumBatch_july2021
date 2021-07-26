package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) 
	{
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/HTML/AbsoluteXpath.html");
		
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//div[3]/a[2]")).click();

	}

}
