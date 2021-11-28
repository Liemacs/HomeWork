import java.util.Scanner;

public class isWhile
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    int n = x.nextInt();
	    int sum = 0, i = 0;
	    
	    while(i++ < n){
	        sum += i;
	    }
    	
    	System.out.println(sum);
	}
}
