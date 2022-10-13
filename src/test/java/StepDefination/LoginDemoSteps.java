//package StepDefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginDemoSteps {
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
//		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/java/Features BDD/drivers/chromedriver.exe");
//
//		//For fire fox
//		System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/java/Features BDD/drivers/geckodriver.exe");
//
//		//For Chrome driver
//		//driver=new ChromeDriver();
//
//		//For Firefox driver
//		driver=new FirefoxDriver();
//
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//
//		driver.navigate().to("https://example.testproject.io/web");
//
//	}
//
//	//Here we can pass different number of user names and passwords 
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);	
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.id("login")).click();
//
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//
//		driver.findElement(By.id("logout")).isDisplayed();
//
//		//driver.close();
//		//driver.quit();
//	}
//
//
//}
