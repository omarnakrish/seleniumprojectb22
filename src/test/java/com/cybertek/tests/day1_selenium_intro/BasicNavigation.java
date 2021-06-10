package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // 1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2-create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        // 3- get the page for Tesla.com
        driver.get("https://www.tesla.com");


        //putting 3 seconds of wait /stops the code foe 3 seconds
        Thread.sleep(3000);

        // Going back using navigation
        driver.navigate().back();

        //putting 3 seconds of wait /stops the code foe 3 seconds
        Thread.sleep(3000);

        // 4- Going forward using navigation
        driver.navigate().forward();

        //putting 3 seconds of wait /stops the code foe 3 seconds
        Thread.sleep(3000);

        //refreshing the page using navigation
        driver.navigate().refresh();

        // Going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("current title: "+driver.getTitle());
    }
}
