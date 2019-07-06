package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement element = driver.findElement(By.tagName("h2"));
        System.out.println(element.getText());

        driver.findElement(By.tagName("input")).sendKeys("Admiral Kunnka");

        driver.findElement(By.name("email")).sendKeys("his@mail.com");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(1000);
        // click on the home link on top of the page
        driver.findElement(By.tagName("a")).click();


    }
}
