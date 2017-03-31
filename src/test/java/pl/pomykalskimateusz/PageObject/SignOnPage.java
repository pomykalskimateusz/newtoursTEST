package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class SignOnPage extends AbstractPage
{
	@FindBy(name="userName")
	WebElement userName_text;
	
	@FindBy(name="password")
	WebElement password_text;
	
	@FindBy(name="login")
	WebElement login_button;
	
	public SignOnPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public void setUserName(String login)
	{
		userName_text.sendKeys(login);
	}
	public void setPassword(String pass)
	{
		password_text.sendKeys(pass);
	}
	public WebElement getLoginButton()
	{
		return login_button;
	}
	
	
}
