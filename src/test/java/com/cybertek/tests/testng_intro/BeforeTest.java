package com.cybertek.tests.testng_intro;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("setting path");
        System.out.println("opening browser");
    }

    @Test
    public void test(){

        System.out.println("\ttesting test case 1");

    }

    @Test
    public void test2(){
        System.out.println("\ttesting test case 2");

    }
}
