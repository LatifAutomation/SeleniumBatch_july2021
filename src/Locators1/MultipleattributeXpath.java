package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleattributeXpath {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='password_step_input'][@name='reg_passwd__']")).sendKeys("Tets@1234");
		
	}

}
