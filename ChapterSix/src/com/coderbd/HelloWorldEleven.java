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
public class HelloWorldEleven {
    public static void main(String[] args) {
        System.out.println(sayHi("Hello", "World"));
        System.out.println(sayHi("10", "6"));
        System.out.println(sayHi(1, 3 ));
    }
    
    public static String sayHi(String s1, String s2){
    String msg = s1 + s2;
    return msg;
     }
    
    public static String sayHi(int n1, int n2){
    String msg = String.valueOf(1) + String.valueOf(n2);
    return msg;
     }
    
    public static long sayHi(long n1, long n2){
    long rs = n1 + n2;
    return rs;
     }
}
