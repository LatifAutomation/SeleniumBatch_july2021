package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class getCurrentURL {

	public static void main(String[] args) 
	{
		
       FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//String url = driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());

	}

}
