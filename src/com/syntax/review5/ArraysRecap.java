package com.syntax.review5;

public class ArraysRecap {
    public static void main(String[] args) {
        String[]languages={"Engl", "Russ", "Turk", "Fren", "Span"};
        for(String language: languages){
            System.out.println(language+" ");
        }
        //I want to print elements in reverse order
        for(int i=languages.length-1; i>=0; i--){
            System.out.println(languages[i]+" ");
        }
    }

}
