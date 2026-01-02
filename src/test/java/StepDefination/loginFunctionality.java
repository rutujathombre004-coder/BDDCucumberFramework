package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginFunctionality {
	
WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}

	@When("user enters username")
	public void user_enters_username() throws InterruptedException {
	  driver.findElement(By.id("email")) .sendKeys("rutu1@gmail.com");
	  Thread.sleep(3000);
		
		
		
	}

	@When("user enters password")
	public void user_enters_password() throws InterruptedException {
		
		driver.findElement(By.id("password")).sendKeys("rutu123");
		Thread.sleep(3000);
	   	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	   
	}

	@Then("user is verifying the title")
	public void user_is_verifying_the_title() throws InterruptedException {
	 String title= driver.getTitle();  
	 System.out.print("title of the page is "+title);
	 Thread.sleep(3000);
	 driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
