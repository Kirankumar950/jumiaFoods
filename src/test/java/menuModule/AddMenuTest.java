package menuModule;

import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.BaseClass2;
import com.objectRepo.AddMenuPage;
import com.objectRepo.AdminPanelPage3;


		//JavaUtility jlib=new JavaUtility();d
		
				
				
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		
		//wlib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		
		//wlib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		String url = flib.readDataFromPropertyData("url");
//		String un = flib.readDataFromPropertyData("un");
//		String pw = flib.readDataFromPropertyData("pw");
//		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\commondata2.properties");
//		Properties p=new Properties();
//		p.load(fis);
//		String url = p.getProperty("url");
//		String un = p.getProperty("un");
//		String pw = p.getProperty("pw");

//		driver.get(url);
//		AdminLoginPage ad=new AdminLoginPage(driver);
//		ad.adminLogin(un, pw);
//		driver.findElement(By.name("username")).sendKeys(un);
//		driver.findElement(By.name("password")).sendKeys(pw);
//		driver.findElement(By.name("submit")).click();
public class AddMenuTest extends BaseClass2{

	@Test
	public void addmenuModule() throws Throwable
	{
		
		AdminPanelPage3 ap=new AdminPanelPage3(driver);
		ap.adminpanel();
//		driver.findElement(By.xpath("//span[.='Menu']")).click();
//		driver.findElement(By.xpath("//a[.='Add Menu']")).click();
		
		AddMenuPage adp=new AddMenuPage(driver);
		adp.adminmenu(driver, elib, wlib);
//		 String expectedres1 = "Add Menu";
//		String actual1 = driver.findElement(By.xpath("//h4[.='Add Menu']")).getText();
//          if(actual1.equals(expectedres1)) {
//        	  System.out.println("add menu page is displayed");
//          }
//          else {
//        	  System.out.println("add menu page is not displayed");
//        	  
//          }
         //          FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\vee.xlsx");
//  		Workbook wb = WorkbookFactory.create(fi);
//  		Sheet sh = wb.getSheet("sheet1");
//  		HashMap<String, String> hm = new HashMap<String, String>();
//  		for(int i=0; i<=sh.getLastRowNum();i++) {
//  			String key = sh.getRow(i).getCell(0).getStringCellValue();
//  			String value = sh.getRow(i).getCell(1).getStringCellValue();
//  			hm.put(key, value);
//  		}
        // int ran = jlib.random();
		 // HashMap<String, String> map = elib.readMultipleDataFromExcel("Sheet1");
//  		for( Entry<String, String> set:map.entrySet())
//  		{
//  			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
//  		}
  		//System.out.println("excell is ok");
//          driver.findElement(By.name("d_name")).sendKeys("kabab");
//          driver.findElement(By.name("about")).sendKeys("chicken kabab");
//          driver.findElement(By.name("price")).sendKeys("70");
          //Thread.sleep(4000);
//          File f=new File("C:\\Users\\Dell\\Desktop\\Capture 3.PNG");
//          String abpath = f.getAbsolutePath();
//          driver.findElement(By.id("lastName")).sendKeys(abpath);
//         Thread.sleep(2000);
//         WebElement res = driver.findElement(By.name("res_name"));
//         wlib.select("Check Post", res);
        // Select s=new Select(res);
       //  s.selectByVisibleText("Check Post");
//        driver.findElement(By.name("submit")).click();
//         boolean actual2 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible fade show']")).isDisplayed();
//          if(actual2==true) {
//        	  System.out.println("New Dish Added Successfully ");
//          }
//          else {
//        	  System.out.println("New Dish not Added  Successfully ");
//        	  
//          }
		//driver.close();
//         
	}

}
