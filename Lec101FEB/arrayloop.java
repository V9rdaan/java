package Lec101FEB;

import java.util.Scanner;

public class arrayloop {
	
	public static void Input (int [] arr) {
		
		Scanner s = new Scanner(System.in);
		for(int i =0;i<5;i++) {
			arr[i] = s.nextInt();
		}
	}
	public static void print(int arr[]) {
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int [] arr = new int[5];
		Input(arr);
		print(arr);
		
		
	}

}
