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
public class TestSum {
    public static void main(String[] args) {
        float sum = 0;
        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum +=i;
        System.out.println("The sum is " + sum);
    }
}
