package demodse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags {

	@Given("The user application")
	public void the_user_application() {
	   System.out.println("user appliv");
	}

	@When("Enter the username credentials for login")
	public void enter_the_username_credentials_for_login() {
		System.out.println("user enters");
	}

	@Then("Verify the successful login")
	public void verify_the_successful_login() {
		System.out.println("login success");
	}

	@When("edit the profile")
	public void edit_the_profile() {
		System.out.println("edit profile");
	}

	@Then("Verify the address")
	public void verify_the_address() {
		System.out.println("edit address");

}
}
