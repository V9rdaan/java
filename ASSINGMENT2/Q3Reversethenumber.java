package ASSINGMENT2;

import java.util.Scanner;

public class Q3Reversethenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		int result = 0;
		
		for(int i = 0;number>0;i++) {
			int lastdigit = number %10;
			result = result * 10 + lastdigit;
			
			
			number = number/10;
		}
		System.out.print(result);
		

	}

}
