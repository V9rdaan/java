package Lec4;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;
		int nst = 5;
		int space = 0;
		
		
		while(row<=5) {
			
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j= j + 1;
			}
			
			
			
			int i = 1;
			while(i<=nst) {
				System.out.print("*");
				i = i + 1;
			}
			
			
			
			
		space++;	
		nst--;	
		row++;
		System.out.println();
		}

	}

}
