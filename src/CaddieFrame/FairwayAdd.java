package CaddieFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;

public class FairwayAdd extends Base {

	    By User = By.xpath("//*[@id=\"i0116\"]");
	    By Next = By.xpath("//*[@id=\"idSIButton9\"]");
	    By Passwordbox = By.xpath("//*[@id=\"i0118\"]");
	    By Login = By.xpath("//*[@id=\"idSIButton9\"]");
	    By Wlcm = By.xpath("/html/body/div/main/h2");
		By SlideComp = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/a");
	    By SlideGrip = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/div/ul/li[1]/a");
	    By SlideClose = By.xpath("//*[@id=\"close-sidebar\"]");
	    By Fairway = By.xpath("//*[@id=\"componentsGeneral\"]/ul/li[4]/a/span");
	    By addBtn = By.xpath("//*[@id=\"addButton\"]");
	    
	    //Fairway Elements
	    By Name = By.xpath("//*[@id=\"name\"]");
	    By FerruleM = By.xpath("//*[@id=\"ferruleId\"]");
	    By PFam = By.xpath("//*[@id=\"plugFamilyId\"]");
	    By AddPt = By.xpath("//*[@id=\"addButton\"]/div");
	    
	    //Accept&Cancel
		By Accept = By.xpath("/html/body/div/main/div[1]/div/div/form/div[7]/input");
	    By Cancel = By.xpath("/html/body/div/main/div[1]/div/div/form/div[6]/button");
	    
	    //Fairway Parts Elements
	    By PN = By.xpath("//*[@id=\"partNumber\"]");
	    By Ferrule = By.xpath("//*[@id=\"ferruleId\"]/option[10]");
	    By Scart = By.xpath("//*[@id=\"swCartId\"]");
	    By Hplug = By.xpath("//*[@id=\"headPlugId\"]");
	    By Hnd = By.xpath("//*[@id=\"handId\"]");
	    By Loft = By.xpath("//*[@id=\"loftId\"]");
	    By Sex = By.xpath("//*[@id=\"sexId\"]");
	    
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
	    
	    
	    By AddPrt = By.xpath("//*[@id=\"addButton\"]/div");	
	    By AccBtn2 = By.xpath("//*[@id=\"modal\"]/div/div/div[3]/button[2]");
	   
	    
	public FairwayAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void loginUserF() throws InterruptedException {
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
			visit("https://app-tst-caddie-app-001.azurewebsites.net/Fairway");
			Thread.sleep(1000);
			click(SlideClose);
			Thread.sleep(1000);
			click(addBtn);
			}else {
					System.out.println("Add Failed");
				}
		//Filling Fairway Form
	    Thread.sleep(1000);
	    type("Test Name", Name);
	    //type("g", Region);
	    click(AddPt);
	    //Filling Fairway part
	    Switch();
	    Thread.sleep(1000);
	    type("PN78999", PN);
	    type("h", Scart);
	    type("h", Hplug);
	    type("r", Hnd);
	    type("r", Loft);
	    type("w", Sex);
	    click(Ferrule);
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
	    //Save&Close
	    click(SaveB);
	  //Continue on driver head
	    Thread.sleep(1000);
	    Switch();
	    type("G", FerruleM);
	    type("h", PFam);
	    click(Accept);
	
	}
	public boolean isHomePageDisplayed() {
		
		return isDisplayed(Wlcm);
	}
}
