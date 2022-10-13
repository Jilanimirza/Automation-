package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
	
		//epudu Elementny identify chasy dhani reference ni usernameTxt ana oka variable lo store chasukunnam refence ni multiple times vadukovaly kadh andhuka store chasukunna.
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		
		//epudu manam isDisplayed() method use chasukony text box display ayendha ledha check chasukuntunnam
		if(usernameTxt.isDisplayed()) {
			
			//To check text box is enabled or not
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("HYR");
				
				//To get the text what is present in textbox
				String enteredText = usernameTxt.getAttribute("value");
				System.out.println("enteredText");
				Thread.sleep(3000);
				
				//To clear the text
				usernameTxt.clear();
			}
			else
				
		System.err.println("username textbox is not enabled");
		
		}
		else
			System.err.println("username textbox is not displayed");
		}

	}


