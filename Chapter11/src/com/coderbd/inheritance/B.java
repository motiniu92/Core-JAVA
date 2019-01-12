
package com.coderbd.inheritance;

/**
 *
 * @author User
 */
public class B extends A{
    double salary;

    public B() {
    }

    public B(double salary) {
        this.salary = salary;
    }

    
    
    public B(int id, String name, byte color) {
        super(id, name, color);
    }
    
    
    
    
    
}
