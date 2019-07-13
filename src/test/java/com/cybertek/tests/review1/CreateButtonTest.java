package com.cybertek.tests.review1;

import com.cybertek.utilities.VerificationUtils;
import com.cybertek.utilities.VytrackUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateButtonTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://qa3.vytrack.com/");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void storeManagerTest() throws InterruptedException {
        VytrackUtils.login(driver, "storemanager51", "UserUser123");
        VytrackUtils.selectMenuOption(driver, "Activities", "Calls");
        String css = "a[title='Log call']";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.cssSelector(css)));

        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        css= "a[title='Create Calendar event']";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.cssSelector(css)));

    }

    @Test
    public void salesManagerTest() throws InterruptedException {
        VytrackUtils.login(driver, "salesmanager123", "UserUser123");
        VytrackUtils.selectMenuOption(driver, "Activities", "Calls");
        String css = "a[title='Log call']";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.cssSelector(css)));

        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        css= "a[title='Create Calendar event']";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.cssSelector(css)));

    }


}
