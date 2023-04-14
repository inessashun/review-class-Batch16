package com.syntax.review4;

public class MoreNestedLoops {
    public static void main(String[] args) {

        System.out.println("*****car speed****");
        for(int a=0; a<=9; a++){
            for(int b=0; b<=9; b++){
                for(int c=0; c<=9; c++){
                    System.out.println(a+""+b+""+c);
                }
            }
        }

    }
}
