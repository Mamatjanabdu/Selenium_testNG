package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdDemo {

    public static void main(String[] args) throws InterruptedException {
        id2();
    }

    public static void id2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        // we must use the exact value of the id
        WebElement btn6 = driver.findElement(By.id(" wooden_spoon"));

        Thread.sleep(1000);
        btn6.click();
    }




    public static void id1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");

        WebElement btn6 = driver.                        // represents the browser
            findElement(                                // command to get certain element
                By.id(                                // which locator it should use
                        "wooden_spoon"        // value of the id
                )
        );

        Thread.sleep(1000);
        btn6.click();

    }
}








