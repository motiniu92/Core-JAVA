
package com.coderbd.threadDemo;


public class MyRunnable implements Runnable{

    @Override
    public void run() {
        
        int sum =0;
        for (int i = 0; i <= 10; i++) {
            sum +=i;
        }
        System.out.println("Sum : "+sum);
            
                
    }
     
    
}
