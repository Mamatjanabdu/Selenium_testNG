package com.cybertek.tests.radiobutton_checkboxes;

import com.cybertek.utilities.VerificationUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class ListOfElementsTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        List<WebElement> buttons = driver.findElements(By.name("sport"));

        System.out.println(buttons.size());

        // verify none selected

        for (WebElement button : buttons) {
            VerificationUtils.verifySelected(button, false);
        }

       switch (""){
           case "a":
       }
        // select any radio button

        Random random = new Random();
        int numver = random.nextInt(4);
        buttons.get(numver).click();

        // verify that only that button is selected and others are not
        for (int i = 0; i < buttons.size(); i++) {
            if (i == numver) {
                VerificationUtils.verifySelected(buttons.get(i), true);
            } else {
                VerificationUtils.verifySelected(buttons.get(i), false);
            }
        }

        // select any other radio button
        int numver2;
        do {
            numver2 = random.nextInt(4);
        } while (numver == numver2);
        System.out.println(numver);
        System.out.println(numver2);

        buttons.get(numver2).click();

        // verify that only that other button is selected and others are not
        for (int i = 0; i < buttons.size(); i++) {
            if (i == numver2) {
                VerificationUtils.verifySelected(buttons.get(i), true);
            } else {
                VerificationUtils.verifySelected(buttons.get(i), false);
            }
        }


        System.out.println(buttons.get(numver2).getText());

    }
}
