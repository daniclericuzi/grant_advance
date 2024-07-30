package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Home Page of Grant Advance
 * @author Danielle
 *
 */
public class HomePage extends Page {
	
	private By contactButton = By.id("menu-item-11623");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void clickContactButton() {
		driver.findElement(contactButton).click();
	}
}
