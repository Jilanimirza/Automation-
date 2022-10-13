package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author jilani
 *How to handle the links,buttons and checkboxes using selenium webdriver?
 */

public class HandleBasicHTMLControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindichk = driver.findElement(By.id("hindichbx"));
		hindichk.click();//check box right click selecet chasthady
		Thread.sleep(3000);
if(hindichk.isSelected())
	hindichk.click();//uncheck chasthady
Thread.sleep(3000);
driver.findElement(By.id("registerbtn")).click();

//When we click on registration button it will display the text here to print that text we are writting below line
System.out.println(driver.findElement(By.id("msg")).getText());
Thread.sleep(3000);
driver.findElement(By.linkText("Click here to navigate to the home page")).click();




	}

}
