package com.cybertek.tests.webelement_click_sendkeys_gettext;

/*TEST 002

open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify new url is http://practice.cybertekschool.com/email_sent
*/

import com.cybertek.utilities.VerificationUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SentKeysExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));

        // sendKeys()  --> enters text on the webelement
        emailInput.sendKeys("randomemail@gmail.com");

        Thread.sleep(1000);
        // click --> clicks on webelement
        WebElement retrieveBtn = driver.findElement(By.id("form_submit"));
        retrieveBtn.click();

        String expected = "http://practice.cybertekschool.com/forgot_password";
        String actual = driver.getCurrentUrl();
        VerificationUtils.verifyEquals(expected, actual);

    }

}
