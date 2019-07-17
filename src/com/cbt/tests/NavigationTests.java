package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static void main(String[] args) {

        WebDriver driver1 = BrowserFactory.getDriver("chrome");
        driver1.manage().window().maximize();
        driver1.get("https://google.com");
        String actualTitle1 = driver1.getTitle();
        String expectedTitle1 = "Google";
        driver1.navigate().to("https://etsy.com");
        String actualTitle2 = driver1.getTitle();
        String expectedTitle2 = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver1.navigate().back();
        StringUtility.verifyEquals(actualTitle1,expectedTitle1);
        driver1.navigate().forward();
        StringUtility.verifyEquals(actualTitle2,expectedTitle2);
        driver1.close();

        WebDriver driver2 = BrowserFactory.getDriver("firefox");
        driver2.manage().window().maximize();
        driver2.get("https://google.com");
        String actualTitle3 = driver2.getTitle();
        String expectedTitle3 = "Google";
        driver2.navigate().to("https://etsy.com");
        String actualTitle4 = driver2.getTitle();
        String expectedTitle4 = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver2.navigate().back();
        StringUtility.verifyEquals(actualTitle3,expectedTitle3);
        driver2.navigate().forward();
        StringUtility.verifyEquals(actualTitle4,expectedTitle4);
        driver2.close();

        WebDriver driver3 = BrowserFactory.getDriver("edge");
        driver3.manage().window().maximize();
        driver3.get("https://google.com");
        String actualTitle5 = driver3.getTitle();
        String expectedTitle5 = "Google";
        driver3.navigate().to("https://etsy.com");
        String actualTitle6 = driver3.getTitle();
        String expectedTitle6 = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        driver3.navigate().back();
        StringUtility.verifyEquals(actualTitle5,expectedTitle5);
        driver3.navigate().forward();
        StringUtility.verifyEquals(actualTitle6,expectedTitle6);
        driver3.close();

    }
}
