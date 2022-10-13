package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		
		//Single Selection Drop Down
		
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
		
		//This is to print the list of Elelments in console which are present in drop down
		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
		for (WebElement option : courseNameDropdownOptions)
			System.out.println(option.getText());
		
		//This is to select an Element from drop down 
		courseNameDropdown.selectByIndex(1); //Java
		Thread.sleep(3000);
		courseNameDropdown.selectByValue("net"); //Dot net
		Thread.sleep(3000);
		Select courseNmaeDropdown;
		courseNameDropdown.selectByVisibleText("Javascript"); //Javascript
		
		//This to print the First selected value in console
		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
		System.out.println("Selected visible text -" +selectedText);
		
//Multi Selection Drop Down
		
		
		WebElement ideElement = driver.findElement(By.id("ide"));
				Select ideDropdown = new Select(ideElement);
				
				//This is to print the list of Elelments in console which are present in drop down(Options Print chasthundy)
				List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
				for (WebElement option : ideDropdownOptions)
					System.out.println(option.getText());
				
				//This is to select an Element from drop down(Options Select Chasthundy)
				ideDropdown.selectByIndex(0); //Eclipse
				Thread.sleep(3000);
				ideDropdown.selectByValue("ij"); //IntelliJ IDEA
				Thread.sleep(3000);
				ideDropdown.selectByVisibleText("NetBeans"); //Net Beans
				Thread.sleep(3000);
				ideDropdown.deselectByVisibleText("IntelliJ IDEA");
				
				//This to print the selected options in console
				List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
				for (WebElement selectedOption : selectedOptions)
				System.out.println("Selected visible text -" +selectedOption.getText());
				
	}

}
