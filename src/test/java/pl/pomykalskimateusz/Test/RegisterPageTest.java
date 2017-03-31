package pl.pomykalskimateusz.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.pomykalskimateusz.PageObject.RegisterPage;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;
public class RegisterPageTest 
{
	private static final String URL = "http://newtours.demoaut.com/mercuryregister.php";
	
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
	public void testRegistation() throws InterruptedException
	{
		RegisterPage rp = new RegisterPage();
		rp.setFirstName("Łukasz");
		rp.setLastName("Poukaszowikowski");
		rp.setPhone("732 235 940");
		rp.setEmail("lukanio@so.pl");
		rp.setAddress("ul.nałeczownicka", "8/10");
		rp.setCity("Łucznica");
		rp.setState("stabilny");
		rp.setPostalCode("23-230");
		rp.setCountry("TOGO");
		rp.setUserName("mati96");
		rp.setPassword("mati96");
		rp.setConfirmPassword("mati96");
		Thread.sleep(5000);
		rp.getRegisterButton().click();
		Thread.sleep(5000);
		rp.getSignInButton().click();
	}
}
