package org.seleniumqa.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class GoogleSearchTest {

    WebDriver driver = new FirefoxDriver();

    //Preconditions
    @BeforeClass
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://www.google.com.ua/");
    }

    @Test
    public void searchTest(){
        WebElement searchField = driver.findElement(By.id("lst-ib"));

        //transfer "Selenium" to serch field
        searchField.sendKeys("Selenium");
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a"));

        Assert.assertEquals(seleniumLink.getText().toString().contains("Selenium"),true);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
