package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByWildcard {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://study.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div/form/div/input")).sendKeys("Tets");
		
		

	}

}
