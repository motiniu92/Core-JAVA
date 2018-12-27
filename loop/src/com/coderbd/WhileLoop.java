/*
 
 */
package com.coderbd;

/**
 *
 * @author User
 */
public class WhileLoop {
    public static void workWithSentinelvalue(int num1, int num2) {
            int sum = 0;
        int n1 = 0;
        while(true){
            System.out.println("Enter First Numgber" + n1+ "Time");
            
          if(num1 !=-1 ){
                sum +=0;
                System.out.println("sum:"+ sum);
                n1++;
         
          }else{
               break;
          }
         
            
        }
    }
    
    public static void printFirstNumToSecondNum(int num1, int num2) {
        while(num1 <= num2){
        num1++;
        }
        
    }
    
    public  static int makeSumFromFirstNumToSecondNum(int num1, int num2){
        int sum = 0;
    while(num1 <=num2){
        sum += num1;
        num1++;
      }
    return sum;
    
    }

    static void findOurGcd(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
