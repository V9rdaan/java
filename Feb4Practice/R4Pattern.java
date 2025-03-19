package Feb4Practice;

import java.util.Scanner;

public class R4Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int row = 1;
		int nst = 1;
		
		
		while(row<=n) {
			
			int i  = 1;
			while(i<=nst) {
				System.out.print("*" + "");
				i = i + 1;
				
			}
			nst++;
			row++;
			System.out.println(  );
		}
		
		
			}

}
