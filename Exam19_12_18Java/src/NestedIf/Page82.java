/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedIf;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Page82 {
    public static void main(String[] args) {
       int score ;
        Scanner input = new Scanner (System.in);
        score = input.nextInt();
        if (score >= 90.0){
            System.out.println("A");
         }else if(score >= 80.0){
            System.out.println("B");
          }else if(score >= 70.0){
            System.out.println("C");
            }else if(score >= 60.0){
            System.out.println("D");
        }else{
        System.out.println("F");
        }
    }
}
