package Feb4Practice;

import java.util.Scanner;

public class MirrorStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		
		int row = 1;
		int nst = 1;
		int spaces = (n-1)/2;
		
		while(row<=n) {
			
			int i = 1;
			while(i<=spaces) {
				System.out.print("   ");
				i = i + 1;
				
				
			}
			
			int j = 1;
			while(j<=nst) {
				System.out.print("*" + "  ");
				j = j + 1;
				
			}
			if(row<(n+1)/2) {
				nst = nst + 2;
				spaces--;
			}else {
				nst = nst - 2;
				spaces++;
			}
			
			row++;
			System.out.println( );
		}
		
		

	}

}
