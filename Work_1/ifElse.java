import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char letter = keyboard.next().charAt(0);
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            System.out.println("Vocala");
        else if (letter == 'b' || letter == 'c' || letter == 'd' || letter == 'f' || letter == 'g' || letter == 'h' || letter == 'j' || letter == 'k' || letter == 'l' || letter == 'm' || letter == 'n' || letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' || letter == 't' || letter == 'v' || letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z')
            System.out.println("Consoana");
        else 
            System.out.println("Nu este litera"); 
    }
}