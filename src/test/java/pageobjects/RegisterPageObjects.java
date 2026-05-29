package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class RegisterPageObjects extends BaseClass{
	
	WebDriver driver;
	
	public RegisterPageObjects(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id ="username")
	private WebElement username;
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id = "confirmpassword")
	private WebElement confirmpass;
	
	@FindBy(id = "terms-agreement")
	private WebElement checkbox;
	
	@FindBy(id = "submit")
	private WebElement submit;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
}
