package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CartLoginSteps 
{
	public WebDriver driver;
	@Given("Open Cart Login page")
	public void open_cart_login_page() 
	{
		driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("I enter valid credentials for login")
	public void i_enter_valid_credentials_for_login(DataTable table) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> dt =table.asMaps();
		
		driver.findElement(By.name("email")).sendKeys(dt.get(0).get("email"));
		driver.findElement(By.name("password")).sendKeys(dt.get(0).get("password"));
	    
	}

	@When("I click Login button from cart page")
	public void i_click_login_button_from_cart_page() 
	{
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Is should able to login into openCart application")
	public void is_should_able_to_login_into_open_cart_application() 
	{
	    Assert.assertTrue(driver.getCurrentUrl().contains("account"),"Login Fail");
	    System.out.println("Login Completed!");
	}

}
