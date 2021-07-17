package Test;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetPosition {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		Point p=new Point(100,80);
		
		driver.manage().window().setPosition(p);
		
		
		Point po = driver.manage().window().getPosition();
		
		System.out.println(po);
		
		
		
	}

}
