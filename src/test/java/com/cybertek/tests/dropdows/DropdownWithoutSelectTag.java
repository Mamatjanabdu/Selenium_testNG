package com.cybertek.tests.dropdows;

import com.cybertek.utilities.VerificationUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DropdownWithoutSelectTag {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownLink = driver.findElement(By.partialLinkText("Dropdown link"));
        System.out.println(dropdownLink.getText());
        dropdownLink.click();
        Thread.sleep(500);

        List<WebElement> allOptions = driver.findElements(By.className("dropdown-item"));
        System.out.println(allOptions.size());
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }

//        allOptions.get(0).click();
        WebElement yahoo = driver.findElement(By.linkText("Yahoo"));
        yahoo.click();
        VerificationUtils.verifyEquals("Yahoo", driver.getTitle());

    }
}
