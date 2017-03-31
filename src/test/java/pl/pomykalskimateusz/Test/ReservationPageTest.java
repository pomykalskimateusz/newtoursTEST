package pl.pomykalskimateusz.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.pomykalskimateusz.PageObject.AbstractPage;
import pl.pomykalskimateusz.PageObject.MainPage;
import pl.pomykalskimateusz.PageObject.ReservationPage;
import pl.pomykalskimateusz.PageObject.ReservationSecondPage;
import pl.pomykalskimateusz.PageObject.ReservationThirdPage;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;
public class ReservationPageTest 
{
	private static final String URL = "http://newtours.demoaut.com/mercurywelcome.php";
	@BeforeClass
	public static void setUp()
	{
		getDriver().get(URL);
	}
	
/*	@AfterClass
	public static void tearDown()
	{
		getDriver().close();
		getDriver().quit();
	}
*/	
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
		Thread.sleep(2500);
		
		ReservationSecondPage rsp = new ReservationSecondPage();
		rsp.getThirdDepartOption().click();
		rsp.getSecondReturnOption().click();
		rsp.getContinueButton().click();
		Thread.sleep(2500);
		
		ReservationThirdPage rtp = new ReservationThirdPage();
		
		rtp.setFirstName_1("lukas");
		rtp.setLastName_1("lukasinski");
		rtp.setMeal_1("Hindu");
		
		rtp.setBillAddress("eloo321", "123oole");
		rtp.setBillCity("Bicland");
		rtp.setBillState("Stanowy");
		rtp.setBillZip("32008");
		rtp.setBillCountry("UNITED STATES");
		
		rtp.setDelAddress("eldsoo321", "1da3oole");
		rtp.setDelCity("Bicdassssssssssland");
		rtp.setDelState("Stanowydsa");
		rtp.setDelZip("32008ds");
		rtp.setDelCountry("UNITED STATES");
		
		//rtp.getTicketLessRadioButton().click();
		Thread.sleep(2500);
	//	rtp.getButton().click();
	}
}
