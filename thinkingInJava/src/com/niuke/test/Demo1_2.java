package com.niuke.test;

class MyThread extends Thread {
    
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized(this) {
            try {  
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(100); // ����100ms
                    System.out.println(Thread.currentThread().getName() + " loop " + i);  
                }
            } catch (InterruptedException ie) {  
            }
        }  
    }
}

public class Demo1_2 {

    public static void main(String[] args) {  
        Thread t1 = new MyThread("t1");  // �½����߳�t1��
        Thread t2 = new MyThread("t2");  // �½����߳�t2��
        t1.start();                          // �������߳�t1��
        t2.start();                          // �������߳�t2�� 
    } 
}
