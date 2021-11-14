package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	 @Given("^user is on netbanking login page$")
	    public void user_is_on_netbanking_login_page() throws Throwable {
	       // throw new PendingException();
		 System.out.println("Navigated to url");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	       // throw new PendingException();
	    	System.out.println("Login into application");
	    	System.out.println("Login into application1");
	    	System.out.println("Login into application2");
	    	
	    }

	    @Then("^homepage is populated$")
	    public void homepage_is_populated() throws Throwable {
	        //throw new PendingException();
	    	System.out.println("navigated to homepage");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	        //throw new PendingException();
	    	System.out.println("Validated Cards");
	    }

	}

