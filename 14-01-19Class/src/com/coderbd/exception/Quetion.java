
package com.coderbd.exception;

import java.util.Scanner;


public class Quetion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two intergers: ");
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
    }
}
