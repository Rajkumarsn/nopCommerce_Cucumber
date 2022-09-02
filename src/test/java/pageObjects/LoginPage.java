package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="Email")
	@CapcheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CapcheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	@CapcheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	@CapcheLookup
	WebElement linkLogout;
	
	
	public void setUserName(String username)
	{
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	public void cilckLogin()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{   
		linkLogout.click();
		
	}
	

}
