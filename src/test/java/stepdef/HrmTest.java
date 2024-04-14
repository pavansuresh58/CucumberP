package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HrmTest 
{
	WebDriver driver;
	@Given("Open Orangehrm applicaiton")
	public void open_orangehrm_applicaiton() 
	{
	    driver = new ChromeDriver();
	    
	    //global wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    
	}

	@When("User enters username  {string} and enters password {string}")
	public void user_enters_username_and_enters_password(String un, String psw)
	{
		//username
	    driver.findElement(By.name("username")).sendKeys(un);
	    driver.findElement(By.name("password")).sendKeys(psw);
	    
	}

	@When("User clicks on Login button from login panel")
	public void user_clicks_on_login_button_from_login_panel()
	{
		driver.findElement(By.className("orangehrm-login-button")).click();
	}

	@Then("User should able to login and navigate dashboard page")
	public void user_should_able_to_login_and_navigate_dashboard_page()
	{
		//validation
	    Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
	    System.out.println("Login Completed!");
	}


}
