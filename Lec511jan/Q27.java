package Lec511jan;

public class Q27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;
		int nst = 1;
		int spaces = 4;
		
		
		
		while(row<=5) {
			
			int i = 1;
			while(i<=spaces) {
				System.out.print("  ");
				i = i + 1;
			}
			
			
			int j = 1;
			int count = 1;
			while(j<=nst) {
				System.out.print(count+ " ");
				if(j<(nst+1)/2) {
					count++;
				}else {
					count--;
				}
				j = j + 1;
			}
			
			
			
			
			
			
			
			
			nst = nst + 2;
			spaces--;
			row++;
			System.out.println();
		}

	}

}
