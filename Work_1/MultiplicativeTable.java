import java.util.Scanner;

public class MultiplicativeTable
{
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    int n = x.nextInt();
	    int[] array = new int[10];
	    
	    for(int i = 0; i < 10; i++){
	        array[i] = n * i;
	        System.out.println(array[i]);
	    }
	    
    	
	}
}