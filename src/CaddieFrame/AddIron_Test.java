package CaddieFrame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class AddIron_Test {
	
	private WebDriver driver;
	IronAdd IronPage;

	@BeforeEach
	void setUp() throws Exception {
		IronPage = new IronAdd(driver);
		driver = IronPage.chromeDriverConnection();
		IronPage.visit("https://app-tst-caddie-app-001.azurewebsites.net/");
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		IronPage.loginUserIr();
		Thread.sleep(2000);
		assertTrue(IronPage.isHomePageDisplayed());
	}

}
