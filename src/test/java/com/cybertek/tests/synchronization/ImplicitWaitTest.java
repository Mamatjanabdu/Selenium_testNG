package com.cybertek.tests.synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest {

    @Test
    public void implicitWaitTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");

        driver.findElement(By.tagName("button")).click();

        WebElement message = driver.findElement(By.id("finish"));

        System.out.println(message.getText());

        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");


        message = driver.findElement(By.id("finish"));

        System.out.println(message.getText());
    }
}






