package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
driver.findElement(By.name("q")).sendKeys("HYR Tutorials");

//In Google after typing HYR Tutorials we to click on Enter for that we have written below line
driver.findElement(By.name("q")).submit();
Thread.sleep(3000);

//To navigate from one tab to another or to navigate from present url to another url
driver.navigate().to("https://www.facebook.com/");
Thread.sleep(3000);
//Here in facebook we have entered the text
driver.findElement(By.id("email")).sendKeys("test@gmail.com");
Thread.sleep(3000);
//Here we refresh the facebook page
driver.navigate().refresh();
Thread.sleep(3000);
//This is to come back to again google page
driver.navigate().back();
Thread.sleep(3000);
//This to go forward to again facebook page
driver.navigate().forward();
Thread.sleep(3000);
//To close the browser
driver.quit();
	}
	

}
