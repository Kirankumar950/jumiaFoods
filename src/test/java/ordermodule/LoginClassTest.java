package ordermodule;

import org.testng.annotations.Test;

import com.GenericUtilities.BaseClass;
import com.objectRepo.CheckOutPage;
import com.objectRepo.DishesPage;
import com.objectRepo.HomePageAfterLogin;
import com.objectRepo.MyOrdersPage;
import com.objectRepo.RestaurantPage;


	
		//FileUtility flib=new FileUtility();
		//WebDriverUtility wlib=new WebDriverUtility();
		//ExcelUtility elib=new ExcelUtility();
		//JavaUtility jlib=new JavaUtility();
		
		
	//	WebDriverManager.chromedriver().create();
	//WebDriver driver=new ChromeDriver();
		
		//wlib.maximizeWindow(driver);
		//driver.manage().window().maximize();
		
//	String url=flib.readDataFromPropertyData("uurl");
//String un	=flib.readDataFromPropertyData("username");
//String pw	=flib.readDataFromPropertyData("password");
//		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
//		Properties p=new Properties();
//		p.load(fis);
//		String url = p.getProperty("url");
//		String un = p.getProperty("username");
//		String pw = p.getProperty("password");


//		FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fi);
//		Sheet sh = wb.getSheet("sheet1");
//		HashMap<String, String> hm = new HashMap<String, String>();
//		for(int i=0; i<sh.getLastRowNum();i++) {
//			String key = sh.getRow(i).getCell(0).getStringCellValue();
//			String value = sh.getRow(i).getCell(0).getStringCellValue();
//			hm.put(key, value);
//		}

 //        wlib.waitForPageLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.get(url);
	
//	HomePageBeforeLogin hp=new HomePageBeforeLogin(driver);
//	hp.homepageBeforeLogin();
  //driver.findElement(By.xpath("//a[@href='login.php']")).click();
	
//	LoginPage l=new LoginPage(driver);
//	l.login(un, pw);
	//driver.findElement(By.name("username")).sendKeys(un);
	//driver.findElement(By.name("password")).sendKeys(pw);
	//driver.findElement(By.name("submit")).click();
public class LoginClassTest  extends BaseClass
{
	@Test
	public void orderModule()
	{

		HomePageAfterLogin hma=new 	HomePageAfterLogin(driver);
       hma.getResto(driver);
	//driver.findElement(By.xpath("//a[@href=\"restaurants.php\"]")).click();
//String expectedresult1 = "Choose Restaurant";
//String actual1 = driver.findElement(By.linkText("Choose Restaurant")).getText();
//if(actual1.equals(expectedresult1)) {
	//System.out.println("choose restaurant page is displayed");
//}
//else {
//	System.out.println("choose restaurant page not is displayed");
//}

	
        RestaurantPage r=new RestaurantPage(driver);
        r.chooseRestaurant(driver);
        //driver.findElement(By.linkText("View Menu")).click();
         //		String expectedresult2 = "Pick Your favorite food";
         //		String actual2 = driver.findElement(By.linkText("Pick Your favorite food")).getText();
         //		if(actual2.equals(expectedresult2)) {
         //			System.out.println("Pick Your favorite food page is displayed");
         //		}
         //		else {
         //			System.out.println("Pick Your favorite food page is not displayed");
         //		}
        
        DishesPage dp=new DishesPage(driver);
        dp.pickyourFavorite(driver);
		//driver.findElement(By.xpath("//a[.='Pink Spaghetti Gamberoni']/../..//../../../..//input[@value='Add To Cart']")).click();
		//driver.findElement(By.xpath("//a[@href=\"checkout.php?res_id=2&action=check\"]")).click();
	    //String expectedresult3 = "Order and Pay";
	    //String actual3 = driver.findElement(By.linkText("Order and Pay")).getText();

	    //if(actual3.equals(expectedresult3)) {
		//System.out.println("Order and Pay is displayed");
	    //}
	    //else {
		//System.out.println("Order and Pay is not displayed");	
        //}
        
        CheckOutPage cp=new CheckOutPage(driver);
        cp.checkoutpage(driver);
		//driver.findElement(By.name("submit")).click();
		//String text1 = driver.switchTo().alert().getText();
		//System.out.println(text1);
		//driver.switchTo().alert().accept();
		//String text2 = driver.switchTo().alert().getText();
		//System.out.println(text2);
		//driver.switchTo().alert().accept();
		//String expectedresult4 = "My Orders";
		//String actual4 = driver.findElement(By.xpath("//a[@href='your_orders.php']")).getText();
		//if(actual4.equals(expectedresult4)) {
			//System.out.println("myorders page is display");
		//}
		//else {
			//System.out.println("myorders page is not display");
		//}
        
        MyOrdersPage mo=new  MyOrdersPage(driver);
        mo.myOrdersPage();
		//String expectedresult5 = "Dispatch";
		//String actual5 = driver.findElement(By.xpath("//td[.=' mutton fry']/following-sibling::td[3]")).getText();
		//if(actual5.equals(expectedresult5)) {
		//	System.out.println("order is dispatch");
		//}
		//else {
		//	System.out.println("order is not dispatch");
		//}
		//driver.close();
	}
}
