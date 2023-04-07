package com.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlineFoodOrdering {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		Random ran=new Random();
		int ra = ran.nextInt(500);
		String expproj = "jumia food";
				try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.xpath("//a[.='Projects']")).click();
		driver.findElement(By.xpath("//span[.='Create Project']")).click();
		driver.findElement(By.name("projectName")).sendKeys(expproj+ra);
		driver.findElement(By.name("createdBy")).sendKeys("kiran"+ra);
		WebElement sta = driver.findElement(By.name("status"));
		Select s=new Select(sta);
		s.selectByVisibleText("Completed");
		driver.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		
		Driver driver1=new Driver();
		DriverManager.registerDriver(driver1);
		con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
		Statement state = con.createStatement();
		String query = "select * from project;";
		ResultSet result = state.executeQuery(query);
		boolean flag=false;
		while(result.next()) {
			String act = result.getString(4);
			System.out.println(act);
			if(act.equalsIgnoreCase(expproj)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("project is created");
		}
		else {
			System.out.println("project is not created");
		}
				}
		catch(Exception e){
			
		}
		finally {
			con.close();
		}

	}

}
