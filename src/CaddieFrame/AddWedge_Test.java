package CaddieFrame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class AddWedge_Test {
	
	private WebDriver driver;
	WedgeAdd WedgePage;

	@BeforeEach
	void setUp() throws Exception {
		WedgePage = new WedgeAdd(driver);
		driver = WedgePage.chromeDriverConnection();
		WedgePage.visit("https://app-tst-caddie-app-001.azurewebsites.net/");
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		WedgePage.LoginUserWe();
		Thread.sleep(2000);
		assertTrue(WedgePage.isHomePageDisplayed());
	}

}
