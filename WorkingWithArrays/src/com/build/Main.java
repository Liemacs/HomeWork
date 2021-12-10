package com.build;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int n = 10;
        int[] arr = new int[n];
        System.out.print("Declara " + n + " cifre pentru i -> ");
        for(int i = 0; i < n; i++){
            arr[i] = scaner.nextInt();
        }

        SumArray sumArray = new SumArray();
        System.out.println("Suma este: " + sumArray.Sum(arr));

        ReversArray revers = new ReversArray();
        revers.Revers(arr);
        System.out.println();

        ArrayMax maxmin = new ArrayMax();
        System.out.println(maxmin.max(arr));
        System.out.println(maxmin.min(arr));

        char[] arrChar = new char[n];
        System.out.print("Declara " + n + " char pentru i -> ");
        for(int i = 0; i < n; i++){
            arrChar[i] = scaner.nextLine().charAt(0);
        }

        CharArray charArray = new CharArray();
        charArray.CharPar(arrChar);
    }
}
