package com.cybertek.tests.dropdows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select dropdownList = new Select(selectElement);

        // READ THE SELECTED OPTION
        // getFirstSelectedOption --> returns the selected option
        WebElement selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());

        // GET ALL AVAILABLE OPTIONS
        // getOptions  --> returns all avaiable options
        List<WebElement> allOptions = dropdownList.getOptions();
        System.out.println("Number of options: " + allOptions.size());

        for (WebElement option : allOptions) {
//            System.out.println(option.getText());
        }
        Thread.sleep(2000);
        // HOW TO SELECT USING VISIBLE TEXT
        dropdownList.selectByVisibleText("Option 1");
        selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        Thread.sleep(500);
        dropdownList.selectByVisibleText("Option 2");
        selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());

        // HOW TO SELECT USING INDEX
        // index starts from 0
        Thread.sleep(500);
        dropdownList.selectByIndex(1);
        selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());

         // HOW TO SELECT USING THE VALUE ATTRIBUTE
        // <option value="2">Option 2</option>
        dropdownList.selectByValue("2");

        selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
    }
}
