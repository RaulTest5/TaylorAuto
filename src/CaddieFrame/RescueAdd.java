package CaddieFrame;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class RescueAdd extends Base {
	
	By User = By.xpath("//*[@id=\"i0116\"]");
    By Next = By.xpath("//*[@id=\"idSIButton9\"]");
    By Passwordbox = By.xpath("//*[@id=\"i0118\"]");
    By Login = By.xpath("//*[@id=\"idSIButton9\"]");
    By Wlcm = By.xpath("/html/body/div/main/h2");
	By SlideComp = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/a");
    By SlideGrip = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/div/ul/li[1]/a");
    By SlideClose = By.xpath("//*[@id=\"close-sidebar\"]");
    By Iron = By.xpath("//*[@id=\"componentsGeneral\"]/ul/li[3]/a/span");
    By addBtn = By.xpath("//*[@id=\"addButton\"]");
    By RescueTitle = By.xpath("/html/body/div/main/h1");
    
    //Rescue Elements
    By Name = By.xpath("//*[@id=\"name\"]");
    By FerruleM = By.xpath("//*[@id=\"ferruleId\"]");
    By PFam = By.xpath("//*[@id=\"plugFamilyId\"]");
    By Hplug = By.xpath("//*[@id=\"headPlugId\"]");
    By AddPt = By.xpath("//*[@id=\"addButton\"]/div");
    
    //Accept&Cancel
	By Accept = By.xpath("/html/body/div/main/div[1]/div/div/form/div[8]/input");
    By Cancel = By.xpath("/html/body/div/main/div[1]/div/div/form/div[6]/button");
    
    //Rescue Parts Elements
    By AddPrt = By.xpath("//*[@id=\"addButton\"]/div");
    By Hnd = By.xpath("//*[@id=\"handId\"]");
	By PN = By.xpath("//*[@id=\"partNumber\"]");
	By Loft = By.xpath("//*[@id=\"loftId\"]");
	By Sex = By.xpath("//*[@id=\"sexId\"]");
    By AccBtn2 = By.xpath("//*[@id=\"modal\"]/div/div/div[3]/button[2]");
    By Scart = By.xpath("//*[@id=\"swCartId\"]");
    By Ferrule = By.xpath("//*[@id=\"ferruleId\"]");
    
    //ASM Elements
    By BHL = By.xpath("//*[@id=\"asmBaseHoselLength\"]");
    By FinalBHL = By.xpath("//*[@id=\"finalAsmBaseHoselLength\"]");
    By BLHL = By.xpath("//*[@id=\"bodyLieHoselLength\"]");
    By CADmass = By.xpath("//*[@id=\"cadAsmHeadMass\"]");
    By Delta3 = By.xpath("//*[@id=\"asmDelta3\"]");
    By PHosel = By.xpath("//*[@id=\"pinHoselL\"]");
   
	//BORE Elements
    By Diam = By.xpath("//*[@id=\"boreDiametersId\"]");
	By Depth = By.xpath("//*[@id=\"boreDepth\"]");
	By NominalC = By.xpath("//*[@id=\"nominalCart\"]");
    By BLie = By.xpath("//*[@id=\"bodyLie\"]");
    By Notes= By.xpath("//*[@id=\"notes\"]");
    //Save&Cancel
    By SaveB = By.xpath("//*[@id=\"modal\"]/div/div/div[3]/button[2]");
    By Filter = By.xpath("//*[@id=\"dx-col-1\"]/div[1]/span[2]");
    By FilterBar = By.xpath("//*[@id=\"devextreme0\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
    
	public RescueAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public String getScreenshotPath(WebDriver driver) throws IOException {
		//below line is just to append the date format with the screenshot name to avoid duplicate names		
       	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+ "/FailedTestsScreenshots/"+dateName+".png";
		FileUtils.copyFile(source, new File(path));
		return path;
		
	}
	
	
	
	public void loginUserRe() throws InterruptedException, IOException {
		//Report
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\rulas\\Downloads\\Test1.html"); // HTML Generated
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		ExtentTest test = extent.createTest("Add Rescue TCs");  //Create a test node on report.
		//Report 
		
		test.info("Login test started"); //Test info
		Thread.sleep(3000);
		if(isDisplayed(User)) {
		type("raul.nava@ext.taylormadegolf.com", User);
		click(Next);
		Thread.sleep(2000);
		type("taylormade21", Passwordbox);
		click(Login);
		test.info("Login successfully");
		System.out.println("Login Successful");
		test.pass("User is in the Welcome Page", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
		}else {
			System.out.println("Login Failed");
			test.fail("Login Failed", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
		}
		//Selecting Rescue 
				Thread.sleep(1000);
				if(isDisplayed(SlideComp)) {
					click(SlideComp);
					Thread.sleep(1000);
					click(SlideGrip);
					click(SlideClose);
					visit("https://app-tst-caddie-app-001.azurewebsites.net/Rescue");
					Thread.sleep(1000);
					click(SlideClose);
					Thread.sleep(1000);
					click(addBtn);
					System.out.println("Add button Click Done");
					test.pass("Enter to Rescue Page", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
						}
				else {
					System.out.println("Add Button Click Failed");
					test.fail("Enter to Rescue Page Failed", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
				}
				//Filling Rescue Form
			    Thread.sleep(1000);
			    if(isDisplayed(Name)) {
			    type("Rescue Automation Test", Name);
			    type("D", Hplug);
			    type("i", Ferrule);
			    test.pass("Filled all the Main Form", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    click(AddPt);
			    System.out.println("Add Part Click Done");
				}
			    else {
			    	System.out.println("Part Click Fail");
			    test.fail("Add Part Click Failed", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    }
			    //Filling Fairway part
			    test.info("Child Part Table Opened");
			    Switch();
			    Thread.sleep(1000);
			    if(isDisplayed(PN)) {
			    type("PN78958", PN);
			    //type("h", Scart);
			    type("r", Hnd);
			    type("6", Loft);
			    type("w", Sex);
			    // ASM
			    type("3333", BHL);
			    type("39", FinalBHL);
			    type("222", BLHL);
			    type("3", CADmass);
			    type("1", Delta3);
			    type("4.5", PHosel);
			    // Bore
			    type("9", Diam);
			    type("1.1", Depth);
			    type("1", NominalC);
			    type("1", BLie);
			    test.info("Child Table Fielled");
			    //Save&Close
			    test.pass("Filled Child form", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    click(SaveB);
			    test.info("Add Part Saved");
			    System.out.println("Add part saved");
				}else {
						System.out.println("Add Part not saved");
						test.fail("Child part not saved", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
					}
			  //Continue on driver head
			    Thread.sleep(1000);
			    Switch();
			    if(isDisplayed(Name)) {
			    	test.pass("All info correctly filled", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    type("s", Hplug);
			    type("D", PFam);
			    click(Accept);
			    }else {
			    	test.fail("Accept not clicked", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    }
			    Thread.sleep(2000);
			    if(isDisplayed(Filter)) {
			    	type("Test name", FilterBar);
			    	test.pass("Rescue Successfully Saved", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    } else {
			    	test.fail("A field is missing", MediaEntityBuilder.createScreenCaptureFromPath(getScreenshotPath(driver)).build());
			    }
			    
			    
			    
			    extent.flush(); //unless you call this method , your report will not be written with logs
			    
			    
			}
	public boolean isElementDisplayed()  {
		return isDisplayed(Filter);
		 }
	}