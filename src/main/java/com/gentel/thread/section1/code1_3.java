package com.gentel.thread.section1;

public class code1_3 {
    public static void main(String[] args) {
        Thread thread = new CustomThread();
        thread.start();
    }

    static class CustomThread extends Thread{
        @Override
        public void run() {
            System.out.println("Running...");
        }
    }
}
