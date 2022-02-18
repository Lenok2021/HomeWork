package com.cydeo.tests.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class dropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void close(){
        driver.close();
    }

    @Test
    public void verifyDropDown() {
        driver.get("https://practice.cydeo.com/dropdown ");
        // 3. Select “December 1st, 1923” and verify it is selected.

        Select yearDropDown = new Select(driver.findElement(By.xpath(" //select[@id = 'year']")));
        Select monthDropDown = new Select(driver.findElement(By.xpath(" //select[@id = 'month']")));
        Select dayDropDown = new Select(driver.findElement(By.xpath(" //select[@id = 'day']")));

        yearDropDown.selectByVisibleText("1923"); //  we selected Obj
        monthDropDown.selectByVisibleText("December"); // we selected Obj
        dayDropDown.selectByVisibleText("1"); // we selected Obj

        //and verify it is selected  //  webElement
        if (driver.findElement(By.xpath(" //select[@id = 'year']")).isSelected()) {
            System.out.println("PASSED !!!");


        }else if(driver.findElement(By.xpath(" //select[@id = 'month']")).isSelected()){
            System.out.println("PASSED !!!");
        }else if(driver.findElement(By.xpath(" //select[@id = 'day']")).isSelected()){
            System.out.println("PASSED !!!");
        }

    }
}

/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1923” and verify it is selected.
Select year using  : visible text
Select month using   : value attribute
Select day using : index number

 */