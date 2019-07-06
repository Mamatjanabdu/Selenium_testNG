package com.cybertek.tests.testng_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueTest {

    @Test
    public void test(){

        System.out.println(1==2);

        String url = "https://google.rcom";
        String expStr = ".com";

        Assert.assertTrue(1==1);

        Assert.assertTrue(url.endsWith(expStr));

        Assert.assertTrue(true);

    }

//    @Test
    public void test2(){
        // verify url does not end with .com
        String url = "https://google.com";
        String expStr = ".com";
        // expedted condition is false
        // if the result is false, it will pass
        Assert.assertFalse(url.endsWith(expStr));

//        Assert.assertFalse(true);
    }
}
