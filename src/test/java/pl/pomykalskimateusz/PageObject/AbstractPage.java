package pl.pomykalskimateusz.PageObject;

import static pl.pomykalskimateusz.Setup.SeleniumDriver.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class AbstractPage {
	private static final int LOAD_TIMEOUT = 20;
	private static final int REFRESH_TIME = 2;

	public static void waitForPageToLoad(ExpectedCondition pageLoadCondition) {
		Wait wait = new FluentWait(getDriver()).withTimeout(LOAD_TIMEOUT, TimeUnit.SECONDS).pollingEvery(REFRESH_TIME,
				TimeUnit.SECONDS);
		wait.until(pageLoadCondition);
	}
}
