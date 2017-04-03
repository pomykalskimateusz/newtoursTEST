package pl.pomykalskimateusz.Step;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;
import pl.pomykalskimateusz.PageObject.SignOnPage;



public class MainPageStepDefs 
{
	private final String BASE_URL = "http://newtours.demoaut.com/";
	private final String SIGN_ON_URL = "http://newtours.demoaut.com/mercurysignon.php";
	
	@Given("^I open main page$")
	public void i_open_main_page()
	{
		getDriver().get(BASE_URL);
	}
	
	@When("^I click link \"([^\"]*)\"$") 
	public void i_click_link(String arg1) throws Throwable
	{
		getDriver().findElement(By.linkText(arg1)).click();
	}
	

	@Then("^I should see contact page$")
	public void i_should_see_contact_page() throws Throwable
	{
		System.out.println("Page title: "+getDriver().getTitle());
		Assert.assertEquals("Under Construction: Mercury Tours", getDriver().getTitle());
	}
	
	@Given("^I open sign on page$")
	public void i_open_sign_on_page()
	{
		getDriver().get(SIGN_ON_URL);
	}
	
	@When("^I fill in login fields with \"([^\"]*)\" \"([^\"]*)\"$")
	public void I_fill_in_login_fields_with(String login, String pass)
	{
		SignOnPage sop = new SignOnPage();
		sop.setUserName(login);
		sop.setPassword(pass);
		sop.getLoginButton().click();
	}
	
	@Then("^I should see flights reservation page$")
	public void i_should_see_flights_reservation_page()
	{
		System.out.println("Page title: "+getDriver().getTitle());
	}
}
