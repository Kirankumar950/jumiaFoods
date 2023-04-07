package com.GenericUtilities;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * 
	 * @param driver
	 * @author Dell
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * 
	 * @param driver
	 * @author Dell
	 */
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * 
	 * @param driver
	 * @param Element
	 * @author Dell
	 */
	public void elementToBeVisiable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * 
	 * @param element
	 * @param index
	 * @author Dell
	 */
	public void select(WebElement element, int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	/**
	 * 
	 * @param element
	 * @param value
	 * @author Dell
	 */
	public void select(WebElement element, String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * 
	 * @param visiabletext
	 * @param element
	 * @author Dell
	 */
	public void select(String visiabletext,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(visiabletext);
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @author Dell
	 */
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param src
	 * @param dest
	 * @author Dell
	 */
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	/**
	 * 
	 * @param driver
	 * @author Dell
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * 
	 * @param driver
	 * @author Dell
	 */
	public void rightClick(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.contextClick().perform();
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 * @author Dell
	 */
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
/**
 * 
 * @param driver
 * @author Dell
 */
	public void entryKeyPress(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	}
	/**
	 * 
	 * @param driver
	 * @throws Throwable
	 * @author Dell
	 */
	public void enterKey(WebDriver driver) throws Throwable
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	/**
	 * 
	 * @param driver
	 * @throws Throwable
	 * @author Dell
	 */
	public void enterRelease(WebDriver driver) throws Throwable
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * 
	 * @param driver
	 * @param index
	 * @author Dell
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * 
	 * @param driver
	 * @param nameOrID
	 * @author Dell
	 */
	public void switchToFrame(WebDriver driver,String nameOrID)
	{
		driver.switchTo().frame(nameOrID);
	}
	/**
	 * 
	 * @param driver
	 * @param address
	 * @author Dell
	 */
	public void switchToFrame(WebDriver driver,WebElement address)
	{
		driver.switchTo().frame(address);
	}
	/**
	 * 
	 * @param driver
	 * @author Dell
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * 
	 * @param driver
	 * @author Dell
	 */
	public void cancleAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * 
	 * @param driver
	 * @param partialTitle
	 * @author Dell
	 */
public void switchToWindow(WebDriver driver,String partialTitle)
{
	//step1: use getwindows to capture all window id's
	Set<String> windows = driver.getWindowHandles();
	
	//step2: iterate through the windows
	Iterator<String> it = windows.iterator();
	
	//step3: check whether there is next window
	while(it.hasNext()) {
		
		//step4:capture current window id
		String winId=it.next();
		
		//step5: switch to current window and capture title
		String currentWinTitle=driver.switchTo().window(winId).getTitle();
		
		//step6: check whether current window is expected
		if(currentWinTitle.contains(partialTitle)) {
			break;
		}
	}
	
}
/**
 * 
 * @param driver
 * @param screenShotName
 * @return
 * @throws Throwable
 * @author Dell
 */
public static String getScreenShot(WebDriver driver,String screenShotName) throws Throwable  
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	String path=".\\Screenshot\\"+screenShotName+".png";
	File dst=new File(path);
	FileUtils.copyFile(src, dst);
	return path;	
}
/**
 * 
 * @param driver
 * @author Dell
 */
public void scrollBarAction(WebDriver driver)
{
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("Window.scrollBy(0,800)", "");
}

/**
 * 
 * @param driver
 * @param element
 * @author Dell
 */
public void scrollBarAction(WebDriver driver,WebElement element)
{
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	int y=element.getLocation().getY();
	jse.executeScript("Window.scrollBy(0,"+y+")", element);
	//jse.executeScript("argument[0].scrollIntoView()",element);
}

}
