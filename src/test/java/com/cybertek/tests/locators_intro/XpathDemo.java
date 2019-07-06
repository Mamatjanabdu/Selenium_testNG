package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("Admiral Kunnka");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("somemail@goomail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
