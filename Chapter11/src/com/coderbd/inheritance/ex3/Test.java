/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.inheritance.ex3;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B();
        A b2 = new B();
        
        
        ////call methods////
      a.sayHello();
      b1.sayHello();
      b2.sayHello();
      b1.sayHi();
        
        
        
    }
}
