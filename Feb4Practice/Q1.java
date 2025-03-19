package Feb4Practice;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		
		
		
		int row = 1;
		int spaces = 1;
		int lnst = (n-1)/2; 
		int rnst  = (n-1)/2;
		
		while(row<=n) {
			
			if(row == 1 || row == n) {
				int t = 1;
				while(t<=n) {
					System.out.print('*' + " ");
					t = t + 1;
				}
			}
			
			else{int j = 1;
			while(j<=lnst) {
				System.out.print("*" + " ");
				j = j + 1;
			}
			
			
			int i =1;
			while(i<=spaces) {
				System.out.print("  ");
				i = i + 1;
			}
			
			int k = 1;
			while(k<=rnst) {
				System.out.print("*" + " ");
				k = k + 1;
				
			}
			
			if(row<(n+1)/2) {
				spaces = spaces + 2;
				lnst--;
				rnst--;
				
			}else {
				spaces = spaces - 2;
				lnst++;
				rnst++;
			}}
			row++;
			System.out.println();
			
			
				
			
		}

	}

}
