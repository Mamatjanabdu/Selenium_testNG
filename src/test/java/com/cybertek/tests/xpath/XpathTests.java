package com.cybertek.tests.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathTests {

    @Test
    public void absoluteXpath(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String expectedUrl = "http://practice.cybertekschool.com/signup_confirmation";
        driver.get(expectedUrl);
        System.out.println("Printing the first link");

        System.out.println(
                driver.findElement(By.xpath("/html/body/nav/ul/li/a")).getText()
                                                                                );
        System.out.println("Printing the second link");

        System.out.println(
                driver.findElement(By.xpath("/html/body/div/div/div/div/a/i")).getText()
                                                                                        );
    }



    @Test
    public void relativeXPathUsingParentChild(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String expectedUrl = "http://practice.cybertekschool.com/signup_confirmation";
        driver.get(expectedUrl);
        System.out.println("Printing the first link");

        System.out.println(driver.findElement(By.xpath("//body/nav/ul/li/a")).getText());

        System.out.println("Printing the first link again");

        System.out.println(driver.findElement(By.xpath("//body/nav//a")).getText());


    }


    @Test
    public void relativeXpathUsingAttributeValue(){
        // A CERTAIN TAG WITH ATTRI VALUE COMBO
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        System.out.println("click on button: Don't click");
        driver.findElement(By.xpath("//button[@id='disappearing_button']")).click();


        // ANY TAG WITH ATTRI VALUE COMBO
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id='disappearing_button']")).click();

        // CONTAINS CERTAIN STRING IN VALUE OF SOME ATTRIBUTE
        System.out.println(driver.findElement(By.xpath("//button[contains(@id, 'button_')]")).getText());



    }
}
