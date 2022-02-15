package com.cydeo.tests.day05;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException extends Throwable {
    public static void main(String[] args) {

/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


 */

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get(" https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button

        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println(deleteButton.isDisplayed());

        //5. Click to “Delete” button.
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.

            System.out.println(deleteButton.isDisplayed());

                    }


    }




        //we will get (StaleElementReferenceException.java:49)
      //  driver.close();




