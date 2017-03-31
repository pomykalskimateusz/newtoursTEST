package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class AccountPage extends AbstractPage
{
	@FindBy(linkText="SIGN-OFF")
	WebElement signOff_button;
	
	@FindBy(linkText="ITINERARY")
	WebElement itinerary_button;
	
	@FindBy(linkText="PROFILE")
	WebElement profile_button;
	
	public AccountPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public WebElement getSignOffButton()
	{
		return signOff_button;
	}
	
	public WebElement getItineraryButton()
	{
		return itinerary_button;
	}
	
	public WebElement getProfileButton()
	{
		return profile_button;
	}
	
}
