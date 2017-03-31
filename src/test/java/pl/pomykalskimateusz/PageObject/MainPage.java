package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class MainPage extends AbstractPage
{
	@FindBy(linkText="SIGN-ON")
	WebElement signOn_button;
	
	@FindBy(linkText="REGISTER")
	WebElement register_button;
	
	@FindBy(linkText="SUPPORT")
	WebElement support_button;
	
	@FindBy(linkText="CONTACT")
	WebElement contact_button;
	
	@FindBy(name="userName")
	WebElement userName_text;
	
	@FindBy(name="password")
	WebElement password_text;
	
	@FindBy(name="login")
	WebElement signIn_button;
	
	@FindBy(linkText="Home")
	WebElement home_button;
	
	@FindBy(linkText="Flights")
	WebElement flights_button;
	
	@FindBy(linkText="Hotels")
	WebElement hotels_button;
	
	@FindBy(linkText="Car Rentals")
	WebElement carRentals_button;
	
	@FindBy(linkText="Cruises")
	WebElement cruises_button;
	
	@FindBy(linkText="Destinations")
	WebElement  destinations_button;
	
	@FindBy(linkText="Vacations")
	WebElement vacations_button;
	
	public MainPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public void linkSignOn()
	{
		signOn_button.click();
	}
	
	public void linkRegister()
	{
		register_button.click();
	}
	
	public void linkSupport()
	{
		support_button.click();
	}
	
	public void linkContact()
	{
		contact_button.click();
	}

	public void linkHome()
	{
		home_button.click();
	}
	
	public void linkFlights()
	{
		flights_button.click();
	}
	
	public void linkHotels()
	{
		hotels_button.click();
	}
	
	public void linkCarRentals()
	{
		carRentals_button.click();
	}
	
	public void linkCruises()
	{
		cruises_button.click();
	}
	
	public void linkDestinations()
	{
		destinations_button.click();
	}
	
	public void linkVacations()
	{
		vacations_button.click();
	}
	
	public void singAs(String login, String password)
	{
		userName_text.sendKeys(login);
		password_text.sendKeys(password);
		signIn_button.click();
	}
}
