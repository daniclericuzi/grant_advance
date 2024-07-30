package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Menu Bar Contact Page
 * @author Danielle
 *
 */
public class ContactPage extends Page {
	
	public ContactPage(WebDriver driver) { super(driver); }
	
	private By contactName = By.id("input_1_1");
	private By contactEmail = By.id("input_1_3");
	private By contactAdditionalInformation = By.id("input_1_5");
	private By submitFormButton = By.id("gform_submit_button_1");
	private By sucessfulRequestMessage = By.id("h-thank-you-for-your-request");
	private By contactShortlyRequestMessage= By.cssSelector(".kt-adv-heading11590_8891b2-1e wp-block-kadence-advancedheading");

	public void fillContactName(String name) { driver.findElement(contactName).sendKeys(name); }
	public void fillContactEmail(String email) { driver.findElement(contactEmail).sendKeys(email); }
	public void fillContactAdditionalInformation(String additionalInformation) { driver.findElement(contactAdditionalInformation).sendKeys(additionalInformation
	); }
	public void clickSubmitFormButton() {
		driver.findElement(submitFormButton).click();
	}
	public String getsucessfulRequestMessage() {
		wait(sucessfulRequestMessage);
		return driver.findElement(sucessfulRequestMessage).getText();
	}
	public String getcontactShortlyRequestMessage() {
		wait(contactShortlyRequestMessage);
		return driver.findElement(contactShortlyRequestMessage).getText();
	}
}