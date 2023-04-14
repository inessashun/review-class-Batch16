package com.syntax.review2;

import java.sql.SQLOutput;

public class IfElse {
    public static void main(String[] args) {

        int age=17;
        if(age>=18) {
            System.out.println("You can get a driver license");
        }else{
            System.out.println("you are too young to drive");
        }
        System.out.println("-------");

        String expected="Best Sellers";
        if(expected.equals("Best Sellers")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Fails");
        }
    }
}
