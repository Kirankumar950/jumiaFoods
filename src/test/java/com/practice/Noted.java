package com.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Noted {

	public static void main(String[] args) throws Throwable {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.noteb.com/");
     driver.manage().window().maximize();
     driver.findElement(By.xpath("(//textarea[@class='select2-search__field'])[2]")).sendKeys("dell");
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     //driver.findElement(By.xpath("//div[.='Laptop type']")).click();
     driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
     driver.findElement(By.xpath("(//span[@class='form-check'])[1]")).click();
	}

}
