package com.build;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int width;
        int length;
        Square square;
        Rectangle rectangle;
        Circle circle;
        Figure[] Obj = new Figure[3];
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < 3; i++){
            System.out.println("Width and Length");
            width = scanner.nextInt();
            length = scanner.nextInt();
            switch (i){
                case 0: square = new Square(width, length);Obj[i] = square; break;
                case 1: rectangle = new Rectangle(width, length);Obj[i] = rectangle; break;
                case 2: circle = new Circle(width);Obj[i] = circle; break;
            }
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Perimeter: " + Obj[i].perimeter());
            System.out.println("Area: " + Obj[i].area());
            System.out.println("Color: " + Obj[i].getColor());
            System.out.println("------------------------------------------");
        }
    }
}
