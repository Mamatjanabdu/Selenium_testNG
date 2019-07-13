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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void selectMenuOption(WebDriver driver, String tab, String module) throws InterruptedException {
        // click on tab
        String tabXpath = "//span[@class='title title-level-1' and contains(text(), '"+tab+"')]";
        driver.findElement(By.xpath(tabXpath)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // click on module
        String moduleXpath = "//span[@class='title title-level-2' and contains(text(), '"+module+"')]";
        driver.findElement(By.xpath(moduleXpath)).click();
        Thread.sleep(2000);
    }
}
