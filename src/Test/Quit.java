package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Quit {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		//driver.close();
		
		driver.quit();
		
		

	}

}
