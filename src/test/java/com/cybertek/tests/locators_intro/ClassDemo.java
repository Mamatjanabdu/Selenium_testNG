package com.cybertek.tests.locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {

    public static void main(String[] args) {
        class2();
    }

    public static void class2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        // try to click on an element which has a space separated classes
        System.out.println(driver.findElement(By.className("btn btn-primary")).getText());


    }

    public static void class1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/sign_up");
        // print sub title
        System.out.println(driver.findElement(By.className("subheader")).getText());
        // click on the home link
        driver.findElement(By.className("nav-link")).click();

    }

}
