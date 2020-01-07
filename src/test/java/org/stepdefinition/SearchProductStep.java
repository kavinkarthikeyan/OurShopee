package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;



public class SearchProductStep {

	WebDriver driver;

	@Given("The user should search the product in Ourshopee webpage")
	public void the_user_should_search_the_product_in_Ourshopee_webpage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kavin\\My Workspace\\Cummumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.ourshopee.com/");
	}

	@When("The user enters the {string} in searchbar and clicks search icon")
	public void the_user_enters_the_in_searchbar_and_clicks_search_icon(String productname) {
		WebElement searchbox = driver.findElement(By.id("searchbox"));
		searchbox.sendKeys(productname);
		WebElement searchbtn = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		searchbtn.click();

	}

	@When("user gets the list of products and prints in console")
	public void user_gets_the_list_of_products_and_prints_in_console() {

		List<WebElement> prlist = driver.findElements(By.xpath("//h2[@class='pro-name']"));
		for (WebElement x : prlist) {
			System.out.println(x.getText());
		}

	}

	@Then("the page should be navigated to products page")
	public void the_page_should_be_navigated_to_products_page() {
		driver.quit();
	}

}
