package com.coderbd.pool;

public class WorkerThread implements Runnable {

    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processmessage();
        System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name  

    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
