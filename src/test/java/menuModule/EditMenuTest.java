package menuModule;

import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass2;
import com.objectRepo.AdminPanelPage4;
import com.objectRepo.AllMenuPage;
import com.objectRepo.UpdateMenuPage;


		
		
//		FileUtility flib=new FileUtility();
//		WebDriverUtility wlib=new WebDriverUtility();
//		ExcelUtility elib=new ExcelUtility();
//		JavaUtility jlib=new JavaUtility();
		
//		
//		WebDriverManager.chromedriver().create();
//		WebDriver driver=new ChromeDriver();
//		wlib.maximizeWindow(driver);
//		//driver.manage().window().maximize();
//		wlib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
//		
//		wlib.waitForPageLoad(driver);
//		String url = flib.readDataFromPropertyData("url");
//		String un = flib.readDataFromPropertyData("un");
//		String pw = flib.readDataFromPropertyData("pw");
		
//		driver.get(url);
//		AdminLoginPage alp=new AdminLoginPage(driver);
//		alp.adminLogin(un, pw);
//		driver.findElement(By.name("username")).sendKeys(un);
//		driver.findElement(By.name("password")).sendKeys(pw);
//		driver.findElement(By.name("submit")).click();
public class EditMenuTest extends BaseClass2
{

	@Test
	public void editMenu() throws Throwable
	{
		
		AdminPanelPage4 app4=new AdminPanelPage4(driver);
		app4.adminpanel();
//		driver.findElement(By.xpath("//span[.='Menu']")).click();
//		driver.findElement(By.xpath("//a[.='All Menues']")).click();
//		String expectedres = "All Menu";
		
		AllMenuPage all=new AllMenuPage(driver);
				all.allmenupage(driver);
//		 String actualres1 = driver.findElement(By.xpath("//h4[.='All Menu']")).getText();
//		 if(actualres1.equals(expectedres)) {
//			 System.out.println("all menu page is displayed");
//		 }
//		 else {
//			 System.out.println("all menu page is not displayed");
//			 
//		 }
// driver.findElement(By.xpath("//td[.='kabab']/following-sibling::td[4]/a[2]")).click();
				
				
				UpdateMenuPage up=new UpdateMenuPage(driver);
				up.updatemenu(driver, elib, wlib);
//		 String expectedres2 = "Add Menu to Restaurant";
//		String actualres2 = driver.findElement(By.xpath("//h4[.='Add Menu to Restaurant']")).getText();
//		if(actualres2.equals(expectedres2)) {
//			System.out.println("Add Menu to Restaurant page is displayed");
//		}
//		else {
//			System.out.println("Add Menu to Restaurant page is not displayed");
//		}
		
	
//		HashMap<String, String> fil = elib.readMultipleDataFromExcel("Sheet3");
//		for(Entry<String, String> set:fil.entrySet())
//		{
//			WebElement data = driver.findElement(By.name(set.getKey()));
//			data.clear();
//			data.sendKeys(set.getValue());
//		}
//		driver.findElement(By.name("d_name")).clear();
//		driver.findElement(By.name("d_name")).sendKeys("mutton birayani");
//		driver.findElement(By.name("about")).clear();
//		driver.findElement(By.name("about")).sendKeys("chilli chicken");
//		driver.findElement(By.name("price")).clear();
//		driver.findElement(By.name("price")).sendKeys("50");
		//File f=new File("‪‪C:\\Users\\Dell\\Desktop\\Capture 3.PNG");
		//String abpath = f.getAbsolutePath();
//		File f=new File("‪‪E:\\download (1).jpg");
//	     String abpath = f.getAbsolutePath();
//         driver.findElement(By.name("file")).sendKeys(abpath);
  //      WebElement res = driver.findElement(By.name("res_name"));	
   //     wlib.select("Check Post", res);
		//Select s=new Select(res);
		//s.selectByVisibleText("Check Post");
//		driver.findElement(By.name("submit")).click();
//		String expectedres3 = "Record Updated!";
//	String actualres3 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).getText();
//		if(actualres3.equals(expectedres3)) {
//			System.out.println("Record Updated! msg is displayed");
//		}
//		else {
//			System.out.println("Record Updated! msg is not displayed");
//		}
		//driver.close();
		
	}

}
