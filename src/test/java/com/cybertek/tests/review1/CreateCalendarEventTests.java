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

public class CreateCalendarEventTests {

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
    public void saveAndCancelOptionsTest() throws InterruptedException {
        VytrackUtils.login(driver, "salesmanager123", "UserUser123");
        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        driver.findElement(By.cssSelector("a[title='Create Calendar event']")).click();
        Thread.sleep(2000);
        String cancelCss = "a[title='Cancel']";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.cssSelector(cancelCss)));
        String saveAndCloseBtn = "(//div[@class='btn-group pull-right open']//button)[1]";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.xpath(saveAndCloseBtn)));



    }


}
