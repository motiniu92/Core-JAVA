/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class TwoDimentional {
    public static void main(String[] args) {
        int  [][] arr2D = {
            {2, 4, 6, 8, 3, 15, 6},
            {1, 5, 3, 9,12, 65}
            
        }; 
        
        for (int [] oneD: arr2D) {
            Arrays.sort(oneD);
             for (int i : oneD){
                 System.out.print(i + " ,");
            }
             System.out.println();
           }
         } 
        } 
           