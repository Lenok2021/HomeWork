package com.cydeo.tests.day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDownsMultiple {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void dropDownsMultiple() {
        //  2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
        // Select all the options from multiple select dropdown.
        WebElement dropDown = driver.findElement(By.xpath("//select[@name = 'Languages']"));

        Select multiple = new Select(dropDown);
        System.out.println("multiple.isMultiple() = " + multiple.isMultiple());

        multiple.selectByIndex(0);
        multiple.selectByIndex(1);
        multiple.selectByIndex(2);
        multiple.selectByIndex(3);
        multiple.selectByIndex(4);
        multiple.selectByIndex(5);

        List<WebElement> list = multiple.getOptions();
       for(WebElement  each : list){
           System.out.println(each.getText());
       }

        }
        
        }
                
                
                
    





/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.


 */