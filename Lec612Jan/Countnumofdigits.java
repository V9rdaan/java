package Lec612Jan;
import java.util.Scanner;
public class Countnumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s  = new Scanner(System.in);
		int n = 123456;
		int count = 0;
		
		while(n>0) {
			
			n = n/10;
			count++;
			
		}
		System.out.println(count);

	}

}
