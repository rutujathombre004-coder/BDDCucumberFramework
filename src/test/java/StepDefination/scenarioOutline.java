package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenarioOutline {
	
WebDriver driver;

	@Given("user is on loginpage")
	public void user_is_on_loginpage() throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("user is providing {string}& {string}")
	public void user_is_providing(String Username, String Password) throws InterruptedException {

		driver.findElement(By.id("email")) .sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);

		Thread.sleep(3000);

		
		
	}

	@Then("user is clicking on submit button")
	public void user_is_clicking_on_submit_button() throws InterruptedException {
	
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}

	@Then("verifying title of the page")
	public void verifying_title_of_the_page() throws InterruptedException {
	  
		
		 String title= driver.getTitle();  
		 System.out.print("title of the page is "+title);
		 Thread.sleep(3000);

		 driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
