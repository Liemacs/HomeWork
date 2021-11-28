import java.util.Scanner;

public class isDoWhile
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    int n = x.nextInt();
	    int sum = 0, i = 0;
	    
	   do {
	        sum += i;
	    } while(i++ < n);
    	
    	System.out.println(sum);
	}
}
