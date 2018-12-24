
package com.coderbd;

public class HelloWorld12 {
    public static void main(String[] args) {
        System.out.println(addition(15, 10));
        System.out.println(sayHello("Hello", " Programmer"));
        System.out.println(multi(10, 8));
        System.out.println(diveded(50, 5));
    }
    
   public static String sayHello(String msg1, String msg2){
    String message = msg1 + msg2;
    return message;
     }
    
   
   public static int addition (int n1, int n2){
    int rs = n1 +n2;
    return rs;
   }
   
   public static int multi(int n1 , int n2){
   int rs = n1 * n2;
   return rs;
   }
   public static int divided(int n1, int n2){
   int rs = n1 / n2;
   return rs;
   }
}
