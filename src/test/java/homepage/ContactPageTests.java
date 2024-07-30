package homepage;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.ContactPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactPageTests extends BaseTests {

	@Test
	public void testsendtheContactForm_contactFormSubmittedSuccessfully() {

		String expectedSucessfulRequestMessage = "Thank You for your request";
		String expectedContactShortlyRequestMessage = "We will contact you shortly!";

		HomePage homePage = new HomePage(driver);
		homePage.clickContactButton();

		ContactPage formContactPage = new ContactPage(driver);
		formContactPage.fillContactName("TestingName");
		formContactPage.fillContactEmail("TestingName@gmail.com");
		formContactPage.fillContactAdditionalInformation("Hello World");
		formContactPage.clickSubmitFormButton();
		String actualSucessfulRequestMessage = formContactPage.getsucessfulRequestMessage();
		String actualContactShortlyRequestMessage = formContactPage.getcontactShortlyRequestMessage();

		assertTrue(actualSucessfulRequestMessage.contains(expectedSucessfulRequestMessage));
		assertTrue(actualContactShortlyRequestMessage.contains(expectedContactShortlyRequestMessage));
    }

}
