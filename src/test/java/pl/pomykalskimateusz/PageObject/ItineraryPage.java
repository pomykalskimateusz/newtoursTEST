package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class ItineraryPage extends AbstractPage
{
	private final String checked_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/map/area";
	private final String all_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/map/area";

	@FindBy(xpath=checked_xpath)
	WebElement checked_button;
	
	@FindBy(xpath=all_xpath)
	WebElement all_button;
	
	public ItineraryPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public WebElement getCheckedButton()
	{
		return checked_button;
	}
	
	public WebElement getAllButton()
	{
		return all_button;
	}
}
