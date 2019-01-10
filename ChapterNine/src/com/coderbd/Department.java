
package com.coderbd;

/**
 *
 * @author User
 */
public class Department {
    private int id;
    private String depName;
    
    public Department(){
    
    }
    
    public Department(int id, String depName){
    this.id = id;
    this.depName = depName;
    }
    
    public int getId(){
    return id;
    }
}
