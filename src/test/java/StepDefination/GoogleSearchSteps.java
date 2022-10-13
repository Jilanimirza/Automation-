//package StepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleSearchSteps {
//
//   
//	//In this method we have write the code for only Open the Browser
//	
//	WebDriver driver=null;
//    
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step- browser is open");
//		
//		//Now this statement will get location of the Project folder which is in this case is Selenium Practice(Main Project name)
//		//in string projectPath we are saving the path of main project
//		String projectPath = System.getProperty("user.dir");
//		
//		//It will print the path which is saved in projectPath
//		System.out.println("Project Path is:"+projectPath);
//		
//		//Here while getting the properties of chrome driver we are using projectPath path and chrome driver path and this path will be called at any where
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/Features BDD/drivers/chromedriver.exe");
//		
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//	}
//	
//	
//	
//	
//	
//	//This method will open Google Page
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step- user is on google search page");
//		
//		
//		//It will navigate to google page
//		driver.navigate().to("https://www.google.com");
//
//	}
//	
//	
//	
//	
//	
//	
////This Method will type the text in google search bar
//	
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//
//		System.out.println("Inside Step- user enters a text in search box");
//		
//		//This will click on text box and print the Text
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//
//	}
//	
//	
//	
//	
//	
//	//This method is only to hit the Enter Key
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("Inside Step- hits enter");
//		
//		//This will click the enter at text box
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//	}
//	
//	
//	
//	
////This method is for to check that user is navigated to search page
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//
//		System.out.println("Inside Step- user is navigated to search results");
//		
//		//This line will check the Online courses text is present in navigated page
//		driver.getPageSource().contains("Online Courses");
//		
//		//It will close the current window
//		driver.close();
//		
//		//it will close the browser
//		driver.quit();
//	}
//
//
//}
