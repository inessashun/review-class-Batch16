package com.syntax.review3;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("****Logical AND**** ");

        boolean loginButtonDisplayed=true;
        boolean loginClickable=true;

        if(loginButtonDisplayed && loginClickable){
            System.out.println("Test passed");   // T=> T => Passed
        }else{
            System.out.println("Test failed");   // T=> F => Failed
        }
        System.out.println("****Logical OR**** ");

        boolean pictureDisplayed=false; //F => T => Passed //T => T => Passed
        String accountName="Syntax!";    //F => F => Failed

        if(pictureDisplayed || accountName.equals("Syntax")){
            System.out.println("Login was sucessful");
        }else{
            System.out.println("User was not able to login");
        }
        System.out.println("****Logical NOT**** ");

        boolean hungry=!true; // ! NOT
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Hello";
        if(!str.equals("Hello")){ //! NOT F => T => Failed
            System.out.println("Value of the string is NOT hello");
        }
        boolean confirmSelected=true;
        if(!confirmSelected){
            System.out.println("Let's click on Confirm checkbox");
        }
        System.out.println("Click on Pay button");

    }
}
