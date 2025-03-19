package Feb15Lec14;

import java.util.Scanner;

public class NumberpresentORno {
	
	public static boolean target(int arr[],int target) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == target) {
				return true;
				
			}
			
			
			
			
		}
		return false;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		
		int arr [] = {1,2,5,34,7,4,7};
		int target = 3;
		
		
		System.out.print(target(arr,target));

	}

}
