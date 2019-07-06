package com.cybertek.tests.dropdows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectLists {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select list = new Select(driver.findElement(By.name("Languages")));
        Thread.sleep(1000);
        // in a multi select we can select multiple options
        list.selectByVisibleText("Java");
        list.selectByVisibleText("Python");
        list.selectByVisibleText("Python");
        list.selectByVisibleText("C");

        // getAllSelectedOptions  --> returns all the selected options
        for (WebElement selectedOption : list.getAllSelectedOptions()) {
            System.out.println(selectedOption.getText());
        }

        // deselectByValue  --> unselects selected option
        Thread.sleep(1000);
        list.deselectByVisibleText("Java");


    }
}
