package CaddieFrame;

import org.junit.jupiter.api.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener {
	
	@Test
	public void extentTest() {
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\rulas\\Downloads\\Test1.html"); // HTML Generated
	
	extent.attachReporter(spark);

	spark.config().setTheme(Theme.DARK);
	spark.config().setDocumentTitle("MyReport");
	
	ExtentTest test = extent.createTest("Test Spark");  //Create a test node on report.
	test.info("Login test started");
	test.info("URL is loaded");
	test.pass("Login is successfully");
	
	
	ExtentTest test1 = extent.createTest("Test Spark");  //Create a test node on report.
	test.info("Login test started");
	test.info("URL is loaded");
	test.fail("Failed!");
	
	extent.flush(); //unless you call this method , your report will not be written with logs
	
	}
	
}
