package com.gentel.thread.section1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 工作者线程
 */
public class code1_4 {

    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.init();

        //此处客户端线程为main线程
        helper.submit("Something...");
    }

    static class Helper {
        private final BlockingQueue<String> workQueue = new ArrayBlockingQueue<String>(100);

        private final Thread workerThread = new Thread() {

            @Override
            public void run() {
                String task = null;
                while (true) {
                    try {
                        // 此处等待获取task
                        task = workQueue.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(doProcess(task));
                }
            }
        };

        public void init() {
            workerThread.start();
        }

        protected String doProcess(String task) {
            return task + "-->processed.";
        }

        public void submit(String task) {
            try {
                workQueue.put(task);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
