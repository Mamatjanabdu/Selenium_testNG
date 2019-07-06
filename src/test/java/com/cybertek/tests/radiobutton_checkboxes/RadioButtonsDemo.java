package com.cybertek.tests.radiobutton_checkboxes;

import com.cybertek.utilities.VerificationUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        // verify blue is selected by default
        // verify red is not selected by default

        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));

        System.out.println("Blue: "+ blue.isSelected());
        System.out.println("Red: " + red.isSelected());

        System.out.println("Selecting red");

        red.click();

        // verify blue is not selected
        VerificationUtils.verifySelected(blue, false);
        // verify red is selected
        VerificationUtils.verifySelected(red, true);

        // see if element is disabled or enabled

        WebElement green = driver.findElement(By.id("green"));

        System.out.println("Is green enabled: " + green.isEnabled());
        System.out.println("Is red enabled: " + red.isEnabled());

        green.click();

        VerificationUtils.verifySelected(green, false);




    }
}

