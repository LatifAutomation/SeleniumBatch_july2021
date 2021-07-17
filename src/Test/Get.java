package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {

	public static void main(String[] args) 
	
	{
		//System.setProperty("webdriver.gecko.driver", "D://Selenium_Setup/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		
	}

}
