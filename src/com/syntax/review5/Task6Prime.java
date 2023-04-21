package com.syntax.review5;

public class Task6Prime {
    public static void main(String[] args) {
        /*
        6. Write a java program to check whether a given
number is prime or not?
conditions: 1. number should be >1
            2. number should be divisible by itself only
            Example: 3(2), 4(2,3), 5(2,3,4), 6(2,3,4,5)
         */

        int num=11;
        boolean isPrime=true;

        if(num>1){
            for(int i=2; i<num; i++){
                if(num%i==0){
                    isPrime=false;
                    break;

                }
            }
        }else{
            isPrime=false;
        }
        if(isPrime){
            System.out.println(num+ " is a prime number");
        }else{
            System.out.println(num+ "is a not prime number");
        }
    }
}
