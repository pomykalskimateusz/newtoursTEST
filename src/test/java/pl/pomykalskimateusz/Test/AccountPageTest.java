package pl.pomykalskimateusz.Test;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.pomykalskimateusz.PageObject.AccountPage;
import pl.pomykalskimateusz.PageObject.ItineraryPage;
import pl.pomykalskimateusz.PageObject.MainPage;
import pl.pomykalskimateusz.PageObject.ProfilePage;

public class AccountPageTest 
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
	public void testProfile() throws InterruptedException
	{
		MainPage mp = new MainPage();
		mp.singAs("mati96", "mati96");
		
		AccountPage ap = new AccountPage();
		ap.getProfileButton().click();
		
		ProfilePage pp = new ProfilePage();
		pp.setFirstName("Matas");
		pp.setLastName("maciora");
		pp.setPhone("231 304 578");
		pp.setEmail("elo@elo.pl");
		pp.setAddress("elosiarksa 23", "23/321");
		pp.setCity("Lalkolandia");
		pp.setState("WOT");
		pp.setPostalCode("30123");
		pp.setCountry("UKRAINE");
		pp.getButton().click();
	}
	
	@Test
	public void testItinerary()
	{
		MainPage mp = new MainPage();
		mp.singAs("mati96","mati96");
		
		AccountPage ap = new AccountPage();
		ap.getItineraryButton().click();
		
		ItineraryPage ip = new ItineraryPage();
		//ip.getAllButton().click();
		ip.getCheckedButton().click();
	}
}
