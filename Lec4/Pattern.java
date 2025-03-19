package Lec4;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Observe the first row
		int nst = 1;
		int nodollar=4;
		int row = 1;
		
		while (row<=5) {
		
			
			int i = 1;
			while(i<=nodollar) {
				System.out.print("$");
				i = i + 1;
				
			}
			
			int j=1;
			while(j<=nst) {
				System.out.print("*");
				j = j + 1;
			}
			
			nst++;
			nodollar--;
			row++;
			System.out.println();
			
			
		
			
		}
		
		
		
		

	}

}
