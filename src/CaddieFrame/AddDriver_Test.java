package CaddieFrame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class AddDriver_Test {

	private WebDriver driver;
	DriverAdd loginPage;
	
	@BeforeEach
	void setUp() throws Exception {
		loginPage = new DriverAdd(driver);
		driver = loginPage.chromeDriverConnection();
		loginPage.visit("https://app-tst-caddie-app-001.azurewebsites.net/");
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		loginPage.loginUser();
		Thread.sleep(2000);
		assertTrue(loginPage.isHomePageDisplayed());
	}
}
