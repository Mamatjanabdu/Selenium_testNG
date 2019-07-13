package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VytrackUtils {

    public static void login(WebDriver driver, String username, String password){

        driver.findElement(By.id("prependedInput")).
                sendKeys(username);

        driver.findElement(By.id("prependedInput2")).
                sendKeys(password+ Keys.ENTER);
    }
}
