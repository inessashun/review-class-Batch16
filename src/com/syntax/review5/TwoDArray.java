package com.syntax.review5;
// 2 D Array = Array of Array
// 2 D Array = collection of 1 D Arrays
// 2 D Array = collection of Rows and Columns
public class TwoDArray {
    public static void main(String[] args) {
        String [][] cars= {
                {"Ford", "Lincoln", "Dodge"}, //index 0
                {"BMW", "Audi", "Mercedes", "Fiat", "VW"}, //index 1
                {"Honda", "Toyota", "Subaru", "Nissan"} //index 2
        };
        System.out.println(cars[1][1]); //Audi

        for(String[] garage: cars){     //Nested Loop to print all cars
            for(String car: garage){
                System.out.print(car+" ");
            }
            System.out.println(); //to separate arrays list line
        }
    }
}
