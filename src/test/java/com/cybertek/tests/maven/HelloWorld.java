package com.cybertek.tests.maven;


import com.github.javafaker.Faker;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");


        Faker faker = new Faker();

        System.out.println(faker.name().fullName());

        System.out.println(faker.color().name());

        System.out.println(faker.harryPotter().character());

        System.out.println(faker.chuckNorris().fact());

        System.out.println("java");
        
        
        System.out.println("java");
        
        
        System.out.println("java");
        


    }
}
