package com.cybertek.tests.review1;

import com.cybertek.utilities.VerificationUtils;
import com.cybertek.utilities.VytrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SalesMenuOptionTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpTest(){
        // Login as store manager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://qa3.vytrack.com/");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void storeManagerTest() throws InterruptedException {
        VytrackUtils.login(driver, "storemanager51", "UserUser123");
        String xpath = "//span[@class='title title-level-1' and contains(text(), 'Sales')]";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.xpath(xpath)));

    }


    @Test
    public void driverTest(){
        VytrackUtils.login(driver, "user15", "UserUser123");
        String xpath = "//span[@class='title title-level-1' and contains(text(), 'Sales')]";
        Assert.assertFalse(VerificationUtils.isElementDisplayed(driver, By.xpath(xpath)));


    }
}








