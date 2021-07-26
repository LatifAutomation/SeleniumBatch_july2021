package Locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadymadeAbsolute {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/users/sign_in");
		
		driver.manage().window().maximize();
		
		//Business Email
		
		driver.findElement(By.xpath("/html/body/main/div[4]/section/form/div[1]/div/div[1]/div[4]/div/input")).sendKeys("test@gmail.com");
		
		
		//Password
		
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("Test3sndj");
		
		driver.findElement(By.xpath("//*[@id='user_submit']")).click();

	}

}
