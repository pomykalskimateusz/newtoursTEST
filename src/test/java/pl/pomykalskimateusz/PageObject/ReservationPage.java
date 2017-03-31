package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class ReservationPage extends AbstractPage 
{
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")
	WebElement roundTrip_radioButton;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	WebElement oneWay_radioButton;
	
	@FindBy(name="passCount")
	WebElement passCount_select;

	@FindBy(name="fromPort")
	WebElement fromPort_select;
	
	@FindBy(name="fromMonth")
	WebElement fromMonth_select;
	
	@FindBy(name="fromDay")
	WebElement fromDay_select;
	
	@FindBy(name="toPort")
	WebElement toPort_select;
	
	@FindBy(name="toMonth")
	WebElement toMonth_select;
	
	@FindBy(name="toDay")
	WebElement toDay_select;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")
	WebElement economyClass_radioButton;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	WebElement businessClass_radioButton;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")
	WebElement firstClass_radioButton;
	
	@FindBy(name="airline")
	WebElement airline_select;
	
	@FindBy(name="findFlights")
	WebElement continue_button;
	
	public ReservationPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public WebElement getRoundTripRadioButton()
	{
		return roundTrip_radioButton;
	}
	
	public WebElement getOneWayRadioButton()
	{
		return oneWay_radioButton;
	}
	
	public void setPassengers(String passCount_visibleText)
	{
		Select s = new Select(passCount_select);
		s.selectByVisibleText(passCount_visibleText);
	}
	
	public void setFromPort(String fromPort_visibleText)
	{
		Select s = new Select(fromPort_select);
		s.selectByVisibleText(fromPort_visibleText);
	}
	
	public void setFromMonth(String fromMonth_visibleText)
	{
		Select s = new Select(fromMonth_select);
		s.selectByVisibleText(fromMonth_visibleText);
	}
	
	public void setFromDay(String fromDay_visibleText)
	{
		Select s = new Select(fromDay_select);
		s.selectByVisibleText(fromDay_visibleText);
	}
	
	public void setToPort(String toPort_visibleText)
	{
		Select s = new Select(toPort_select);
		s.selectByVisibleText(toPort_visibleText);
	}
	
	public void setToMonth(String toMonth_visibleText)
	{
		Select s = new Select(toMonth_select);
		s.selectByVisibleText(toMonth_visibleText);
	}
	
	public void setToDay(String toDay_visibleText)
	{
		Select s = new Select(toDay_select);
		s.selectByVisibleText(toDay_visibleText);
	}
	
	public WebElement getEconomyClass()
	{
		return economyClass_radioButton;
	}
	
	public WebElement getBusinessClass()
	{
		return businessClass_radioButton;
	}
	
	public WebElement getFirstClass()
	{
		return firstClass_radioButton;
	}
	
	public void setAirlines(String airline_vixibleText)
	{
		Select s = new Select(airline_select);
		s.selectByVisibleText(airline_vixibleText);
	}
	
	public WebElement getContinueButton()
	{
		return continue_button;
	}
}
