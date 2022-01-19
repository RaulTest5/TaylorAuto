package CaddieFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WedgeAdd extends Base {

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
    
    //Iron Form Elements
    By Name = By.xpath("//*[@id=\"name\"]");
    By FerruleM = By.xpath("//*[@id=\"ferruleId\"]");
    By PFam = By.xpath("//*[@id=\"plugFamilyId\"]");
    By AddPrt = By.xpath("//*[@id=\"addButton\"]/div");
    
    //Accept&Cancel
  	By Accept = By.xpath("/html/body/div/main/div[1]/div/div/form/div[7]/input");
    By Cancel = By.xpath("/html/body/div/main/div[1]/div/div/form/div[6]/button");
  	    
  	//Iron Parts Elements
    By PN = By.xpath("//*[@id=\"partNumber\"]");    
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
  	 
  	 //MASS
     By FinalM = By.xpath("//*[@id=\"finalAsmMass\"]");
     By Gmass = By.xpath("//*[@id=\"glueMass\"]");
     By Shink = By.xpath("//*[@id=\"shrinkwrapAndStickerMass\"]");
  	 
  	 //Save&Cancel
  	 By SaveB = By.xpath("//*[@id=\"modal\"]/div/div/div[3]/button[2]");
  	    
    
public WedgeAdd(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub
}
	
public void LoginUserWe () throws InterruptedException {
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
	//Selecting Wedge 
	Thread.sleep(1000);
	if(isDisplayed(SlideComp)) {
		click(SlideComp);
		Thread.sleep(1000);
		click(SlideGrip);
		click(SlideClose);
		visit("https://app-tst-caddie-app-001.azurewebsites.net/Wedge");
		Thread.sleep(1000);
		click(SlideClose);
		Thread.sleep(1000);
		click(addBtn);
		}else {
				System.out.println("Add Failed");
			}
	//Filling Wedge Form
    Thread.sleep(1000);
    type("Test Name", Name);
    click(AddPrt);
    //Filling Wedge part
    Switch();
    Thread.sleep(1000);
    type("PN71455", PN);
    type("r", Hnd);
    type("5", Loft);
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
    // Mass
    type("4", Gmass);
    type("5", FinalM);
    type("6", Shink);
    
    //Save&Close
    click(SaveB);
    
  //Continue on driver head
    Thread.sleep(1000);
    Switch();
    type("M", FerruleM);
    type("w", PFam);
    click(Accept);	
	}
public boolean isHomePageDisplayed() {
	
	return isDisplayed(Wlcm);
	}
}

