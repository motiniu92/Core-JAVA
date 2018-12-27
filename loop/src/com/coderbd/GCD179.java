
package com.coderbd;

/**
 *
 * @author User
 */
public class GCD179 {
    
    public static int findOurGcd(int n1, int n2) {
        
       int gcd = 1;
       int possibleGcd = 2;
       
       while(possibleGcd <= n1 && possibleGcd <= n2){
       if(n1 % possibleGcd == 0 && n2 % possibleGcd == 0){
       gcd = possibleGcd;
      
       }
        possibleGcd++;
       }
         return gcd;  
         
    }
}

