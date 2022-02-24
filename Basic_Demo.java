package TestNG2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Basic_Demo 
{
      WebDriver driver;
      
	  @BeforeSuite
	  public void openbrowser()
	  {
		  System.out.println("Open Browser");
		  System.setProperty("webdriver.chrome.driver", "H:\\New folder\\Shivaji Automation\\AUTOMATION SEKE\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver();
	  }
	  @BeforeTest()
	  public void enterURL()
	  {
		  System.out.println("Enter URL");
		  driver.get("https://www.mercurytravels.co.in/");
		  
	  }
	  @BeforeClass()
	  public void MaxiBrowz()
	  {
		  System.out.println("Maximize Broawser");
		  driver.manage().window().maximize();
	  }
	  
	  @BeforeMethod()
	  public void GetCookies()
	  {
		  System.out.println("Get Cookies");
	  }
	  
	  @Test()
	  public void LogIn() throws InterruptedException
	  {
		  System.out.println("LogIn");
		  Thread.sleep(2000);
		  Actions a=new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"))).build().perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("sign_user_email")).sendKeys("sonawanesushil57@gmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.id("sign_user_password")).sendKeys("Sushil@123");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		  Thread.sleep(2000);
		  WebElement WelcomeUser= driver.findElement(By.xpath("(//span[@class='caret'])[6]"));
		  Actions Action=new Actions(driver);
		  Action.moveToElement(WelcomeUser).build().perform();
		  driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-off'])[2]")).click();
		  Thread.sleep(2000);
		  
		  
		  
	  }
	  
	  @AfterMethod
	  public void GetScreenshot()
	  {
		  System.out.println("Get Screenshot");
	  }
	  @AfterClass
	  public void deleteCookies()
	  {
		  System.out.println("Delete Cookies");
	  }
	  @AfterTest
	  public void dbConnectionclosed()
	  {
		  System.out.println("db connection closed");
	  }
	  @AfterSuite
	  public void Close()
	  {
		  System.out.println("Close the Browser");
		  driver.close();
	  }
	
}
