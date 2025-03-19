package Lec612Jan;

import java.util.Scanner;

public class LCMusingGcdway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s = new Scanner(System.in);
		
		int divisor = s.nextInt();
		int dividend = s.nextInt();
		
		int product = divisor*dividend;
		
		
		while(dividend%divisor != 0) {
			int rem = dividend % divisor;
			dividend= divisor;
			divisor = rem;
			
		}
		int lcm = product / divisor;
		System.out.print(lcm);
		
		
		
		
		

	}

}
