package pl.pomykalskimateusz.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReservationThirdPage extends AbstractPage
{

	@FindBy(name="passFirst0")
	WebElement firstName_0_text;
	
	@FindBy(name="passLast0")
	WebElement lastName_0_text;
	
	@FindBy(name="pass.0.meal")
	WebElement meal_0_select;
	
	
	@FindBy(name="passFirst1")
	WebElement firstName_1_text;
	
	@FindBy(name="passLast1")
	WebElement lastName_1_text;
	
	@FindBy(name="pass.1.meal")
	WebElement meal_1_select;
	
	
	@FindBy(name="passFirst2")
	WebElement firstName_2_text;
	
	@FindBy(name="passLast2")
	WebElement lastName_2_text;
	
	@FindBy(name="pass.2.meal")
	WebElement meal_2_select;
	
	
	@FindBy(name="passFirst3")
	WebElement firstName_3_text;
	
	@FindBy(name="passLast3")
	WebElement lastName_3_text;
	
	@FindBy(name="pass.3.meal")
	WebElement meal_3_select;
}
