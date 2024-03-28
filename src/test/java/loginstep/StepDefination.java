package loginstep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination {
	
	@Given("User should be login page")
	public void user_should_be_login_page() {
	    System.out.println("user_should_be_login_page");
	}

	@When("user need to enter the username")
	public void user_need_to_enter_the_username() {
		System.out.println("user need to enter the username");
	}

	@When("user need to enter the password")
	public void user_need_to_enter_the_password() {
		System.out.println("user need to enter the password");
	}

	@When("user need to click on login button")
	public void user_need_to_click_on_login_button() {
		System.out.println("user need to click on login button");
	    	}

   

}
