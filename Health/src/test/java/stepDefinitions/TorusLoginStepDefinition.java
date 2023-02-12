package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.PageObjectManager;
import PageObjects.TorusLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.TestContextSetup;


public class TorusLoginStepDefinition {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	public TorusLoginStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup = testContextSetup;
	}
	
	
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.out.println("Open  Chrome");
	}

	@When("^User opens URL as (.+)$")
	public void user_opens_url_as() {
	    
		//WebDriverManager.chromedriver().setup();
		//testContextSetup.driver = new ChromeDriver();
	//	testContextSetup.driver.get("https://proto.heytorus.com");
	}

	@When("User clicks on Signup using  Mobile number")
	public void user_clicks_on_signup_using_mobile_number() {
	    TorusLogin torusLogin = new TorusLogin(driver);
	    torusLogin.Signup();
	}

	@When("User enters mobile number\"{int}\"")
	public void user_enters_mobile_number(Integer MobileNumber) {
	   
	}

	@When("User clicks on continue button also clicks on skip button")
	public void user_clicks_on_continue_button_also_clicks_on_skip_button() {
	    
	}

	@When("User enters the received OTP {string}")
	public void user_enters_the_received_otp(String string) {
	    
	}

	@When("useer clicks on continue button")
	public void useer_clicks_on_continue_button() {
	    
	}

	@Then("user enters first name {string}")
	public void user_enters_first_name(String string) {
	    
	}

	@Then("User enters Middle name {string}")
	public void user_enters_middle_name(String string) {
	    
	}

	@Then("User enters Last name {string}")
	public void user_enters_last_name(String string) {
	    
	}

	@Then("User enters Email Address {string}")
	public void user_enters_email_address(String string) {
	    
	}

	@Then("User clicks on Continue")
	public void user_clicks_on_continue() {
	    
	}

	@Then("User enters new Mpin {string}")
	public void user_enters_new_mpin(String string) {
	    
	}

	@Then("User re-enters Mpin {string}")
	public void user_re_enters_mpin(String string) {
	    
	}

	@Then("User submits the MPIN")
	public void user_submits_the_mpin() {
	    
	}

	@Then("User enters the set Mpin {string}")
	public void user_enters_the_set_mpin(String string) {
	    
	}

	@Then("User verify the entered")
	public void user_verify_the_entered() {
	    
	}


}
