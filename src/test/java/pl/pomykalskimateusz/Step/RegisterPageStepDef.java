package pl.pomykalskimateusz.Step;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;
import pl.pomykalskimateusz.PageObject.RegisterPage;

public class RegisterPageStepDef 
{
	private final String REGISTER_URL = "http://newtours.demoaut.com/mercuryregister.php";
	
	@Given("^I open register page$")
	public void i_open_register_page()
	{
		getDriver().get(REGISTER_URL);
	}
	
	@When("^I fill in register fields$")
	public void i_fill_in_register_fields()
	{
		RegisterPage rp = new RegisterPage();
		
		rp.setFirstName("Mat");
		rp.setLastName("mataaa");
		rp.setPhone("123 432 532");
		rp.setEmail("elo@elo.pl");
		rp.setAddress("elo 3/2", "23/1");
		rp.setCity("Kolonia");
		rp.setState("stan");
		rp.setPostalCode("23132");
		rp.setCountry("TOGO");
		rp.setUserName("qwerty123");
		rp.setPassword("qwerty123");
		rp.setConfirmPassword("qwerty123");
		rp.getRegisterButton().click();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^I should see thanks for registation$")
	public void i_should_see_thanks_for_registation()
	{
		System.out.println("Page title: "+getDriver().getTitle());
		Assert.assertEquals("Wrong page title", "Register: Mercury Tours", getDriver().getTitle());
	}
	
}
