package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefintion {

	WebDriver driver ;
	@Given("user is on facebook Login page")
	public void user_is_on_facebook_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	}

	@When("user enters the Login credntial")
	public void user_enters_the_login_credntial() {
	    driver.findElement(By.id("email")).sendKeys("kishorre");
	    driver.findElement(By.id("pass")).sendKeys("kishore123");
	}

	@When("user click login Button")
	public void user_click_login_button() {
	    driver.findElement(By.id("u_0_5_yN")).click();
	}

	@Then("Validate and take screenshoot")
	public void validate_and_take_screenshoot() {
	   
	}



	
	
	
	
}
