package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v102.page.Page;

public class loginPage {

     WebDriver driver;
     
          //IDENTIFIERS
	
	//Here instead of txt_username we can give name what ever we want 
	By txt_username = By.id("name");
	
	By txt_password = By.id("password");
	
	By btn_login = By.id("login");
	
	By btn_logout = By.id("logout");
	
	
	//Constructer is a same name as a class name
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		
		//if(!driver.getTitle().equals("TestProjet Demo")) {
			//throw new IllegalStateException("This is not Login Page. The current page is" +driver.getCurrentUrl());
		}
		
	
	
	
	       //METHODS
	
	//Creating function for enter user name
	//String username is argument in the function and what ever we passed that will be stored in username
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);

}
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clicklogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void checkLogoutisDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	public void loginValidUser(String username, String password) {
		
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		
	}
}
