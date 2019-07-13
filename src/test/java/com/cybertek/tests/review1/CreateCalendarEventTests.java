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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateCalendarEventTests {

    WebDriver driver;

    @BeforeMethod
    public void setUpTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://qa3.vytrack.com/");
        VytrackUtils.login(driver, "salesmanager123", "UserUser123");
        VytrackUtils.selectMenuOption(driver, "Activities", "Calendar Events");
        driver.findElement(By.cssSelector("a[title='Create Calendar event']")).click();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void saveAndCancelOptionsTest() throws InterruptedException {
        String cancelCss = "a[title='Cancel']";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.cssSelector(cancelCss)));
        String saveAndCloseBtn = "(//div[contains(@class, 'btn-group pull-right')]//button)[1]";
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.xpath(saveAndCloseBtn)));

        driver.findElement(By.className("caret")).click();
        Thread.sleep(1000);

        String saveCloseOption = "(//div[contains(@class, 'btn-group pull-right')]//button)[2]";
        String saveNewOption = "(//div[contains(@class, 'btn-group pull-right')]//button)[3]";
        String saveOption = "(//div[contains(@class, 'btn-group pull-right')]//button)[4]";

        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.xpath(saveCloseOption)));
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.xpath(saveNewOption)));
        Assert.assertTrue(VerificationUtils.isElementDisplayed(driver, By.xpath(saveOption)));

        driver.findElement(By.className("caret")).click();
        Assert.assertFalse(VerificationUtils.isElementDisplayed(driver, By.xpath(saveCloseOption)));

    }


    @Test
    public void defaultOptions(){
        String expected = driver.findElement(By.cssSelector("#user-menu>a")).getText().trim();
        String actual = driver.findElement(By.className("select2-chosen")).getText().trim();
        Assert.assertEquals(actual, expected);

        String actualTitle= driver.findElement(By.cssSelector("[data-ftid='oro_calendar_event_form_title']"))
                                                .getAttribute("value");

        Assert.assertEquals(actualTitle, "");

// LocalDateTime class that gives you date and time
        LocalDateTime localDateTime = LocalDateTime.now();

        String date = localDateTime.format(DateTimeFormatter.ofPattern("MMM d, yyyy"));
        String time = localDateTime.format(DateTimeFormatter.ofPattern("hh:mm a"));

        String actualDate = driver.findElement(By.cssSelector("input[id*='date_selector_oro_calendar_event_form_start']")).
                getAttribute("value");
        String actualTime = driver.findElement(By.cssSelector("input[id*='time_selector_oro_calendar_event_form_start']")).
                getAttribute("value");

        Assert.assertEquals(actualDate, date);
        Assert.assertEquals(actualTime, time);
    }



}
