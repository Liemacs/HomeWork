package step.exe;

public class App {

    public static void main(String[] args) {
        NumbersComparator compare = new NumbersComparator();
        int x[] = {1, 7, 9, 2, -15, 3, 6};

        System.out.println("max Value from x[] is: " + compare.max(x));
        System.out.println("min Value from x[] is: " + compare.min(x));
    }
}
