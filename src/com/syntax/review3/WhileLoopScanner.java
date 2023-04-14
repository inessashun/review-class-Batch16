package com.syntax.review3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int  sum=0;
        System.out.println("Enter numbers 1 by 1");

        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            sum += num; //sum+num
        }

    }
}
