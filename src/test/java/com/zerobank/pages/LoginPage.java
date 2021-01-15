package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id = "user_login")
    private WebElement inputBox;


    @FindBy(id = "user_password")
    private WebElement passwordBox;

    public  void login(){
        inputBox.sendKeys(ConfigurationReader.getProperty("zerobankUserName") );
        passwordBox.sendKeys(ConfigurationReader.getProperty("zerobankPassword") + Keys.ENTER);
    }







}
