package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeamwithRating {

	public static void main(String[] args) {
       WebDriver driver= WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
       List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<teams.size(); i++) {
        	al.add(teams.get(i).getText());
        }
        for(String myteams:al) {
        	String rat="//span[.='"+myteams+"']/../following-sibling::td[3]";
        	String Ratings=driver.findElement(By.xpath(rat)).getText();
        	System.out.println("teams------->"+myteams+"------>Ratings----->"+Ratings);
        	}
	}
}
