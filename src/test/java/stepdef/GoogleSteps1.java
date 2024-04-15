package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps1 
{
	
	public WebDriver driver;
	public String title;
	
	@Given("open google application")
	public void open_google_application() {
	    System.out.println("Google application opens!");
	     driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    }

	@When("i capture the current page title")
	public void i_capture_the_current_page_title() {
	    System.out.println("Current page title is captured!");
	    title=driver.getTitle();
	}

	@Then("title should match to google")
	public void title_should_match_to_google() {
	   
	    Assert.assertTrue(title.contains("Google"),"Title is not matched!");
	    System.out.println("Title is matched!");
	}


}
