package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AlertPractices {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }
    @Test
    public void information_alert_test(){

        //Locating the button for alert to click
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //3. Click to “Click for JS Alert” button
        informationAlertButton.click();

        //4. Click to OK (accept) button from the alert
        Alert alert = driver.switchTo().alert();

        alert.accept();



        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText= "You successfuly clicked an alert";
        String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(), "Result text is NOT displayed on the page.");

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected.");

    }


}
