import java.util.Scanner;

public class IteratingInts
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    int n = x.nextInt();
	    
	    for(int i = 0; i < n; i++) {
	        for(int y = 0; y < i + 1; y++){
	            System.out.print(i + 1);
	        }
	        System.out.print('\n');
	    }
	}
}