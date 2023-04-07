package restaurantModule;

import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass2;
import com.objectRepo.AddRestaurantPage;
import com.objectRepo.AdminPanelpage;


		
//				WebDriverUtility wLib = new WebDriverUtility();
//				ExcelUtility eLib = new ExcelUtility();
//				FileUtility fLib = new FileUtility();


//				String URL = fLib.readDataFromPropertyData("url");
//				String UN = fLib.readDataFromPropertyData("un");
//				String PW = fLib.readDataFromPropertyData("pw");
//


//				WebDriverManager.chromedriver().setup();
//				WebDriver driver=new ChromeDriver();
//				wLib.maximizeWindow(driver);
//				wLib.waitForPageLoad(driver);
//				driver.get(URL);
				
//				AdminLoginPage al=new AdminLoginPage(driver);
//				al.adminLogin(UN, PW);
//				driver.findElement(By.name("username")).sendKeys(UN);
//				driver.findElement(By.name("password")).sendKeys(PW);
//				driver.findElement(By.name("submit")).click();
           public class AddRestaurantTest extends BaseClass2 {

        	@Test
        	public void addRestaurant() throws Throwable
	        {
				AdminPanelpage ap=new AdminPanelpage(driver);
				ap.adminPanelpage();
				//driver.findElement(By.xpath("//span[.='Restaurant']")).click();
				
				//driver.findElement(By.xpath("//a[.='Add Restaurant']")).click();
				AddRestaurantPage adp=new AddRestaurantPage(driver);
				adp.addRestaurantPage(driver, elib, wlib);

//				HashMap<String, String> map = eLib.readMultipleDataFromExcel("Sheet4");
//
//				for(Entry<String, String> set:map.entrySet())
//				{
//						driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
//				}
				
//				WebElement openHr = driver.findElement(By.name("o_hr"));
//				wLib.select("11am",openHr);
//				WebElement closeHr = driver.findElement(By.name("c_hr"));
//				wLib.select("9pm", closeHr);
//				WebElement openDays = driver.findElement(By.name("o_days"));
//				wLib.select("Mon-Sat", openDays);
				
			
//				File f=new File("‪‪E:\\download (1).jpg");
//				String abPath = f.getAbsolutePath();
//				driver.findElement(By.name("file")).sendKeys(abPath);
				
//				WebElement cateName = driver.findElement(By.name("c_name"));
//				wLib.select("Non-vegg", cateName);
//				driver.findElement(By.name("submit")).click();
				
			//	driver.close();
			    }   
                }  
