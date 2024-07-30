package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
	
	public static WebDriver driver;
	protected HomePage homePage;

	@BeforeAll
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\83\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.grantadvance.com/");
	}
	
	@AfterAll
	public static void closeBrowser() {
		driver.quit();
	}
}
