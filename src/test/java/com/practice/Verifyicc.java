package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verifyicc {

	public static void main(String[] args) {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		 String teamname = "India";
		List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		boolean flag=false;
		for(int i=0;i<teams.size();i++)//for(webElement name:teams)
		{
			String text = teams.get(i).getText();
			if(text.equals(teamname)) {
				System.out.println("is present");
				flag=true;
				break;
			}
			else {
				System.out.println("not present");
			}
		if(!flag) {
			System.out.println("not present");
		}
		}
	}

}
