package utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver) {
		
		tldriver.set(driver);		
	}
	
	public static WebDriver getDriver()
	{
		return tldriver.get();
	}
	
	public static void unload()
	{
		
		tldriver.remove(); // To remove the old objects in thread local memory
		
	}
}
 