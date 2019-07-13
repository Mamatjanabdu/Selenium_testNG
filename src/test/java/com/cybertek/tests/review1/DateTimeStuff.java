package com.cybertek.tests.review1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeStuff {

    public static void main(String[] args) {
        // LocalDateTime class that gives you date and time
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);
        // DateTimeFormatter --> use to format the display of date, time
        String date = localDateTime.format(DateTimeFormatter.ofPattern("mm-dd-yyyy"));
        System.out.println(date);
         date = localDateTime.format(DateTimeFormatter.ofPattern("MMM d, yyyy"));
        // Jul 13, 2019

        System.out.println(date);


        String time = localDateTime.format(DateTimeFormatter.ofPattern("hh:mm a"));
        System.out.println(time);
    }
}
