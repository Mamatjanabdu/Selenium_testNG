package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement name = driver.findElement(By.name("full_name"));
        name.sendKeys("Admiral Kunkka");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("randommail@somemail.com");

        driver.findElement(By.name("wooden_spoon")).click();

        Thread.sleep(1000);
        System.out.println(driver.findElement(By.name("signup_message")).getText());


    }
}
