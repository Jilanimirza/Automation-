package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesIntelLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.salesintel.io/account/login");
		Thread.sleep(3000);

		// NEGATIVE SCENARIO

		// without password
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.midha@astegic.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Password is')]")).getText());
		// Out Put is Password is required

		// Refresh the Page 
		driver.navigate().refresh();

		// without email id

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic1!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Username is')]")).getText());
		// Out Put is Username is required

		// Refresh the Page
		driver.navigate().refresh();

		// Invalid Password

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.midha@astegic.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.navigate().refresh();

		// Invalid Email

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.mi@astegic.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic1!");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		driver.navigate().refresh();

		// Forgot Password

		driver.findElement(By.xpath("//a[@title='Forgot Password?']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jilani@itaugments.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		driver.navigate().refresh();

		// POSITIVE SCENARIO

		// LOGIN

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.midha@astegic.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic1!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// LOGOUT

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='welcome-anchor-color text-decoration-none']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		// OPERATIONS

		// LOGIN

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.midha@astegic.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic1!");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		// Click on Company radio Button
		driver.findElement(By.xpath("//div[@class='pr-1']//div[@class='form-check']//label[@class='form-check-label']//input[@type='radio']")).click();
		Thread.sleep(3000);
		// Click on Search Button
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(10000);
		// Click on Company
		// driver.findElement(By.xpath("//span[@class='h6 py-2 px-0 cursor-pointer
		// search-bar-title']//span[contains(text(),'Company')]")).click();
		// Thread.sleep(3000);

		driver.findElement(By.xpath("(//I[@class=\"fa pr-3 text-primary-light fa-chevron-right\"])[1]")).click();
		WebElement boxclick = driver.findElement(By.xpath("//div[@class=\"company-search col-sm-12 pt-2\"]//ng-select"));
		Thread.sleep(5000);
		boxclick.sendKeys("123");
		// boxclick.sendKeys("jilani");
		// Thread.sleep(4000);
		// driver.findElement(By.xpath("//ng-select[@class='ng-select ng-select-multiple
		// ng-select-taggable ng-select-searchable ng-select-clearable ng-pristine
		// ng-valid ng-select-bottom ng-touched
		// ng-select-opened']//div[@class='ng-select-container']//div[@class='ng-value-container']")).sendKeys("123");

		// boxclick.sendKeys("jilani");

		// WebElement textboxclick =
		// driver.findElement(By.xpath("//ng-select[@class='ng-select ng-select-multiple
		// ng-select-taggable ng-select-searchable ng-select-clearable ng-untouched
		// ng-pristine
		// ng-valid']//div[@class='ng-select-container']//div[@class='ng-value-container']"));
		// Thread.sleep(3000);
		// textboxclick.click();
		// Thread.sleep(3000);
		// textboxclick.sendKeys("GSTV");
		// textboxclick.sendKeys(keys.Enter);

		// WebElement welcomeElement =
		// driver.findElement(By.xpath("//span[@class='welcome-anchor-color
		// text-decoration-none']"));
		// Select welcomeNameDropdown = new Select(welcomeElement);

		// Select welcomeNameDropdown = new Select(welcomenameDropdown)
		// List<WebElement> welcomeNameDropdownoptions =
		// welcomeNameDropdown.getOptions();
		// for (WebElement option : welcomeNameDropdownoptions) {

		// System.out.println(option.getText());

	}

	{

	}

	// welcomeNameDropdown.selectByVisibleText("Logout");
	// driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	// welcomeNameDropdown.selectByIndex(12);

	// driver.findElement(By.xpath("//span[@class='welcome-anchor-color
	// text-decoration-none']//i[@class='fa fa-chevron-down pl-1']")).click();

	// Faq
	// driver.findElement(By.xpath("//a[@class='px-4 py-2']")).click();

	// Thread.sleep(3000);
	// driver.navigate().back();

	// driver.navigate().to("https://app.salesintel.io/account/login");

	// driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");

	// To clear the Email id
	// driver.findElement(By.xpath("//input[@type='text']")).clear();
	// Thread.sleep(30000);

	// To get the text which is showing in alert box and print in console we use
	// below getText() method
	// System.out.println(driver.switchTo().alert().getText());
	// driver.findElement(By.xpath("//div[@id='toast-container']")).getText();

	// To click ok in alert box we use method accept()
	// driver.switchTo().alert().accept();

	// Invalid Password
	// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.midha@astegic.com");
	// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic");
	// driver.findElement(By.xpath("//button[@type='submit']")).click();
	// Thread.sleep(30000);

	// Frorgot Password
	// Faq
	// Positive Senario
	// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikas.midha@astegic.com");
	// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Astegic1!");
	// driver.findElement(By.xpath("//button[@type='submit']")).click();
	// Thread.sleep(30000);

}
