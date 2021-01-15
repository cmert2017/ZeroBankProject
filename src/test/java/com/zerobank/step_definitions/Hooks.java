package com.zerobank.step_definitions;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @BeforeClass
    public void setUp1(){

//        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//        Driver.getDriver().get(ConfigurationReader.getProperty("zerobankUrl"));
       // Driver.getDriver().get("http://www.amazon.com");


    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }


}
