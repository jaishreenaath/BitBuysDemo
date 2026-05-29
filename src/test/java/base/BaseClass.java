package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.DriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static ExtentSparkReporter spark;
	
	public static ExtentReports extent;
	
	public static void startReport()
	{
		spark = new ExtentSparkReporter("./Reports/Basic.html");
		
		extent = new ExtentReports();
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Project", "Bitbuys Demo");
		
		extent.setSystemInfo("Tester", "Jaishreenaatth");
	}

	public static void stopReport()
	{	
		extent.flush();	
	}
	
	public static void url(String url)
	{
		DriverManager.getDriver().get(url);
	}
	
	public static void click(WebElement ele)
	{
		ele.click();
	}
	
	public static WebElement id(String id)
	{
		return DriverManager.getDriver().findElement(By.id(id));
	}

	public static WebElement name(String name)
	{
		return DriverManager.getDriver().findElement(By.name(name));
	}
	
	public static WebElement xpath(String xpath)
	{
		return DriverManager.getDriver().findElement(By.xpath(xpath));
	}
	
	public static void hold(int a)
	{
		try {
			Thread.sleep(a);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
