package Test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Dimension d=new Dimension(859,758);
		
		
		driver.manage().window().setSize(d);
		
		
		
		
	}

}
