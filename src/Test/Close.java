package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Close {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.close();
		
		
		
	}

}
