package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class ReservationSecondPage extends AbstractPage
{
	private final String firstDepartOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[3]/td[1]/input";
	private final String secondDepartOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]/input";
	private final String thirdDepartOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input";
	private final String fourthDepartOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input";
	
	private final String firstReturnOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[3]/td[1]/input";
	private final String secondReturnOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[5]/td[1]/input";
	private final String thirdReturnOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input";
	private final String fourthReturnOption_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[9]/td[1]/input";

	@FindBy(xpath=firstDepartOption_xpath)
	WebElement firstDepartOption_radioButton;
	
	@FindBy(xpath=secondDepartOption_xpath)
	WebElement secondDepartOption_radioButton;
	
	@FindBy(xpath=thirdDepartOption_xpath)
	WebElement thirdDepartOption_radioButton;
	
	@FindBy(xpath=fourthDepartOption_xpath)
	WebElement fourthDepartOption_radioButton;
	
	@FindBy(xpath=firstReturnOption_xpath)
	WebElement firstReturnOption_radioButton;
	
	@FindBy(xpath=secondReturnOption_xpath)
	WebElement secondReturnOption_radioButton;
	
	@FindBy(xpath=thirdReturnOption_xpath)
	WebElement thirdReturnOption_radioButton;
	
	@FindBy(xpath=fourthReturnOption_xpath)
	WebElement fourthReturnOption_radioButton;

	@FindBy(name="reserveFlights")
	WebElement continue_button;
	
	public ReservationSecondPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}
	
	public WebElement getFirstDepartOption()
	{
		return firstDepartOption_radioButton;
	}
	
	public WebElement getSecondDepartOption()
	{
		return secondDepartOption_radioButton;
	}
	
	public WebElement getThirdDepartOption()
	{
		return thirdDepartOption_radioButton;
	}

	public WebElement getFourthDepartOption()
	{
		return fourthDepartOption_radioButton;
	}
	
	public WebElement getFirstReturnOption()
	{
		return firstReturnOption_radioButton;
	}
	
	public WebElement getSecondReturnOption()
	{
		return secondReturnOption_radioButton;
	}
	
	
	public WebElement getThirdReturnOption()
	{
		return thirdReturnOption_radioButton;
	}
	
	public WebElement getFourthReturnOption()
	{
		return fourthReturnOption_radioButton;
	}
	
	public WebElement getContinueButton()
	{
		return continue_button;
	}
	
	
}
