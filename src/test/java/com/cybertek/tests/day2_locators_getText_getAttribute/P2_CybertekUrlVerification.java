package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        // 1- set up the web driver
        WebDriverManager.chromedriver().setup();

        // 2- open chrome driver
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        // 4- go to https://practice.cybertek.com

        driver.get("https://practice.cybertekschool.com");

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();



        // 3- verify title

        //Expected practice
    }
}
