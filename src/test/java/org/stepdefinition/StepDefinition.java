package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("The OurShopee page should be launched")
	public void the_OurShopee_page_should_be_launched() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\My Workspace\\Cummumber\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.ourshopee.com/");
	}
	@When("enters username and password")
	public void enters_username_and_password() {
		 driver.findElement(By.xpath("//span[text()=' Sign In / Sign Up ']")).click();
			WebElement login = driver.findElement(By.xpath("//a[@class='login-button']"));
			login.click();
			WebElement username = driver.findElement(By.id("login_email"));
			username.sendKeys("karthikeyan.kavin@gmail.com");
			WebElement pass = driver.findElement(By.id("login_password"));
			pass.sendKeys("12345678");

	}
	
	@When("user clicks the signUp button")
	public void user_clicks_the_signUp_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login']"));
		loginbtn.click();
	}
	

	@Then("The page should be navigate to homepage")

	public void the_page_should_be_navigate_to_homepage() {
		Assert.assertEquals("https://www.ourshopee.com/my-account/", driver.getCurrentUrl());

	}

}