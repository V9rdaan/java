package Lec4;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int row = 1;
		int nst=1;
		int space = 4;
		
		
		
		while(row<=9) {
			
			int j =1;
			while (j<=space) {
				System.out.print(" ");
				j = j + 1;
			}
			
			
			int i =1;
			while(i<=nst) {
				System.out.print("*");
				i = i + 1;
			}
			
			
			
			
			
			
			
			if(row<5) {
				nst++;
				space--;
				
				
			}else {
				nst--;
				space++;
			}
			
			
			
			row++;
			System.out.println();
		}

	}

}
