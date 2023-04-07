package com.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.objectRepo.HomePageBeforeLogin;
import com.objectRepo.LogOutPage;
import com.objectRepo.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public DataBaseUtility dlib=new DataBaseUtility();
public	FileUtility flib=new FileUtility();
public	WebDriverUtility wlib=new WebDriverUtility();
public	ExcelUtility elib=new ExcelUtility();
public WebDriver driver;
public static WebDriver sdriver;

	@BeforeSuite(alwaysRun = true)
	public void configBS() throws Throwable
	{
		dlib.connectToDB();
		System.out.println("---connect to database----");
	}
	@BeforeClass(alwaysRun = true)
	public void configBc() throws Throwable
	{
		String BROWSER = flib.readDataFromPropertyData("browser");
		
	String URL = flib.readDataFromPropertyData("uurl");

			if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}
			sdriver=driver;
			wlib.maximizeWindow(driver);
		
			driver.get(URL);
			wlib.waitForPageLoad(driver);
	}
	@BeforeMethod(alwaysRun = true)
	public void configBM() throws Throwable
	{

		HomePageBeforeLogin hp=new HomePageBeforeLogin(driver);
		hp.homepageBeforeLogin();
		String un = flib.readDataFromPropertyData("username");
		String pw = flib.readDataFromPropertyData("password");
		LoginPage l=new LoginPage(driver);
		l.login(un, pw);
	}
	@AfterMethod(alwaysRun = true)
	public void configAM()
	{
		LogOutPage lo=new LogOutPage(driver)	;
		lo.logout();
		
	
	}
	
	@AfterClass(alwaysRun = true)
	public void configAC()
	{
		driver.quit();
	}
	@AfterSuite(alwaysRun = true)
	public void configAS() throws Throwable 
	{
		dlib.con.close();
		System.out.println("-----close the data base---");
	}
	
}
