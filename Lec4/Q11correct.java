package Lec4;

public class Q11correct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 1;
		int nst = 1;
		int space = 4;
		
		
		while(row<=5) {
			
			int j =1;
			while(j<=space) {
				System.out.print("  ");
				j = j + 1;
			}
			
			
			int i = 1;
			while(i<=nst) {
				if(i%2==0) {
					System.out.print(" " + " ");
				}else {
					
				
				System.out.print("*" + " ");
				
				}
				i = i + 1;
				
			}
			
		
			
			
			
			
			
			
			nst= nst + 2;
			space--;
			row++;
			System.out.println();
		}

	}

}


//replace the exclamation mark by space  and we will get question number 12
