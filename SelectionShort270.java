/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author User
 */
public class SelectionShort270 {
    public static void main(String[] args) {
       double [] list  = {20, 58, 26, 46, 12, 34, 16};
    for (double x : selectionShort (x)){
        System.out.print(x  + " , "  );
    }
    }
    public static void selectionShort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
           double currentMin = list[i];
           int currentMinIndex = i;
           
            for (int j = i + 1; j < list.length; j++) {
                if(currentMin > list[j]){
                 currentMin = list[j];
                 currentMinIndex = j;
                } 
            }
            if(currentMinIndex != i){
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
            }
        }
        
    }

}
