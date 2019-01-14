
package com.coderbd.exception;


public class Exception {
    public static void main(String[] args) {
        System.out.println("1111111111111111111");
      try{
            System.out.println(10 / 10);   
            System.out.println(Integer.parseInt("TEN"));
        }catch(ArithmaticException  | NumberFormatException e){
          System.out.println("111111111111");
        }
    }
}
