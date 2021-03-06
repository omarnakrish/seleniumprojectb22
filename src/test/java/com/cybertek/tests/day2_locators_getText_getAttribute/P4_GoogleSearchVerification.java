package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearchVerification {
    public static void main(String[] args) {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("https://www.google.com");


// write apple in search box
        //click "ENTER" buttom
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);


        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }
    }
}
