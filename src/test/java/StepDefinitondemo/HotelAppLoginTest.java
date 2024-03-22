package StepDefinitondemo;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {
	WebDriver driver;
	
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		String url=driver.getCurrentUrl();//extracting the link
		Assert.assertEquals(url,"https://adactinhotelapp.com/");//verifying the link
	    
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}

	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		/*
		 * String
		 * Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
		 * Assert.assertEquals(Greeting,"Hello vasuvespag!");
		 */
		
	}
	
	@Before
	public void Login()
	{
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		System.out.println("Welcome to Jenkins");
		System.out.println("Welcome to Jenkins");
	}
	@After
	public void details()
	{
		driver.quit();
	}

}
