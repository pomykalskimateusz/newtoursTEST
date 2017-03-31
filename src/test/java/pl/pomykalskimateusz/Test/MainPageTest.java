package pl.pomykalskimateusz.Test;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.pomykalskimateusz.PageObject.MainPage;

public class MainPageTest 
{
	private static final String URL = "http://newtours.demoaut.com/";
	
	@Before
	public void setUp()
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
	public void testButton()
	{
		MainPage mp = new MainPage();
		mp.linkContact();
		mp.linkSupport();
		mp.linkRegister();
		mp.linkSignOn();
		
		mp.linkHome();
		mp.linkFlights();
		mp.linkHotels();
		mp.linkCarRentals();
		mp.linkCruises();
		mp.linkDestinations();
		mp.linkVacations();
	}
	
	@Test
	public void testSignIn() throws InterruptedException
	{
		MainPage mp = new MainPage();
		mp.singAs("adam_qwe123", "qwe123");
		Thread.sleep(5000);
	}
	
}
