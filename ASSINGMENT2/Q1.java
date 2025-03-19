76package ASSINGMENT2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int even = 0;
		int odd = 0;
		
		for(int i=1;n>0;i++) {
			int digit = n%10;
			
			if(i%2==0) {
				even = even + digit;
			
			}else {
				odd = odd + digit;
				
			}
			n = n/10;
		}
		System.out.println(even);
		System.out.print(odd);
		

	}

}
