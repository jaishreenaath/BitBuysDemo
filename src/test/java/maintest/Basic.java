package maintest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pageobjects.RegisterPageObjects;
import utilities.DriverFactory;
import utilities.DriverManager;

public class Basic extends BaseClass{
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		startReport();
		
		DriverFactory.start(br);
		
		driver = DriverManager.getDriver();
		
	}
	
	@AfterClass
	public void tear()
	{
		stopReport();
		
	}
	
	@Test(priority = 0)
	public void registerTest()
	{
		
		RegisterPageObjects r = new RegisterPageObjects(driver);
		
		url("https://new.demozab.com/bitnexus/userpanel/signup");
		
		r.getUsername().sendKeys("jai");
		
		r.getEmailAddress().sendKeys("jai@mailinator.com");
		
		r.getPassword().sendKeys("Shree@123");
		
		r.getConfirmpass().sendKeys("Shree@123");
		
		if (!r.getCheckbox().isSelected()) {
			
			r.getCheckbox().click();
			
		}
		else {
			System.out.println("Checkbox already selected");
		}
		
		hold(5000);
		
	}

}
