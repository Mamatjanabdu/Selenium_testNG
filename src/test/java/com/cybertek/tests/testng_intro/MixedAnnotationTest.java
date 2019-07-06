package com.cybertek.tests.testng_intro;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MixedAnnotationTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("opening browser");

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("closing browser\n");

    }

    @Test
    public void test2(){
        System.out.println("\ttesting test case 2");

    }

    @Test (priority = 2)
    public void test3(){
        System.out.println("\ttesting test case 3");
    }


    @Test (priority = 1)
    public void test44(){
        System.out.println("\ttesting test case 1");

    }

}
