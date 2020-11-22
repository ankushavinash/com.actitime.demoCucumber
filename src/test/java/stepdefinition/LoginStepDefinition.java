package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	static {
		System.setProperty("webdriverdriver.chrome.driver", "./chromedriver.exe");
	}
	
	@Given("^the browser is launched$")
	public void the_browser_is_launched() throws Throwable {
		
		driver = new ChromeDriver();
	}

	@Given("^the application is loaded$")
	public void the_application_is_loaded() throws Throwable {
		driver.get("http://localhost/login.do");
	}

	@When("^the user enters the valid username$")
	public void the_user_enters_the_valid_username() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("^the user enters the valid password$")
	public void the_user_enters_the_valid_password() throws Throwable {
		driver.findElement(By.name("pwd")).sendKeys("manage");
	}

	@When("^the user click on the login Button$")
	public void the_user_click_on_the_login_Button() throws Throwable {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("^dashboard should be displayed$")
	public void dashboard_should_be_displayed() throws Throwable {
		Assert.assertEquals("", "");
		driver.close();
	}
	
	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.close();
	}
	
	@When("^the user enters the credentials as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_credentials_as_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.name("pwd")).sendKeys(arg2);
		Thread.sleep(3000);
		driver.close();
	}
	
	//LoginFeature2
	@When("^the user enters the valid credendials username and password$")
	public void the_user_enters_the_valid_credendials_username_and_password(DataTable data) throws Throwable {
		
	/* For List 
	    List<List<String>> dataTable = data.asLists(String.class);
		driver.findElement(By.id("username")).sendKeys(dataTable.get(0).get(0));
		driver.findElement(By.name("pwd")).sendKeys(dataTable.get(0).get(1));
		Thread.sleep(3000);
	  */
	
	//For Map (LoginFeature3.feature)
		List<Map<String, String>> dataMap = data.asMaps(String.class, String.class);
		driver.findElement(By.id("username")).sendKeys(dataMap.get(0).get("username"));
		driver.findElement(By.name("pwd")).sendKeys(dataMap.get(0).get("password"));
		Thread.sleep(3000);
		
	// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	}

	
	

}
