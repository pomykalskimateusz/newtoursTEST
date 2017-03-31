package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.pomykalskimateusz.Setup.SeleniumDriver;

public class ReservationThirdPage extends AbstractPage {

	private final String ticketLess_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input";
	private final String sameAs_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td[2]/input";
	@FindBy(name = "passFirst0")
	WebElement firstName_1_text;

	@FindBy(name = "passLast0")
	WebElement lastName_1_text;

	@FindBy(name = "pass.0.meal")
	WebElement meal_1_select;

	@FindBy(name = "passFirst1")
	WebElement firstName_2_text;

	@FindBy(name = "passLast1")
	WebElement lastName_2_text;

	@FindBy(name = "pass.1.meal")
	WebElement meal_2_select;

	@FindBy(name = "passFirst2")
	WebElement firstName_3_text;

	@FindBy(name = "passLast2")
	WebElement lastName_3_text;

	@FindBy(name = "pass.2.meal")
	WebElement meal_3_select;

	@FindBy(name = "passFirst3")
	WebElement firstName_4_text;

	@FindBy(name = "passLast3")
	WebElement lastName_4_text;

	@FindBy(name = "pass.3.meal")
	WebElement meal_4_select;
	
	@FindBy(name="billAddress1")
	WebElement billAddress1_text;
	
	@FindBy(name="billAddress2")
	WebElement billAddress2_text;
	
// ponizej Billing Address
	
	@FindBy(name="billCity")
	WebElement billCity_text;
	
	@FindBy(name="billState")
	WebElement billState_text;
	
	@FindBy(name="billZip")
	WebElement billPostalCode_text;
	
	@FindBy(name="billCountry")
	WebElement billCountry_select;
	
	@FindBy(xpath=ticketLess_xpath)
	WebElement ticketLess_radioButton;
	
 // ponizej Delivery Address
	
	@FindBy(name="delAddress1")
	WebElement delAddress1_text;
	
	@FindBy(name="delAddress2")
	WebElement delAddress2_text;
	
	@FindBy(name="delCity")
	WebElement delCity_text;
	
	@FindBy(name="delState")
	WebElement delState_text;
	
	@FindBy(name="delZip")
	WebElement delPostalCode_text;
	
	@FindBy(name="delCountry")
	WebElement delCountry_select;
	
	@FindBy(xpath=sameAs_xpath)
	WebElement sameAs_radioButton;
	
	@FindBy(name="buyFlights")
	WebElement buyFlights_button;
	
	
	
	public ReservationThirdPage()
	{
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	public void setFirstName_1(String firstName) {
		firstName_1_text.sendKeys(firstName);
	}

	public void setLastName_1(String lastName) {
		lastName_1_text.sendKeys(lastName);
	}

	public void setMeal_1(String meal_visibleText) {
		Select s = new Select(meal_1_select);
		s.selectByVisibleText(meal_visibleText);
	}

	public void setFirstName_2(String firstName) {
		firstName_2_text.sendKeys(firstName);
	}

	public void setLastName_2(String lastName) {
		lastName_2_text.sendKeys(lastName);
	}

	public void setMeal_2(String meal_visibleText) {
		Select s = new Select(meal_2_select);
		s.selectByVisibleText(meal_visibleText);
	}

	public void setFirstName_3(String firstName) {
		firstName_3_text.sendKeys(firstName);
	}

	public void setLastName_3(String lastName) {
		lastName_3_text.sendKeys(lastName);
	}

	public void setMeal_3(String meal_visibleText) {
		Select s = new Select(meal_3_select);
		s.selectByVisibleText(meal_visibleText);
	}

	public void setFirstName_4(String firstName) {
		firstName_4_text.sendKeys(firstName);
	}

	public void setLastName_4(String lastName) {
		lastName_4_text.sendKeys(lastName);
	}

	public void setMeal_4(String meal_visibleText) {
		Select s = new Select(meal_4_select);
		s.selectByVisibleText(meal_visibleText);
	}

	public void setBillAddress(String address1, String address2)
	{
		billAddress1_text.sendKeys(address1);
		billAddress2_text.sendKeys(address2);
	}
	
	public void setBillCity(String city)
	{
		billCity_text.sendKeys(city);
	}
	
	public void setBillState(String state)
	{
		billState_text.sendKeys(state);
	}
	
	public void setBillZip(String postalCode)
	{
		billPostalCode_text.sendKeys(postalCode);
	}
	
	public void setBillCountry(String country_visibleText)
	{
		Select s = new Select(billCountry_select);
		s.selectByVisibleText(country_visibleText);
	}
	
	public void setDelAddress(String address1, String address2)
	{
		delAddress1_text.sendKeys(address1);
		delAddress2_text.sendKeys(address2);
	}
	
	public void setDelCity(String city)
	{
		delCity_text.sendKeys(city);
	}
	
	public void setDelState(String state)
	{
		delState_text.sendKeys(state);
	}
	
	public void setDelZip(String postalCode)
	{
		delPostalCode_text.sendKeys(postalCode);
	}
	
	public void setDelCountry(String country_visibleText)
	{
		Select s = new Select(delCountry_select);
		s.selectByVisibleText(country_visibleText);
	}
	
	public WebElement getButton()
	{
		return buyFlights_button;
	}
	
	public WebElement getTicketLessRadioButton()
	{
		return ticketLess_radioButton;
	}
	
	public WebElement getSameAsRadioButton()
	{
		return sameAs_radioButton;
	}
	
}
