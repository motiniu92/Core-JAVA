/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author User
 */
public class numberConvertion {
    public static void main(String[] args) {
        String s1 = "Hello Java";
        System.out.println(s1.startsWith("B"));
        
        
        String s2 = "Hello Java";
        String s3 = "Hello C++";
       System.out.println(s1.compareTo(s2));
         boolean ec = s1.equalsIgnoreCase(s2);
         System.out.println("e: " + ec);
         
        
        String str1 = "A";
        String str2 = "a";
        System.out.println(str1.compareTo(str2));
    }
    
}
