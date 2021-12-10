package com.build;

public class CharArray {
    public void CharPar(char arr[]) {
        for(char value: arr) {
            if(value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u')
                System.out.println(value + " -> Vocala");
            else if (value == 'b' || value == 'c' || value == 'd' || value == 'f' || value == 'g' || value == 'h' || value == 'j' || value == 'k' || value == 'l' || value == 'm' || value == 'n' || value == 'p' || value == 'q' || value == 'r' || value == 's' || value == 't' || value == 'v' || value == 'w' || value == 'x' || value == 'y' || value == 'z')
                System.out.println(value + " -> Consoana");
            else
                System.out.println(value + " -> Nu este litera");
        }
    }
}
