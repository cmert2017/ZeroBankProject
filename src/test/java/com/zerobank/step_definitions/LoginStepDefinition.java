package com.zerobank.step_definitions;

import com.zerobank.pages.LandingPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {



    LandingPage landingPage = new LandingPage();
    LoginPage loginPage = new LoginPage();



    @Given("authorize user is on the login page")
    public void authorize_user_is_on_the_login_page() {

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("zerobankUrl"));
        landingPage.clickSigInButton();


    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
       Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       loginPage.login();

    }

    @Then("system displays the account summary page")
    public void system_displays_the_account_summary_page() {
        System.out.println("Then step");

    }



}
