package pl.pomykalskimateusz.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.pomykalskimateusz.PageObject.SignOnPage;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;
public class SignOnPageTest 
{
	
	private static final String URL = "http://newtours.demoaut.com/mercurysignon.php";
	
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
	public void testSignOn()
	{
		SignOnPage sop = new SignOnPage();
		sop.setUserName("adam_qwe123");
		sop.setPassword("qwe123");
		sop.getLoginButton().click();
	}
}
