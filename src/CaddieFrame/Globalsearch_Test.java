package CaddieFrame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class Globalsearch_Test {
	
	private WebDriver driver;
	Globalsearch GlobalSearchPage;

	@BeforeEach
	void setUp() throws Exception {
		GlobalSearchPage = new Globalsearch(driver);
		driver = GlobalSearchPage.chromeDriverConnection();
		GlobalSearchPage.visit("https://app-tst-caddie-app-001.azurewebsites.net/");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws InterruptedException {
		GlobalSearchPage.LoginUserGS();
		Thread.sleep(2000);
		assertTrue(GlobalSearchPage.isResultPageDisplayed());
	}

}
