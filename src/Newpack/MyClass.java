package Newpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.*;

public class MyClass {
	 public static void main(String[] args) throws InterruptedException {
	 
	
		 //ChromeDriver Setup
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\rulas\\Downloads\\\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
	
	//
    String Url = "https://app-dev-caddie-app-001.azurewebsites.net/";
    driver.get(Url);
    //Find the Sign me in button
    
    WebDriverWait wait = new WebDriverWait(driver,40);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/input[1]")));
    
    //Elements 
    WebElement User = driver.findElement(By.xpath("//*[@id=\"i0116\"]"));
    WebElement Next = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
    WebElement Passwordbox = driver.findElement(By.xpath("//*[@id=\"i0118\"]"));
  
    //Login Process
    User.sendKeys("raul.nava@ext.taylormadegolf.com");
    Next.click();
    Passwordbox.sendKeys("taylormade21");
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input")));
    WebElement Login = driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input"));
    Login.click();
   
    
    //CaddieElements
    WebElement SlideComp = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/a"));
    WebElement SlideGrip = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/div/ul/li[1]/a"));
    //WebElement SlideClose = driver.findElement(By.xpath("//*[@id=\"close-sidebar\"]"));
    
  //CaddieApp
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sidebar\"]/div[1]/div[4]/ul/li[2]/a"))); 
    SlideComp.click();
    Thread.sleep(1000);
    SlideGrip.click();
    WebElement SlideClose = driver.findElement(By.xpath("//*[@id=\"close-sidebar\"]"));
    SlideClose.click();
    
    //CaddieElementsForm
    WebElement AddBtn = driver.findElement(By.xpath("//*[@id=\"addButton\"]"));
    
    
    //CaddieForm
    AddBtn.click();
    driver.findElement(By.xpath("//*[@id=\"close-sidebar\"]")).click();
    
    //FormFields
    WebElement Addtitle = driver.findElement(By.xpath("/html/body/div/main/h1"));
    WebElement Name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
    WebElement PartN = driver.findElement(By.xpath("//*[@id=\"partNumber\"]"));
    WebElement CGI = driver.findElement(By.xpath("//*[@id=\"cgIn\"]"));
    WebElement BTI = driver.findElement(By.xpath("//*[@id=\"buttThkIn\"]"));
    WebElement MassG = driver.findElement(By.xpath("//*[@id=\"massG\"]"));
    WebElement Prog = driver.findElement(By.xpath("//*[@id=\"programs\"]"));
    WebElement Type = driver.findElement(By.xpath("//*[@id=\"type\"]"));
    WebElement Note = driver.findElement(By.xpath("//*[@id=\"notes\"]"));
    WebElement Ext1 = driver.findElement(By.xpath("//*[@id=\"extra1\"]"));
    WebElement Ext2 = driver.findElement(By.xpath("//*[@id=\"extra2\"]"));
    WebElement Ext3 = driver.findElement(By.xpath("//*[@id=\"extra3\"]"));
    WebElement Accept = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[8]/input"));
    WebElement Cancel = driver.findElement(By.xpath("/html/body/div/main/div/div/div/form/div[8]/button"));
	 
    //FillingForm
    Thread.sleep(1000);
    //Addtitle.sendKeys("Test Name");
    Name.sendKeys("Test Name");
    PartN.sendKeys("0000");
    CGI.sendKeys("1111");
    BTI.sendKeys("2222");
    MassG.sendKeys("0.000");
    Prog.sendKeys("3333");
    Type.sendKeys("Custom");
    Note.sendKeys("This is a note example");
    Ext1.sendKeys("N/A");
    Ext2.sendKeys("N/A");
    Ext3.sendKeys("N/A");
    Accept.click();
    
    
   
	}
}
