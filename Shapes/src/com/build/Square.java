package com.build;

public class Square extends Figure{

    public Square(int width, int length) {
        super(width, length, "red");
    }

    public Square() {
        super();
    }

    @Override
    public double perimeter() {
        return getLength()*4;
    }

    @Override
    public double area() {
        return getLength()*getWidth();
    }
}
