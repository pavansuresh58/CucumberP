package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class redbus 
{
	public WebDriver driver;
	public String title;
	@Given("open the redbus application")
	public void open_the_redbus_application() 
	{
	    System.out.println("application should open");
	    driver = new ChromeDriver();
	    driver.get("https://www.redbus.in/");
	    
	}

	@When("Test the redbus page title")
	public void test_the_redbus_page_title() 
	{
		System.out.println("Current page is captured");
		title = driver.getTitle();
	}

	@Then("title should match to redbus")
	public void title_should_match_to_redbus() 
	{
		Assert.assertTrue(title.contains("redbus"),"Title is not matched");
		System.out.println("Title is  matched");
	}

}
