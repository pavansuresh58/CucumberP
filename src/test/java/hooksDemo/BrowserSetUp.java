package hooksDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetUp 
{
	
	public  static WebDriver driver;
	
	//WebDriver type variable
	static ThreadLocal<WebDriver>tdriver =new ThreadLocal<WebDriver>();
	
	public static WebDriver getdriver()
	{
		return tdriver.get();
	}
	
	
	public static WebDriver setdriver()
	{
		//initialize driver
		driver = new ChromeDriver();
		tdriver.set(driver);
		return driver;
	}
	
	
	
}
