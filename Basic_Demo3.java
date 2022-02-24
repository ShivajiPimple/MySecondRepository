package TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic_Demo3 
{
    WebDriver driver;
    @BeforeSuite()
    public void OpenBrowser()
    {
    	System.out.println("Open Browser");
    	System.setProperty("webdriver.chrome.driver", "H:\\\\New folder\\\\Shivaji Automation\\\\AUTOMATION SEKE\\\\chromedriver_win32\\\\chromedriver.exe");
    	driver= new ChromeDriver();
    	
    }
	@BeforeTest()
	public void enterURL()
	{
		System.out.println("Enter URL");
		driver.get("https://www.flipkart.com/");
	}
	@BeforeClass()
	public void MaxiBrowz()
	{
		System.out.println("Maximize Browser");
		driver.manage().window().maximize();
	}
	@BeforeMethod()
	public void GetCookies()
	{
		System.out.println("Get Cookies");
	}
	@Test
	public void LogIN() throws InterruptedException
	{
		System.out.println("Log IN");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8104506322");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Shiva@7342");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(5000);
		//Actions a= new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]"))).build().perform();
		
	}
	@AfterMethod()
	public void GetScreenShot()
	{
		System.out.println("Get Screenshot");
	}
	@AfterClass()
	public void DeleteCookies()
	{
		System.out.println("Delete Cookies");
	}
	@AfterTest()
	public void DbConnectionClose()
	{
		System.out.println("Db Connection Closed");
	}
	@AfterSuite()
	public void CloseBrowser()
	{
		System.out.println("Close Browser");
		driver.close();
		
		
	}
	
}
