package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static WebDriver getDriver() {
        if(driver==null) {
            String browser = ConfigurationReader.getProperty("browser");

            switch (browser) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

            }

        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
           // System.out.println(driver.toString()); //to be deleted-- just for test
            driver=null;
        }
}


}
