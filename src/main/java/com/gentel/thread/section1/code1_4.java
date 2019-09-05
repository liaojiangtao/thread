package com.gentel.thread.section1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

/**
 * 工作者线程
 */
public class code1_4 {

    public static void main(String[] args) {

    }

    static class Helper{
        private final BlockingDeque<String> workQueue = new ArrayBlockingQueue<String>(100);

    }
}
