package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLab {

	static WebDriver dr;

	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("user-name")).sendKeys("problem_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
	  //  throw new io.cucumber.java.PendingException();
	}

	@And("click on OK button")
	public void click_on_ok_button() {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("login-button")).click();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Login successful and user redirect to home page")
	public void login_successful_and_user_redirect_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		dr.close();
	   // throw new io.cucumber.java.PendingException();
	}

}
