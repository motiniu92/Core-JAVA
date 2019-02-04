package com.coderbd.threadDemo;

public class PrintChar implements Runnable {

    private char charToprint;
    private int times;

    public PrintChar(char c, int t) {
         charToprint = c;
        times = t;
    }


    public void run(){
        for (int i = 0; i < times; i++) {
            System.out.println(charToprint);
        }
    }

}
