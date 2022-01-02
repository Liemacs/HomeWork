package com.build;

public class Rectangle extends Figure{
    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        super(width, length, "blue");
    }

    @Override
    public double perimeter() {
        return 2 * (getLength()+getWidth());
    }

    @Override
    public double area() {
        return getLength()*getWidth();
    }

    public double diameter() {
        return getWidth() * 2;
    }
}
