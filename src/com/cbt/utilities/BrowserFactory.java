package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String driver) {

        if(driver.equalsIgnoreCase("safari")){
            return null;
        }else if(driver.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\chromedriver.exe");
            return new ChromeDriver();
        }else if(driver.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\geckodriver.exe");
            return new FirefoxDriver();
        }else if (driver.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\Mustafa\\Documents\\Selenium_Dependicies\\drivers\\MicrosoftWebDriver.exe");
            return new EdgeDriver();
        }
        return null;
    }
}
