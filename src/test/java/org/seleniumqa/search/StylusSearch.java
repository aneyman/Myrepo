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


public class StylusSearch {

   WebDriver driver = new FirefoxDriver();
   // WebDriver driver = new ChromeDriver();

    //Preconditions
    @BeforeClass
    public void setUp(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("http://stylus.com.ua/");
    }

    @Test
    public void searchTest()  {
        WebElement searchField = driver.findElement(By.id("search_text"));

        //transfer "Selenium" to serch field
        searchField.sendKeys("Sony");

        WebElement searchButton = driver.findElement(By.id("button"));
        searchButton.click();

        //таймаут
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='col1_content']/table[2]/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/h4/a"));

       // Assert.assertEquals(seleniumLink.getText().toString().contains("Sony"),true);
        Assert.assertEquals(seleniumLink.getText().contains("Sony"),true);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
