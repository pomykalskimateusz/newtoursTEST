package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class RegisterPage extends AbstractPage
{
	@FindBy(name="firstName")
	WebElement firstName_text;
	
	@FindBy(name="lastName")
	WebElement lastName_text;
	
	@FindBy(name="phone")
	WebElement phone_text;
	
	@FindBy(name="userName")
	WebElement email_text;
	
	@FindBy(name="address1")
	WebElement address1_text;
	
	@FindBy(name="address2")
	WebElement address2_text;
	
	@FindBy(name="city")
	WebElement city_text;
	
	@FindBy(name="state")
	WebElement state_text;
	
	@FindBy(name="postalCode")
	WebElement postalCode_text;
	
	@FindBy(name="country")
	WebElement country_select;
	
	@FindBy(name="email")
	WebElement userName_text;
	
	@FindBy(name="password")
	WebElement password_text;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword_text;
	
	@FindBy(name="register")
	WebElement register_button;
	
	@FindBy(linkText="sign-in")	// element dostepny po kliknieciu przycisku register_button
	WebElement signIn_button;

	public RegisterPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public void setFirstName(String firstName)
	{
		firstName_text.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		lastName_text.sendKeys(lastName);
	}
	
	public void setPhone(String phone)
	{
		phone_text.sendKeys(phone);
	}
	
	public void setEmail(String email)
	{
		email_text.sendKeys(email);
	}
	 public void setAddress(String address1, String address2)
	 {
		 address1_text.sendKeys(address1);
		 address2_text.sendKeys(address2);
	 }
	 public void setCity(String city)
	 {
		 city_text.sendKeys(city);
	 }
	 public void setState(String state)
	 {
		 state_text.sendKeys(state);
	 }
	 public void setPostalCode(String postalCode)
	 {
		 postalCode_text.sendKeys(postalCode);
	 }
	 public void setCountry(String country_visibleText)
	 {
		 Select s = new Select(country_select);
		 s.selectByVisibleText(country_visibleText);
	 }
	 public void setUserName(String userName)
	 {
		 userName_text.sendKeys(userName);
	 }
	 public void setPassword(String password)
	 {
		 password_text.sendKeys(password);
	 }
	 public void setConfirmPassword(String confirmPassword)
	 {
		 confirmPassword_text.sendKeys(confirmPassword);
	 }
	 public WebElement getRegisterButton()
	 {
		 return register_button;
	 }
	 
	 public WebElement getSignInButton()
	 {
		 return signIn_button;
	 }
	 
}
