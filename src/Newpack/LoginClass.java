package Newpack;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.lang.*;

public class LoginClass {
	WebDriver driver;    
	public static void main(String[] args) throws InterruptedException {
	 //ChromeDriver Setup
		        LoginClass obj=new LoginClass();
		        obj.login_to_Ted_Baker("raul.nava@ext.taylormadegolf.com", "taylormade21");
		        System.out.println("Login Sucessfully");
		                }

		    public void usename( String Username)
		    {
		    	WebElement User = driver.findElement(By.xpath("//*[@id=\"i0116\"]"));
		        User.sendKeys(Username);
		    }
		    public void password(String Password)
		    {
		    	WebElement Passwordbox = driver.findElement(By.xpath("//*[@id=\"i0118\"]"));;
		        Passwordbox.sendKeys(Password);
		    }
		    public void next()
		    {
		    	 WebElement Next = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
		    	 Next.click();
		    }
		    public void login_Taylormade(WebDriver driver){

		        this.driver = driver;

		    }
		    public void login_to_Ted_Baker(String Username,String Password) throws InterruptedException
		    {
		    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\rulas\\Downloads\\\\chromedriver.exe");
		    	 WebDriver driver = new ChromeDriver();
		    	 driver.manage().window().maximize();
		    	 String Url = "https://app-dev-caddie-app-001.azurewebsites.net/";
		    	 //driver.get(Url);
		     try{
		        driver.get(Url);
		        WebDriverWait wait = new WebDriverWait(driver,40);
		   	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/input[1]")));
		   	 if(driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[3]/div/div/div/div[2]/div[2]/div/input[1]")).isDisplayed())
		        {

		   		 //Elements 
		   		 WebElement User = driver.findElement(By.xpath("//*[@id=\"i0116\"]"));
		   		 WebElement Next = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
		   		 WebElement Passwordbox = driver.findElement(By.xpath("//*[@id=\"i0118\"]"));

		   		 //Login Process
		   		 this.usename(Username);
		   		 Next.click();
		   		 this.password(Password);
		   		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input")));
		   		 WebElement Login = driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div/div/input"));
		   		 Login.click();
		   		 
		        this.next();
		        }
		        }catch(Exception e)
		        {
		            System.out.println(e.getMessage());
		        }
		    }
		}
	/*	
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

	}	
} */