package com.cydeo.tests.day05;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RatioButton {
    public static void main(String[] args) {
     /*
     XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


      */

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons  ");

        // 3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey'] "));
        hockeyButton.click();

        // 4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("Hockey button is selected " + hockeyButton.isSelected());

        System.out.println(hockeyButton.isEnabled());

        WebElement green = driver.findElement(By.id("green"));
        System.out.println(green.isDisplayed());
        System.out.println(green.isSelected());
        System.out.println(green.isEnabled());

       // driver.close();
    }
}
