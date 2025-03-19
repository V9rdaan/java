package Lec718Jan;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int result = 0;
		
		while(n>0) {
			int lastdig = n%10;
			result = result* 10 + lastdig;
			
			n = n/10;
			
		}
		System.out.print(result);
		

	}

}
