package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{


    @FindBy(id = "signin_button")
    private WebElement signInButton;

    public  void clickSigInButton(){
        signInButton.click();
    }
}
