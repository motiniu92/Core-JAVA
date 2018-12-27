
package com.coderbd;

/**
 *
 * @author User
 */
public class CheckingPalindom {
    public static void main(String[] args) {
        System.out.println(isPalindom("moam"));
    }
        public static boolean isPalindom(String s){
        boolean palindom = false;
        if(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())){
         palindom = true;
        }
        return palindom;
        }
        
    }



