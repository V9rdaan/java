package ASSINGMENT2;

import java.util.Scanner;

public class Q5LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		
		for(int i = N1; i <=N1*N2 ; i = i + N1) {
			if(i%N2==0) {
				System.out.print(i);
				break;
			}
		}

	}

}
