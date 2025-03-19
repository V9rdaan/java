package Feb4Practice;

import java.util.Scanner;

public class Fibonaccipattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		
		int row = 1;
		int star = 1;
		int a = 0;
		int b = 1;
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print(a + " ");
				int c = a + b;
				a = b;
				b = c;
				
				i++;
				
			}
			row++;
			System.out.println();
			star++;
		}
			}
		

	
}
