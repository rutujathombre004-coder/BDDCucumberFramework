package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class background {

WebDriver driver;

@Given("User in on login page")
public void user_in_on_login_page() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);

}

@When("User is clicking on the signup button")
public void user_is_clicking_on_the_signup_button() throws InterruptedException {
	
	driver.findElement(By.id("signup")).click();
	
	Thread.sleep(3000);
	
    }

@Then("User is entering Firstname & Lastname")
public void user_is_entering_firstname_lastname() throws InterruptedException {
    
	driver.findElement(By.id("firstName")).sendKeys("rutu");
	driver.findElement(By.id("lastName")).sendKeys("thombre");
	Thread.sleep(3000);
	
}

@Then("Clicking on the submit button")
public void clicking_on_the_submit_button() throws InterruptedException {
	
	driver.findElement(By.id("submit")).click();
	
	Thread.sleep(3000);
	driver.close();
    }


@Then("User is entering email & password")
public void user_is_entering_email_password() {
	
	driver.findElement(By.id("email")).sendKeys("rut@gmail.com");
	driver.findElement(By.id("password")).sendKeys("122");
    }

@Then("User is clicking on cancle button")
public void user_is_clicking_on_cancle_button() {
    
	
	driver.findElement(By.id("cancel")).click();
	
	
	driver.close();
}

	
	
	
	
}
