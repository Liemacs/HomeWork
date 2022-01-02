package com.build;

public class Circle extends Figure {
    public Circle() {
    }

    public Circle(int width) {
        super(width, "yellow");
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * getWidth();
    }

    @Override
    public double area() {
        return getWidth() * 3.14;
    }

    public double diameter() {
        return getWidth() * 2;
    }
}
