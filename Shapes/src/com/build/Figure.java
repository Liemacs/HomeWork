package com.build;

public abstract class Figure {
    private int width; //for circle is radius
    private int length;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Figure() {}

    public Figure(int width, String color) {
        this.width = width;
        this.color = color;
    }

    public Figure(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public abstract double perimeter();
    public abstract double area();
}
