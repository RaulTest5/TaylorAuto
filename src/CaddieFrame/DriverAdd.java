package CaddieFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverAdd extends Base {

	    By User = By.xpath("//*[@id=\"i0116\"]");
	    By Next = By.xpath("//*[@id=\"idSIButton9\"]");
	    By Passwordbox = By.xpath("//*[@id=\"i0118\"]");
	    By Login = By.xpath("//*[@id=\"idSIButton9\"]");
	    By Wlcm = By.xpath("/html/body/div/main/h2");
		By SlideComp = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/a");
	    By SlideGrip = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/div/ul/li[1]/a");
	    By SlideClose = By.xpath("//*[@id=\"close-sidebar\"]");
	    By Driver = By.xpath("//*[@id=\"Driver\"]/span");
	    By DriverTitle = By.xpath("/html/body/div/main/h1");
	    By addBtn = By.xpath("//*[@id=\"addButton\"]");
	    //CaddieForm Elements 
	  //FormFields
	    By Addtitle = By.xpath("/html/body/div/main/h1");
	    By Name = By.xpath("//*[@id=\"name\"]");
	    By PCodeN = By.xpath("//*[@id=\"productCodeName\"]");
	    By Hplug = By.xpath("//*[@id=\"headPlugId\"]");
	    By Scart = By.xpath("//*[@id=\"swcartId\"]");
	    By Ferrule = By.xpath("//*[@id=\"ferruleId\"]");
	    By PFam = By.xpath("//*[@id=\"plugFamilyId\"]");
	    //ASM Elements
	    By HMass = By.xpath("//*[@id=\"cadAsmHeadMass\"]");
	    By BHL = By.xpath("//*[@id=\"asmBaseHoselLength\"]");
	    By BLHL = By.xpath("//*[@id=\"bodyLieHoselLength\"]");
	    By PHosel = By.xpath("//*[@id=\"pinHoselL\"]");
	    By Delta3 = By.xpath("//*[@id=\"asmDelta3\"]");
	    By BLie = By.xpath("//*[@id=\"bodyLie\"]");
	    By NominalC = By.xpath("//*[@id=\"nominalCart\"]");
	    By FinalBHL = By.xpath("//*[@id=\"finalAsmBaseHoselLength\"]");
	    By FinalM = By.xpath("//*[@id=\"finalAsmMass\"]");
	    By Gmass = By.xpath("//*[@id=\"glueMass\"]");
	    By Shink = By.xpath("//*[@id=\"shrinkwrapAndStickerMass\"]");
		//BORE Elements
	    By Diam = By.xpath("//*[@id=\"boreDiametersId\"]");
		By Depth = By.xpath("//*[@id=\"boreDepth\"]");
	    By Notes = By.xpath("//*[@id=\"notes\"]");
	    //Accept&Cancel
		By Accept = By.xpath("/html/body/div/main/div[1]/div/div/form/div[16]/input");
	    By Cancel = By.xpath("/html/body/div/main/div[1]/div/div/form/div[14]/button");
	    //Duplicated Error
	    By DupliNot = By.xpath("/html/body/div/main/div[1]/div/div/form/div[1]");
	    
	    //Add Driver parts Elelemts
	    By AddPrt = By.xpath("//*[@id=\"addButton\"]/div");
	    By Hnd = By.xpath("//*[@id=\"handId\"]");
		By PN = By.xpath("//*[@id=\"partNumber\"]");
		By Loft = By.xpath("//*[@id=\"loftId\"]");
		By Sex = By.xpath("//*[@id=\"sexId\"]");
	    By AccBtn2 = By.xpath("//*[@id=\"modal\"]/div/div/div[3]/button[2]");
	    By Remove = By.xpath("//*[@id=\"table\"]/tbody/tr/td[10]/a[1]");
	    By Accept2 = By.xpath("/html/body/div/main/div[1]/div/div/form/div[18]/input");
	    
	    //R&D/////////////////////////////////////////////////////////////////////////////
	    By RDadd = By.xpath("//*[@id=\"addButton\"]");
	    By Region = By.xpath("//*[@id=\"regionId\"]");
	    By Boption = By.xpath("//*[@id=\"buildOptionId\"]");
	    By RDname = By.xpath("//*[@id=\"name\"]");
	    By FGN = By.xpath("//*[@id=\"fgPartNumber\"]");
	    By RDhead = By.xpath("//*[@id=\"driverPartPartNumber\"]");
	    By RDShaft = By.xpath("//*[@id=\"shaftFlexPartNumber\"]");
	    By RDGrip = By.xpath("//*[@id=\"gripPartNumber\"]");
	    By RDaccept = By.xpath("/html/body/div/main/div/div/div/form/div[5]/input");
	    By RDCancel = By.xpath("/html/body/div/main/div/div/div/form/div[5]/button");
	    
	    
	    
	    
	    
	    //R&D///////////////////////////////////////////////////////////////////////////
	   
	public DriverAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void loginUser() throws InterruptedException {
		Thread.sleep(3000);
		if(isDisplayed(User)) {
		type("raul.nava@ext.taylormadegolf.com", User);
		click(Next);
		Thread.sleep(2000);
		type("taylormade21", Passwordbox);
		click(Login);
		}else {
			System.out.println("Login Failed");
		}
		//Selecting Driver 
		Thread.sleep(1000);
		if(isDisplayed(SlideComp)) {
			click(SlideComp);
			Thread.sleep(1000);
			click(SlideGrip);
			click(SlideClose);
			click(Driver);
			Thread.sleep(1000);
			click(SlideClose);
			Thread.sleep(1000);
			click(addBtn);
			}else {
					System.out.println("Add Failed");
				}
		//Filling Driver Form
	    Thread.sleep(1000);
	    type("Test Name", Name);
	    type("Automated Product test", PCodeN);
	    type("h", Hplug);
	    type("h", Scart);
	    type("B", Ferrule);
	    type("H", PFam);
	    
	    //ASM
	    type("0.000", HMass);
	    type("333", BHL);
	    type("222", BLHL);
	    type("4.5", PHosel);
	    type("1", Delta3);
	    type("2", BLie);
	    type("5", NominalC);
	    type("39", FinalBHL);
	    type("3.00", FinalM);
	    type("1.18", Gmass);
	    type("4", Shink);
	    
	    //BORE
	    type("9", Diam);
	    type("1.1", Depth);
	    type("This is a note for a test", Notes);
	    
	    //Add Part
	    click(AddPrt);
	    Switch();
	    Thread.sleep(1000);
	    click(Hnd);
	    type("R", Hnd);
	    click(Loft);
	    type("9", Loft);
	    click(Sex);
	    type("w", Sex);
	    type("PN78965", PN);
	    click(AccBtn2);
	  
	    
	    //Continue on driver head
	    Thread.sleep(1000);
	    Switch();
	    click(Accept);
	    Thread.sleep(2000);
	    
	    if(isDisplayed(DupliNot)) {
			click(Remove);
			click(AddPrt);
		    Switch();
		    Thread.sleep(1000);
		    click(Hnd);
		    type("R", Hnd);
		    click(Loft);
		    type("9", Loft);
		    click(Sex);
		    type("w", Sex);
		    type("PN74181", PN);
		    click(AccBtn2);
		   
		    Thread.sleep(1000);
		    Switch();
		    click(Accept2);
		   
			}else {
					System.out.println("Add Failed");
				}
	    if(isDisplayed(DriverTitle)) {
			visit("https://app-tst-caddie-app-001.azurewebsites.net/RegionStock/Driver?regionId=0");
			click(RDadd);
			Thread.sleep(1000);
			type("G", Region);
			type("m", Boption);
			type("Automated Test Name", RDname);
			type("1234", FGN);
			type("N9117101", RDhead);
			type("N9118901", RDShaft);
			type("N8109201", RDGrip);
			click(RDaccept);
			}else {
					System.out.println("Add Failed");
				}
	    
	    
		}
	public boolean isHomePageDisplayed() {
		
		return isDisplayed(Wlcm);
	}
	
}
