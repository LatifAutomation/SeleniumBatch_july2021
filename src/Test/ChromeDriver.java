package Test;

import org.openqa.selenium.Dimension;

public class ChromeDriver {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "D://Selenium_Setup//chromedriver_win32/chromedriver.exe");
		
		//org.openqa.selenium.chrome.ChromeDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		
		
		org.openqa.selenium.chrome.ChromeDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size);
		
		
	}

}
