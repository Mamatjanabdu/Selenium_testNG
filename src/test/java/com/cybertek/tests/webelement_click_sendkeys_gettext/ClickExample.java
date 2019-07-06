package com.cybertek.tests.webelement_click_sendkeys_gettext;

import com.cybertek.utilities.VerificationUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
open browser
go to http://practice.cybertekschool.com/forgot_password
click on Retrieve password
verify that url is the same
 */
public class ClickExample {

        public static void main(String[] args) throws InterruptedException {
            // WebDriverManager dependency for automating the driver management in selenium
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            String expectedUrl = "http://practice.cybertekschool.com/forgot_password";
            driver.get(expectedUrl);

            WebElement retrieveBtn = driver.findElement(By.id("form_submit"));
            Thread.sleep(1000);
            retrieveBtn.click();

            String url = driver.getCurrentUrl();

            VerificationUtils.verifyEquals(expectedUrl, url);


        }
}
