package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        driver.findElement(By.partialLinkText("Auto")).click();
        driver.findElement(By.partialLinkText("ome")).click();

        // it will click on the first link that has the word dynamic in it
        driver.findElement(By.partialLinkText("Dynamic")).click();

    }
}
