package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		

	}

}
