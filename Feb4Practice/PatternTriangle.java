package Feb4Practice;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		
		int row = 1;
		int spaces = n-1;
		int nst = 1;
		
		while(row<=n) {
			
			
			int i = 1;
			while(i<= spaces) {
				System.out.print("  ");
				i = i + 1;
			}
			
			int j = 1;
			int count = row;
			while(j<=nst) {
				System.out.print(count + " ");
				if(j<(nst+1)/2) {
					count++;
				}else {
					count--;
				}
				j = j + 1;
				
			}
			
			spaces--;
			nst = nst + 2;
			
			
			row++;
			System.out.println(" ");
		}
		
		

	}

}
