package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.get("https://www.youtube.com/");
	    
	    
	    driver.get("https://www.netflix.com/in/login/");
	    driver.findElement(By.id("id_userLoginId")).sendKeys("amit");
	    driver.findElement(By.id("id_password")).sendKeys("gfhfhfffgfd");
	    
	    driver.findElement(By.xpath("//span[@class='fbBtnText']")).click();
	    driver.findElement(By.xpath("//span[.='Gift Card Terms']")).click();
	    String t = driver.getTitle();
	    System.out.println(t);
	    String f = driver.getCurrentUrl();
	    System.out.println(f);
	    Thread.sleep(3000);
	    driver.close();
	}
}
