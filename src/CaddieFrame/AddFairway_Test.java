package CaddieFrame;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class AddFairway_Test {
	
	private WebDriver driver;
	FairwayAdd FairPage;
	
	@BeforeEach
	void setUp() throws Exception {
		FairPage = new FairwayAdd(driver);
		driver = FairPage.chromeDriverConnection();
		FairPage.visit("https://app-tst-caddie-app-001.azurewebsites.net/");
	}
	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() throws InterruptedException {
		FairPage.loginUserF();
		Thread.sleep(2000);
		assertTrue(FairPage.isHomePageDisplayed());
	}
}
