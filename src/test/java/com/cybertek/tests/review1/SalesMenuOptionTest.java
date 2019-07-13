package com.cybertek.tests.review1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalesMenuOptionTest {
    @Test
    public void storeManagerTest() throws InterruptedException {
        // Login as store manager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa3.vytrack.com/");

        driver.findElement(By.id("prependedInput")).
                sendKeys("storemanager75");
        driver.findElement(By.id("prependedInput2")).
                sendKeys("UserUser123"+ Keys.ENTER);
        Thread.sleep(2000);
        String xpath = "//span[@class='title title-level-1' and contains(text(), 'Sales')]";

        Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
    }
}
