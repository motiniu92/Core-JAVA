/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepeateAddition;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Page160 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        
        Scanner input = new Scanner(System.in);
        System.out.print(" What is " + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();
        
        while(number1 + number2 != answer){
            System.out.println("Wrong answer. Try again. what is " + number1 + "+" + number2 + "?");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
    
}
