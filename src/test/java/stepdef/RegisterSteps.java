package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps 
{
	public WebDriver driver;
	@Given("Open Register page of OpenCart application")
	public void open_register_page_of_open_cart_application() 
	{
	    driver =new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("I enter required fields with valid data")
	public void i_enter_required_fields_with_valid_data(DataTable table) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<List<String>>  dt =table.cells();
		//System.out.println(dt.get(1).get(0));
	   driver.findElement(By.name("firstname")).sendKeys(dt.get(1).get(0));
	   driver.findElement(By.name("lastname")).sendKeys(dt.get(1).get(1));
	   driver.findElement(By.id("input-email")).sendKeys(dt.get(1).get(2));
	   driver.findElement(By.name("telephone")).sendKeys(dt.get(1).get(3));
	   driver.findElement(By.name("password")).sendKeys(dt.get(1).get(4));
	   driver.findElement(By.name("confirm")).sendKeys(dt.get(1).get(5));
	   
	   
	}

	@When("I click on Yes radio button")
	public void i_click_on_yes_radio_button() 
	{
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

	@When("I check privacy policy")
	public void i_check_privacy_policy() 
	{
	    driver.findElement(By.name("agree")).click();
	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() 
	{
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("I should able to register in opencart")
	public void i_should_able_to_register_in_opencart() 
	{
	    System.out.println("User is Registered!");
	}


}
