package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='input-group-prepend']/span/input")).sendKeys("123");
		//driver.findElement(By.name("password")).sendKeys("12345");
		//Thread.sleep(3000);
		//driver.findElement(By.className("header-logo"));
		//driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.partialLinkText("Create an"));
		//driver.findElement(By.tagName("h1"));
		//driver.findElement(By.xpath("//label[contains(text(),'Username or email address')]"));
		//driver.findElement(By.cssSelector("input[name='commit']"));

	}

}
