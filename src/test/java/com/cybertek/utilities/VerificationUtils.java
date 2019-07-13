package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationUtils {

    public static void verifyEquals(String expected, String actual){
        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }
    }


    public static void verifySelected(WebElement element, boolean checked){
        // if we want to verify element is selected
        if (checked) {
            if (element.isSelected()) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
                System.out.println("Element must be selected");
            }
        }
        // if we want to verify element is not selected
        if (!checked) {
            if (element.isSelected()) {
                System.out.println("FAIL");
                System.out.println("Element must not be selected");
            } else {
                System.out.println("PASS");
            }
        }
    }

    /**
     * return false when 1. element is found and not visible 2. element not found. returns true of element found and displayed
     * @param driver
     * @param by
     * @return
     */
    public static boolean isElementDisplayed(WebDriver driver, By by){
        try {
            return driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
