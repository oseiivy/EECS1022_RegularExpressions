package com.example.testbed.chapter1;

public class Rectangle2 {
    private int width;
    private int height;

    public Rectangle2(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getArea() {
        int result = this.width * this.height;
        return result;
    }

    public int getCircumference() {
        int result = this.width + this.height;
        result = result * 2;
        return result;
    }
}