
package com.coderbd.inheritance;


public class A {
    int id;
    String name;
    byte color;

    public A() {
    }

    
    public A(int id) {
        this.id = id;
    }

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public A(int id, byte color) {
        this.id = id;
        this.color = color;
    }

    public A(String name) {
        this.name = name;
    }

    public A(String name, byte color) {
        this.name = name;
        this.color = color;
    }

    public A(byte color) {
        this.color = color;
    }

    public A(int id, String name, byte color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    
    public void sayHello(){
       
    
    }
    
}
