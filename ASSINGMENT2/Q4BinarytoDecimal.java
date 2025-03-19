package ASSINGMENT2;

import java.util.Scanner;

public class Q4BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		int ans = 0;
		int placevalue = 1;
		
		for(int i=0;number>0;i++) {
			int lastdigit = number%10;
			 ans = ans + lastdigit * placevalue;
			placevalue = placevalue * 2;
			 number = number/10;
			
		}
		System.out.print(ans);

	}

}
