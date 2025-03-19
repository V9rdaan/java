package Feb16Lec15;
import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int nst = 1;
		int row = 1;
		
		
		while(row<n) {
			
			int i = 1;
			int ncr = 1;
			while(i<=nst) {
				System.out.print(ncr +"\t");
				ncr = (ncr*(row-1))/(i+1);
				i  =i + 1;
				
			}
			nst++;
			row++;
			System.out.println();
		}
		

	}

}
