package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class ReservationFourthPage extends AbstractPage
{
	private final String backToFlights_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[1]/a/img";
	private final String backToHome_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[2]/a/img";
	private final String logOut_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img";

	@FindBy(xpath = backToFlights_xpath)
	WebElement backToFlights_button;
	
	@FindBy(xpath = backToHome_xpath)
	WebElement backToHome_button;
	
	@FindBy(xpath = logOut_xpath)
	WebElement logOut_button;
	
	public ReservationFourthPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public WebElement getBackToFlightsButton()
	{
		return backToFlights_button;
	}
	
	public WebElement getBackToHomeButton()
	{
		return backToHome_button;
	}
	
	public WebElement getLogOutButton()
	{
		return logOut_button;
	}
}