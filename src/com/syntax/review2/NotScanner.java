package com.syntax.review2;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {
        int i=10;
        //1. need to create Scanner
        Scanner key=new Scanner(System.in);

        /*System.out.println("Please enter full sentence");
        String sentence=key.nextLine(); //.nextLine for 2 words and more
        System.out.println("You typed "+sentence);
        */
        System.out.println("Please enter 1 word");
        //2. use command to grab value
        String word=key.next();
        System.out.println("Word that was captured "+word); //apple

        System.out.println("Please enter integer value");
        int number=key.nextInt();
        System.out.println("Entered number "+number); //integer 12

        System.out.println("Please enter decimal value");
        double decimal=key.nextDouble();
        System.out.println("Decimal value = "+decimal); //decimal 12.0


    }
}
