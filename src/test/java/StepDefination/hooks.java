package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks {

	WebDriver driver;
	
	
	@Before
	public void before() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
System.out.println("BEFORE METHOD");
		
	}
	
	@After
	public void after() {
		System.out.println("AFTER METHOD");
		driver.close();
	}
	
	@BeforeStep
	public void beforestep() {
		System.out.println("THIS IS BEFORESTEP METHOD");
	}
	
	@AfterStep
	public void afterstep() {
		System.out.println("THIS IS AFTERSTEP METHOD");
	}
	
	
	@Given("User is on lpage")
	public void user_is_on_lpage() {
	    System.out.println("we are on login page");		
	}

	@When("User enters email")
	public void user_enters_email() throws InterruptedException {
		
		 driver.findElement(By.id("email")) .sendKeys("rutu1@gmail.com");
		  Thread.sleep(3000);

	}

	@When("User enters password")
	public void user_enters_password() throws InterruptedException {
		
		driver.findElement(By.id("password")).sendKeys("rutu123");
		Thread.sleep(3000);

	    
	}

	@Then("User clicks on sbutton")
	public void user_clicks_on_sbutton() throws InterruptedException {
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

		
	   	}
	
	
	
	
	
	
	
	
}
