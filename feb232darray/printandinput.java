package feb232darray;

import java.util.Scanner;

public class printandinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] [] arr = new int[3][4];
		
		Scanner s = new Scanner(System.in);
		
		System.out.print(arr.length);
		System.out.print(arr[0].length);
		
		for(int i = 0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				arr[i][j] = s.nextInt();
				
			}
			System.out.println();
			
		}
		
		//rows loop
		for(int i = 0;i<3;i++) {
	    //column loop
			for(int j = 0;j<4;j++) {
				System.out.print(arr[i][j]  + " ");
			}
			
			System.out.println();
		}
 
	}

}
