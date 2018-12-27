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
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        String hex = "";
        while(decimal != 0){
        int hexValue = decimal % 16;
        char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
        hex = hexDigit + hex;
        decimal = decimal / 16;
        
        }
        System.out.println("The hex number is " + hex);
                
    }
    
}
