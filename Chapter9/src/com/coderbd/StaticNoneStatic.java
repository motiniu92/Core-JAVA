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
public class StaticNoneStatic {
    int x = 10;
   static int y = 20;
    public static void main(String[] args) {
      StaticNoneStatic obj1 = new StaticNoneStatic();
        System.out.println("x: " + obj1.x);
        System.out.println("y: + y");
    }
}
