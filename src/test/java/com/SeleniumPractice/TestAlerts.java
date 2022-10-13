package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//Alert Box
		
		driver.findElement(By.id("alertBox")).click();
		//To get the text which is showing in alert box and print in console we use below getText() method
		System.out.println(driver.switchTo().alert().getText());
		//To click ok in alert box we use method accept()
		driver.switchTo().alert().accept();
		//To print the output
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Confirm Box
		
		driver.findElement(By.id("confirmBox")).click();
		//To get the text which is showing in alert box and print in console we use below getText() method
		System.out.println(driver.switchTo().alert().getText());
		//To click ok in alert box we use method accept()
		driver.switchTo().alert().accept();
		//To print the output
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Dismiss() means Cancel
		driver.findElement(By.id("confirmBox")).click();
		//To get the text which is showing in alert box and print in console we use below getText() method
		System.out.println(driver.switchTo().alert().getText());
		//To click ok in alert box we use method accept()
		driver.switchTo().alert().dismiss();
		//To print the output
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Prompt Box
		
		driver.findElement(By.id("promptBox")).click();
		//To get the text which is showing in alert box and print in console we use below getText() method
		System.out.println(driver.switchTo().alert().getText());
		//To type the text in Prompt popup
		driver.switchTo().alert().sendKeys("HYR Tutorials");
		//To click ok in alert box we use method accept()
		driver.switchTo().alert().accept();
		//To print the output
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//Dismiss() means Cancel
		driver.findElement(By.id("promptBox")).click();
		//To get the text which is showing in alert box and print in console we use below getText() method
		System.out.println(driver.switchTo().alert().getText());
		
		//To click ok in alert box we use method accept()
		driver.switchTo().alert().dismiss();
		//To print the output
		System.out.println(driver.findElement(By.id("output")).getText());
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
