package pl.pomykalskimateusz.Step;
import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pl.pomykalskimateusz.PageObject.ReservationPage;
import pl.pomykalskimateusz.PageObject.ReservationSecondPage;
import pl.pomykalskimateusz.PageObject.ReservationThirdPage;

public class ReservationPageStepsDefs 
{
	@When("^I fill in first reservation fields for \"([^\"]*)\" person$")
	public void i_fill_in_first_reservation_fields(String person)
	{
		ReservationPage rp = new ReservationPage();
		
		rp.getOneWayRadioButton().click();
		rp.setPassengers(person);
		rp.setFromPort("London");
		rp.setFromMonth("August");
		rp.setFromDay("13");
		rp.setToPort("Paris");
		rp.setToMonth("July");
		rp.setToDay("2");
		rp.getFirstClass().click();
		rp.setAirlines("Pangea Airlines");
		rp.getContinueButton().click();
	}
	
	@Then("^I should see second reservation page$")
	public void i_should_see_second_reservation_page()
	{
		System.out.println("Page title: "+getDriver().getTitle());
	}
	
	@When("^I fill in second reservation fields$")
	public void i_fill_in_third_reservation_page()
	{
		ReservationSecondPage rsp = new ReservationSecondPage();
		rsp.getThirdDepartOption().click();
		rsp.getSecondReturnOption().click();
		rsp.getContinueButton().click();
	}
	
	@Then("^I should see third reservation page$")
	public void i_should_see_third_reservation_page()
	{
		System.out.println("Page title: "+getDriver().getTitle());
	}
	
	@When("^I fill in third reservation fields$")
	public void i_fill_in_third_reservation_fields()
	{
		ReservationThirdPage rtp = new ReservationThirdPage();
		
		rtp.setFirstName_1("Mat");
		rtp.setLastName_1("Pomsosod");
		rtp.setMeal_1("Bland");
		
		rtp.setBillAddress("Miami Heat", "23/2");
		rtp.setBillCity("Los Angeles");
		rtp.setBillState("Stancyjny");
		rtp.setBillZip("3123213");
		rtp.setBillCountry("UNITED STATES");
		
		rtp.getSameAsRadioButton().click();
		rtp.getButton().click();
	}
	
	@Then("^I should see flight confirmation$")
	public void i_should_see_flight_confirmation()
	{
		System.out.println("Page title: "+getDriver().getTitle());
	}
}
