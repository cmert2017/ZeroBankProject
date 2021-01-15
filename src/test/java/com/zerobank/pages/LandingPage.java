package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    @FindBy(id = "signin_button")
    private WebElement signInButton;


    public  void clickSigInButton(){
        signInButton.click();
    }


}
