package com.practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertyFile {

	
		public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
				
				FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
				Properties p=new Properties();
				p.load(fis);
				String browser = p.getProperty("browser");
				String url = p.getProperty("url");
				String un = p.getProperty("username");
				String pw = p.getProperty("password");
				System.out.println(url);
				System.out.println(un);
				System.out.println(pw);
				driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
				driver.get(url);
				driver.findElement(By.name("un")).sendKeys("admin");
				driver.findElement(By.name("pw")).sendKeys("codeastro");
				driver.findElement(By.name("submit")).click();
				

	}

}
