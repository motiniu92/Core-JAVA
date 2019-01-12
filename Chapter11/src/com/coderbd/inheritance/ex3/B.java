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
public class B extends A {
    
    
    @Override
    public void sayHello(){
        System.out.println("Ghom from B");
    }
    
    public void sayHi(){
    super.sayHello();
        System.out.println("Hi, Motin, I am from B class, sayHi Method");
    }
    
    
}
