package Lec4;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;
		int nst= 5;
		int space = 0;
		int rstar = 4;
		
		
		while(row<=5) {
			
			int i = 1;
			while(i<=space) {
				System.out.print(" ");
				i = i + 1;
			}
			
			int j =1;
			while(j<=nst) {
				System.out.print("*");
				j = j + 1;
			}
			
			int k=1;
			while(k<=rstar) {
				System.out.print("*");
				k = k + 1;
			}
			
				
			
			
			
			
			
			
			
		rstar--;	
		space++;
		nst--;
		row++;
		System.out.println();
		}

	}

	}


