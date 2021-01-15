package com.zerobank.step_definitions;

import com.zerobank.pages.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

    LandingPage landingPage = new LandingPage();



    @Given("authorize user is on the login page")
    public void authorize_user_is_on_the_login_page() {

        landingPage.clickSigInButton();

    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("When step");

    }

    @Then("system displays the account summary page")
    public void system_displays_the_account_summary_page() {
        System.out.println("Then step");

    }



}
