package com.cybertek.tests.locators_intro;

import com.cybertek.utilities.VerificationUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*

TEST 003
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify new confirmation message 'Your e-mail's been sent!'


TEST 004

open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
verify that email text is displayed

 */
public class TextVerification {

    public static void main(String[] args) throws InterruptedException {
        test004();
    }

    public static void test004() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));
        String exp = "randomemail@gmail.com";
        emailInput.sendKeys(exp);
        Thread.sleep(1000);

        // getAttribute --> returns the value of the given atrribute of the element
        System.out.println(emailInput.getAttribute("name"));
        System.out.println(emailInput.getAttribute("type"));

        // getAttribute(value) --> use this to get text from input box etc
        String act = emailInput.getAttribute("value");
        System.out.println("act = " + act);
//
        VerificationUtils.verifyEquals(exp, act);

        // getAttribute("innerHTML")  --> if getAttribute(value) does not work, use this ones
        System.out.println(emailInput.getAttribute("innerHTML"));

        //  getAttribute("outerHTML")  --> returns the HTML of given element
        System.out.println(emailInput.getAttribute("outerHTML"));

        // HOW TO DELETE TEXt FROM INPUT FIELD

        emailInput.clear();

    }

    public static void test003() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");

        Thread.sleep(1000);
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("randomemail@gmail.com");

        Thread.sleep(1000);
        WebElement retrieveBtn = driver.findElement(By.id("form_submit"));
        retrieveBtn.click();

        WebElement message = driver.findElement(By.name("confirmation_message"));

        // getText()  returns the text of a webelement
        System.out.println(message.getText());

        String exp = "Your e-mail's been sent!";
        String act = message.getText();
        VerificationUtils.verifyEquals(exp, act);

    }

}
