package ASSINGMENT2;

import java.util.Scanner;

public class Q2 {
	
	public static int Digitoccurences(int number,int digit) {
		int count = 0;
		
		while(number>0) {
			int lastdigit = number%10;
			
			if(lastdigit == digit) {
				count++;
			}
			
			number = number/10;
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int digit = s.nextInt();
		
		 int result = Digitoccurences(number,digit);
		 
		 System.out.print(result);
		
		
		
		

	}

}
