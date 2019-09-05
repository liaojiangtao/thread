package com.gentel.thread.section1;

/**
 * 线程安全的计数器
 */
public class code1_6 {
    private int count = 0;

    public int getCount() {
        synchronized (this){
            return count;
        }
    }

    public void increment() {
        synchronized (this){
            count++;
        }
    }
}
