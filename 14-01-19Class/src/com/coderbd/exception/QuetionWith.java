
package com.coderbd.exception;

import java.util.Scanner;


public class QuetionWith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number2 != 0){
            System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        }
        
    }
}
