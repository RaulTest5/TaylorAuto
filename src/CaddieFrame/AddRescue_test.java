package CaddieFrame;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


    public class AddRescue_test {
	
	private WebDriver driver;
	RescueAdd RescuePage;

	@Before
	public void setUp() throws Exception {
		RescuePage = new RescueAdd(driver);
		driver = RescuePage.chromeDriverConnection();
		RescuePage.visit("https://app-tst-caddie-app-001.azurewebsites.net/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException, IOException {
	
		RescuePage.loginUserRe();
		Thread.sleep(2000);
		assertTrue("Add Rescue Home Page Not Displayed, Check the report.", RescuePage.isElementDisplayed());
	}

}
