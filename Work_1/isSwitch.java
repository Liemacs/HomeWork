import java.util.Scanner;

public class isSwitch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char letter = keyboard.next().charAt(0);
        switch(letter){
            case 'a': System.out.println("Vocala"); break;
            case 'e': System.out.println("Vocala"); break;
            case 'i': System.out.println("Vocala"); break;
            case 'o': System.out.println("Vocala"); break;
            case 'u': System.out.println("Vocala"); break;
            case 'b': System.out.println("Consoana"); break;
            case 'c': System.out.println("Consoana"); break;
            case 'd': System.out.println("Consoana"); break;
            case 'f': System.out.println("Consoana"); break;
            case 'g': System.out.println("Consoana"); break;
            case 'h': System.out.println("Consoana"); break;
            case 'j': System.out.println("Consoana"); break;
            case 'k': System.out.println("Consoana"); break;
            case 'l': System.out.println("Consoana"); break;
            case 'm': System.out.println("Consoana"); break;
            case 'n': System.out.println("Consoana"); break;
            case 'p': System.out.println("Consoana"); break;
            case 'q': System.out.println("Consoana"); break;
            case 'r': System.out.println("Consoana"); break;
            case 's': System.out.println("Consoana"); break;
            case 't': System.out.println("Consoana"); break;
            case 'w': System.out.println("Consoana"); break;
            case 'x': System.out.println("Consoana"); break;
            case 'y': System.out.println("Consoana"); break;
            case 'z': System.out.println("Consoana"); break;
            default: System.out.println("Nu este litera"); 
        }
    }
}