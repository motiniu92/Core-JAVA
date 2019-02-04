
package com.coderbd.threadDemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestMyRunnable implements Runnable{

    @Override
    public void run() {
       // int sum =0;
       // for (int i = 0; i <= 10; i++) {
          //  sum +=i;
        //}
        //System.out.println("Sum : "+sum);
 //   try{
   // Thread.sleep(5000);
   //}catch(InterruptedException ex){
     //   Logger.getLogger(com.coderbd.threadDemo.MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
  //  }
        //System.out.println("Sum : " +sum);
    }
    
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
    
}
