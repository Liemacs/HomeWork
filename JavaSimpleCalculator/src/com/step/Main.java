package com.step;

import com.step.Calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Calculator Operation = new Calculator();
        System.out.println("Valoare pentru a:");
        int a = x.nextInt();
        System.out.println("Valoare pentru b:");
        int b = x.nextInt();
        System.out.println(a + " + " + b + " = " + Operation.sum(a,b));
        System.out.println(a + " - " + b + " = " + Operation.difference(a,b));
        System.out.println(a + " * " + b + " = " + Operation.multiplying(a,b));
        System.out.println(a + " / " + b + " = " + Operation.division(a,b));
    }
}
