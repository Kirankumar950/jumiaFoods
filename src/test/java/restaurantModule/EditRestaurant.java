package restaurantModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass2;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.WebDriverUtility;
import com.objectRepo.AdminLoginPage;
import com.objectRepo.AdminPanel2;
import com.objectRepo.AllRestaurants;
import com.objectRepo.UpDateRestaurant;

import io.github.bonigarcia.wdm.WebDriverManager;

	
	
//				
//				WebDriverUtility wLib = new WebDriverUtility();
//				ExcelUtility eLib = new ExcelUtility();
//				FileUtility fLib = new FileUtility();
//
//				
//				String URL = fLib.readDataFromPropertyData("url");
//				String UN = fLib.readDataFromPropertyData("un");
//				String PW = fLib.readDataFromPropertyData("pw");
//
//				
//				WebDriverManager.chromedriver().setup();
//				WebDriver driver=new ChromeDriver();
//				wLib.maximizeWindow(driver);
//				wLib.waitForPageLoad(driver);
//				driver.get(URL);
				
//				AdminLoginPage ad=new AdminLoginPage(driver);
//				ad.adminLogin(UN, PW);
//				driver.findElement(By.name("username")).sendKeys(UN);
//				driver.findElement(By.name("password")).sendKeys(PW);
//				driver.findElement(By.name("submit")).click();

               public class EditRestaurant extends BaseClass2
               
               {

                  @Test
                   public void editRestaurant() throws Throwable
                   {				
				
				AdminPanel2 ad2=new AdminPanel2(driver);
				ad2.adminPanel2();		
//				driver.findElement(By.xpath("//span[.='Restaurant']")).click();
//		        driver.findElement(By.xpath("//a[.='All Restaurant']")).click();
				
				
				
				
				//String restoName = eLib.readDataFromExcel("Sheet5", 6, 1);
				AllRestaurants ar=new AllRestaurants(driver);
				ar.allRestaurants();
				//driver.findElement(By.xpath("(//td[.='American']/following-sibling::td[11]/a[2])[1]]")).click();
				
				
				UpDateRestaurant up=new UpDateRestaurant(driver);
				up.upDateRestaurant(wlib, driver, elib);
//				HashMap<String,String> map = eLib.readMultipleDataFromExcel("EditResto");
//
//				for(Entry<String, String> set:map.entrySet())
//				{
//						
//						WebElement data = driver.findElement(By.name(set.getKey()));
//						data.clear();
//						data.sendKeys(set.getValue());
//						
//				}

				
//				WebElement openHr = driver.findElement(By.name("o_hr"));
//				wLib.select("7am", openHr);
//				WebElement closeHr = driver.findElement(By.name("c_hr"));
//				wLib.select("7pm", closeHr);
//				WebElement openDays = driver.findElement(By.name("o_days"));
//				wLib.select("24hr-x7", openDays);
//				File f=new File("‪‪E:\\\\download (1).jpg");
//				String abPath = f.getAbsolutePath();
//				driver.findElement(By.name("file")).sendKeys(abPath);
//				WebElement ChCategory = driver.findElement(By.name("c_name"));
//				wLib.select("Indian", ChCategory);
//   	        driver.findElement(By.name("submit")).click();
//				boolean updated = driver.findElement(By.xpath("//strong[.='Record Updated!']")).isDisplayed();
//				if(updated==true)
//				{
//					System.out.println("Record Updated Successfully");
//				}
//				else
//				{
//					System.err.println("Record is not Updated");
//				}
			//	driver.close();
	}
}
