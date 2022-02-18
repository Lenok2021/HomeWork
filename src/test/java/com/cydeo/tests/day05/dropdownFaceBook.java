package com.cydeo.tests.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class dropdownFaceBook {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }


    @Test
    public void dropDown() {

        WebElement element1 = driver.findElement(By.xpath("//div/a[@id = 'dropdownMenuLink']"));
        // Click to non-select dropdown
        element1.click();

        WebElement faceBook = driver.findElement(By.xpath(" //a[.='Facebook']"));
        faceBook.click();

         // Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle, "Passed!!!");



    }


}



/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */