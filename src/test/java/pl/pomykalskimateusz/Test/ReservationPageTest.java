package pl.pomykalskimateusz.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.pomykalskimateusz.PageObject.AbstractPage;
import pl.pomykalskimateusz.PageObject.MainPage;
import pl.pomykalskimateusz.PageObject.ReservationPage;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;
public class ReservationPageTest 
{
	private static final String URL = "http://newtours.demoaut.com/mercurywelcome.php";
	@BeforeClass
	public static void setUp()
	{
		getDriver().get(URL);
	}
	
	@AfterClass
	public static void tearDown()
	{
		getDriver().close();
		getDriver().quit();
	}
	
	@Test
	public void testReservation() throws InterruptedException
	{
		MainPage mp = new MainPage();
		mp.singAs("mati96", "mati96");
		
		ReservationPage rp = new ReservationPage();
		rp.getOneWayRadioButton().click();
		rp.setPassengers("1");
		rp.setFromPort("London");
		rp.setFromMonth("May");
		rp.setFromDay("13");
		rp.setToPort("Paris");
		rp.setToMonth("October");
		rp.setToDay("3");
		rp.getFirstClass().click();
		rp.setAirlines("Pangea Airlines");
		rp.getContinueButton().click();
		Thread.sleep(5000);
		
	}
}
