package com.syntax.review5;

public class TwoDArrayMore {
    public static void main(String[] args) {
        int[][] numbers=new int[3][4];

        // 1st Row
        numbers [0][0]=1;
        numbers [0][1]=2;
        numbers [0][2]=3;
        numbers [0][3]=4;

        // 2nd Row
        numbers [1][0]=10;
        numbers [1][1]=20;
        numbers [1][2]=30;
        numbers [1][3]=40;

        // 2nd Row
        numbers [2][0]=100;
        numbers [2][1]=200;
        numbers [2][2]=300;
        numbers [2][3]=400;

        //How to find out how many Rows we have?
        System.out.println(numbers.length);     // 3 Rows
        //How to find out how many Columns we have?
        System.out.println(numbers[0].length);  // 4 Columns



        System.out.println("****Regular Loop****");

        for(int row=0; row<numbers.length; row++){ //Outer loop iterates over the rows
            for(int col=0; col<1; col++) {    //Inner loop iterates over the columns
                System.out.println(numbers[row][col]+" ");

            }
            System.out.println();

        }
        System.out.println("*******");
        //I WANT TO PRINT ONLY ELEMENTS THAT ARE DIVISIBLE BY 3
        for(int row=0; row<numbers.length; row++){  //Outer loop iterates over the rows
            for(int col=0; col<numbers[row].length; col++) {          //Inner loop iterates over the columns

                int num=numbers[row][col];

                if (num%3==0) {
                    System.out.println("This numbers is divisible by 3 : " +num);

                }
            }
            System.out.println();

        }

    }
}
