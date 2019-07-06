package com.cybertek.tests.testng_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AssertEqualsTest {

    @Test
    public void test(){
        String expected = "Google";
        String actual = "Google";
        System.out.println("first assertion");
        Assert.assertEquals(1, 1);
        System.out.println("second assertion");
        Assert.assertEquals(actual, expected);
        System.out.println("done");
    }

    @Test
    public void test2(){
        String expected = "Google";
        String actual = "Google";
        System.out.println("first assertion");
        Assert.assertEquals(1, 12);
        System.out.println("second assertion");
        Assert.assertEquals(actual, expected);
        System.out.println("done");
        System.out.println("first assertion");
        Assert.assertEquals(1, 12);
        System.out.println("second assertion");
        Assert.assertEquals(actual, expected);
        System.out.println("done");
        System.out.println("first assertion");
        Assert.assertEquals(1, 12);
        System.out.println("second assertion");
        Assert.assertEquals(actual, expected);
        System.out.println("done");

    }

    @AfterMethod
    public void tearDown(){
        System.out.println("reporting");

    }

}
