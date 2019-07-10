package com.cybertek.tests.dropdows;

import com.cybertek.utilities.VerificationUtils;

public class SomRandomClass {

    static String str1;

    public static void main(String[] args) {

        int integer = 23;

        String str2 = "one";

        str1 = "too";

        str2 = "tree";

        method1();

        method2(str2);

        VerificationUtils.verifyEquals(str1, str2);

    }

    private static void method2(String str2) {
        str2 = "for";
    }


    private static void method1() {
        String insideMethod1 = "insideMethod1";
        System.out.println(insideMethod1);
    }

}
