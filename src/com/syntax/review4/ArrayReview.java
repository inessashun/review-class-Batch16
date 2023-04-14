package com.syntax.review4;

public class ArrayReview {
    public static void main(String[] args) {
        int a=10;
        int [] arr=new int[3];
        //we store elements based on indexes
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;
        //arr[3]=12; ERROR => [3] => ArrayIndexOutOfBoundsException

        //access also by indexes
        System.out.println(arr[1]);

        System.out.println("****Regular for loop****");

        String[] planets={"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};

        for(int i=0; i<planets.length; i++){

            System.out.print(planets[i]+" ");
        }

        System.out.println("****Enhanced for loop****");

        String[] planets2={"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};
        //Enhanced For Loop is used ONLY with arrays and collections
        for(String planet:planets2){
            System.out.println(planet);

        }

    }
}
