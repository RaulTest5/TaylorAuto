package CaddieFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;
import com.github.javafaker.Number;


public class Globalsearch extends Base{
	
	public Globalsearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Faker faker = new Faker();
	
	By User = By.xpath("//*[@id=\"i0116\"]");
    By Next = By.xpath("//*[@id=\"idSIButton9\"]");
    By Passwordbox = By.xpath("//*[@id=\"i0118\"]");
    By Login = By.xpath("//*[@id=\"idSIButton9\"]");
    By Wlcm = By.xpath("/html/body/div/main/h2");
	By SlideComp = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/a");
    By SlideGrip = By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/div/ul/li[1]/a");
    By SlideClose = By.xpath("//*[@id=\"close-sidebar\"]");
    By GlobalSearch = By.xpath("//*[@id=\"Grip\"]/span");
    By SearchBar = By.xpath("//*[@id=\"partNumberSearch\"]");
    By ClickSearch = By.xpath("/html/body/div/main/form/div/div[2]/button");
    By Results = By.xpath("//*[@id=\"devextreme0\"]/div/div[6]/div/table/tbody/tr[1]/td[1]");

  	 
  	public void LoginUserGS () throws InterruptedException {
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
  			click(GlobalSearch);
  			Thread.sleep(1000);
  			click(SlideClose);
  			Thread.sleep(1000);
  			type("PN78998", SearchBar);
  			click(ClickSearch);
  			
  			}
  		}
  		
  

		public boolean isResultPageDisplayed() {
  			
  			return isDisplayed(Results);
  			}
  		}
 
