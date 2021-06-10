package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        // 1- open chrome browser
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- go to google.com
        driver.get("https://www.google.com");


        // 3- click to Gmail from right

        driver.findElement(By.linkText("Gmail")).click();
        // OR
     //   driver.findElements(By.partialLinkText("mail")).click();

        // 3- verify title contains
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification Passed");

        } else {
            System.out.println("Title verification failed");
        }

        // 5-  go back to google using the  .back();
        driver.navigate().back();

        // 6- verify title equals
        // Expected : Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if(actualGoogleTitle.equals(actualGoogleTitle)){
            System.out.println("Title Verification passed");
        } else {
            System.out.println("Title verification failed");
        }
    }
}