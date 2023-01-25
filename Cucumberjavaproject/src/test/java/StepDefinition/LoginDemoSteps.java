// package StepDefinition;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

// import io.cucumber.java.en.*;

// public class LoginDemoSteps 
// {
	
	// WebDriver driver = null;
	
	
//	@Given("browser is open")
//	public void browser_is_open() {
		
	//	System.out.println("Inside Step - browser is open");
	//	System.setProperty("webdriver.chrome.driver","C:/Users/hp/eclipse-workspace/Cucumberjavaproject/src/test/resources/driver/chromedriver.exe");
		
	//	driver = new ChromeDriver();
		
	    
//	}

//	@And("user is on login page")
//	public void user_is_on_login_page() {
	//	driver.navigate().to("https://example.testproject.io/web/");
	//	driver.manage().window().maximize();
	    
//	}

	// @When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		
	//	driver.findElement(By.id("name")).sendKeys(username);
	//	driver.findElement(By.id("password")).sendKeys(password);
	//	Thread.sleep(3000);
	//	JavascriptExecutor j = (JavascriptExecutor)driver; 
	//	j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	    
//	}
	
//	@And("user click on login")
//	public void user_click_on_login() throws InterruptedException {
		
	//	driver.findElement(By.id("login")).click();
//		Thread.sleep(3000);
	    
//	}

//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
	//	driver.findElement(By.id("logout")).isDisplayed();
	//	Thread.sleep(3000);
	//	driver.close();
	//	driver.quit();
	    
//	}

// }
