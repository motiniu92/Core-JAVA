/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int n2 = input.nextInt();
        
        int gcd = 1;
        int k = 2;
        while(k <= n1 && k <= n2){
        if(n1 % k == 0 && n2 % k == 0)
            gcd = k;
        k++;
        
        }
        System.out.println("The greatest common divisor for  " + n1 + " and " + n2 + " is " +gcd);
    }
    
}
