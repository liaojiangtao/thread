package com.gentel.thread.section3;

/**
 * 状态可变的位置信息模型（非线程安全）
 */
public class code3_1 {
    private double x;
    private double y;

    public code3_1(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
