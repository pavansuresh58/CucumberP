package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AmazonSteps 
{	
	public WebDriver driver;
	@Given("Open Amazon Application")
	public void open_amazon_application() 
	{
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in");
	}

	@When("user captures actual title of HomePage")
	public void user_captures_actual_title_of_home_page() 
	{
	  System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with expected Homepage title")
	public void title_should_be_matched_with_expected_homepage_title() 
	{
		Assert.assertTrue(driver.getTitle().contains("Online"),"Title is not matched");
		System.out.println("Home page Title is maatched!");
	}

	@When("User opens best Seller page")
	public void user_opens_best_seller_page() 
	{
	  driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("User captures Best sellers page actual title")
	public void user_captures_best_sellers_page_actual_title()
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with best sellers expected  title")
	public void title_should_be_matched_with_best_sellers_expected_title() 
	{
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"),"Title is not matched");
		System.out.println("BestSellers Title is maatched!");
	}

	@When("User opens Mobiles page")
	public void user_opens_mobiles_page() 
	{
		driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("User captures  Mobiles page actual title")
	public void user_captures_mobiles_page_actual_title() 
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with Mobiles  expected  title")
	public void title_should_be_matched_with_mobiles_expected_title() 
	{
		Assert.assertTrue(driver.getTitle().contains("Phones"),"Title is not matched");
		System.out.println("Mobiles page Title is maatched!");
	}

	@When("User opens TodayDeals page")
	public void user_opens_today_deals_page() 
	{
		driver.findElement(By.linkText("Today's Deals")).click();
	}

	@When("User captures  TodayDeals page actual title")
	public void user_captures_today_deals_page_actual_title()
	{
		System.out.println(driver.getTitle());
	}

	@Then("Title should be matched with TodayDeals  expected  title")
	public void title_should_be_matched_with_today_deals_expected_title()
	{
		Assert.assertTrue(driver.getTitle().contains("Deals"),"Title is not matched");
		System.out.println("TodaysDeals Title is maatched!");
	}

}
