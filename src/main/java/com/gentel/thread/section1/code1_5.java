package com.gentel.thread.section1;

/**
 * 非线程安全的计数器
 */
public class code1_5 {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }
}
