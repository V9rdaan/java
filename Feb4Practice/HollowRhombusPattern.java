package Feb4Practice;
import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		
		int row = 1;
		int spaces = n-1;
		int spacenst = (n+1)/2;
		int lnst = 1;
		int rnst = 1;
		
		while(row<=n) {
			
			
			int j =1;
			while(j<=spaces) {
				System.out.print("  ");
				j = j + 1;
				
			}
			if(row == n || row == 1) {
			int i =1;
			while(i<=5){
			System.out.print("*" + " ");
				i = i+1;
			}
				
			}
			
			else {
				int k = 1;
				while(k<=lnst) {
					System.out.print("*" + " ");
					k = k + 1;
				
				}
				int l = 1;
				while(l<= spacenst) {
					System.out.print("  ");
					l = l + 1;
				}
				
				int m = 1;
				while(m<=rnst) {
					System.out.print("*" + " ");
					m = m + 1;
				}
			}
			
			spaces--;
			row++;
			System.out.println( );
		}

	}

}
