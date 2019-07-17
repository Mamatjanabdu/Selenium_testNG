package com.cybertek.tests.synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThreadSleepTest {

    @Test
    public void threadSleepTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");

        driver.findElement(By.tagName("button")).click();

        Thread.sleep(5000);
        WebElement message = driver.findElement(By.id("finish"));
        System.out.println(message.getText());

    }
}
