package com.syntax.review3;

public class SwitchStatement {
    public static void main(String[] args) {

        String color="green"; //GReen,grEEn => converted to green
        switch(color){   //(color.toLowerCase())
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yeld");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color");
        }
    }
}
