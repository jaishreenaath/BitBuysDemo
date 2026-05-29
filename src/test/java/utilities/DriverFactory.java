package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver driver;
	
	
	
	public static void start(String br)
	{	
		
		if(DriverManager.getDriver()==null)
		{
			
			if (br.equalsIgnoreCase("chrome")) 
			{
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions c = new ChromeOptions();

				c.addArguments("--start-maximized");

				driver = new ChromeDriver(c);
				
				Duration d = Duration.ofSeconds(15);
				
				driver.manage().timeouts().implicitlyWait(d);
				
				driver.manage().deleteAllCookies();
				
				DriverManager.setDriver(driver);
			}
			
			else if (br.equalsIgnoreCase("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				
				FirefoxOptions f = new FirefoxOptions();

				f.addArguments("--start-maximized");

				driver = new FirefoxDriver(f);
				
				Duration d = Duration.ofSeconds(15);
				
				driver.manage().timeouts().implicitlyWait(d);
				
				driver.manage().deleteAllCookies();
				
				DriverManager.setDriver(driver);
				
			}
			
		}
		
		
	}
	
	public static void stop()
	{
		if(DriverManager.getDriver()!=null)
		{
			DriverManager.getDriver().quit();
			
			DriverManager.unload();
			
			driver = null;
		}
	}

}
