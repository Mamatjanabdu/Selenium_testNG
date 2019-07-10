package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAssignments {
    public static void main(String[] args) {
//        ebayTest();
//        amazonTest();
        wikiTest();
    }

    private static void wikiTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://wikipedia.org");
        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.linkText("Selenium (software)")).click();

        String exp = "Selenium_(software)";
        String actu = driver.getCurrentUrl();
        if (actu.endsWith(exp)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actu = " + actu);
            System.out.println("exp = " + exp);
        }
        driver.quit();
    }

    private static void amazonTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        String searchTerm = "wooden spoon";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
        driver.findElement(By.className("nav-input")).click();

        String actual = driver.getTitle();

        if (actual.contains(searchTerm)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("searchTerm = " + searchTerm);
        }
        driver.quit();

    }


    private static void ebayTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        driver.findElement(By.id("gh-ac")).sendKeys("android charger" + Keys.ENTER);
        driver.findElement(By.id("gh-btn")).click();
        System.out.println(driver.findElement(By.tagName("h1")).getText());
        driver.quit();
    }
}
