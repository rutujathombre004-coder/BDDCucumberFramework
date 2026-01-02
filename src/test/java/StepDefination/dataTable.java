package StepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataTable {

	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@When("User enters username & password")
	public void user_enters_username_password(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> data = dataTable.cells();
		driver.findElement(By.id("email")) .sendKeys(data.get(0).get(0));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));

		Thread.sleep(3000);
		
		
	  	}

	@Then("User clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);

	
	}

	@Then("User verify title")
	public void user_verify_title() throws InterruptedException {
		
		
		 String title= driver.getTitle();  
		 System.out.print("title of the page is "+title);
		 Thread.sleep(3000);
	

	    	}
	@Then("users clicks on add new contact button")
	public void users_clicks_on_add_new_contact_button() {
	    
		driver.findElement(By.id("add-contact")).click();
		
		
	}

	@Then("users enters personal info")
	public void users_enters_personal_info(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> data1= dataTable.cells();
		
		driver.findElement(By.id("firstName")).sendKeys(data1.get(0).get(0));
		driver.findElement(By.id("lastName")).sendKeys(data1.get(1).get(1));
		driver.findElement(By.id("birthdate")).sendKeys(data1.get(2).get(1));
		driver.findElement(By.id("phone")).sendKeys(data1.get(3).get(1));
	
		Thread.sleep(3000);
		driver.close();
	  	}
	
	
	
	
	
	
	
	
	
}
