package pl.pomykalskimateusz.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver 
{
	static WebDriver driver;
	private static final String PATH = "B:/IT/workspace/newtoursTEST/src/test/resources/chromedriver.exe";
	public static WebDriver getDriver()
	{
		
		System.setProperty("webdriver.chrome.driver", PATH);
		
		if(driver == null)
		{
			driver = new ChromeDriver();
		}
		return driver;
	}
}
