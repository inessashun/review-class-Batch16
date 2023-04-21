package com.syntax.review5;

public class Task7Fibonacci {
    public static void main(String[] args) {
       int a, b, c;
       a=0;
       b=1;
       for(int i=1; i<=10; i++){
           c=a+b;
           System.out.print(a+" ");
           a=b;
           b=c;
       }
        System.out.println();
        System.out.println("******Other way*****");
        int[] arr = new int[10];

        System.out.println("First 10 numbers of Fibonacci series:");

        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = i;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[i] + " ");
        }
    }
}
