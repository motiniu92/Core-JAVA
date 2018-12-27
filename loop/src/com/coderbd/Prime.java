/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

import java.math.BigInteger;

/**
 *
 * @author User
 */
public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
        public static boolean isPrime(int num){
        boolean prime = false;
        if (new BigInteger(String.valueOf(num)).isProbablePrime(num)){
        prime = true;
        }
        return prime;
        }
    
}

