package com.syntax.review2;

public class AnotherNestedIf {
    public static void main(String[] args) {
        /*
        if you have a vaccine or not
            if dose =1-> you need 2nd dose
            if dose =2 -> you are fully vaccinated
            if dose =3 -> you fully vaccinated with booster
         */
        boolean vaccine=true;
        int dose=1;

        if(vaccine){
            if(dose==1){
                System.out.println("you need 2nd dose");
            }else if(dose==2){
                System.out.println("you are fully vaccinated");
            }else if(dose==3){
                System.out.println("you fully vaccinated with booster");
            }
        }
    }
}
