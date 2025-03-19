package Feb9Lec13;
import java.util.Scanner;

public class addingarray {
	public static void print(int arr[]) {
		Scanner s = new Scanner(System.in);
		int n = arr.length;
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
			
		}
		
	}
	//public static void ans(int arr[]) {
	//	int n  = arr.length;
	//	for(int i  =0;i<n;i++) {
	//		System.out.print(arr[i]);
	//	}
	//}
	
	public static int input(int arr[]) {
		int sum = 0;
		int n = arr.length;
		for(int i  = 0 ; i<n;i++) {
			sum = sum + arr[i];
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int arr[] = new int[n];
		print(arr);
		int sum = input(arr);
		System.out.print(sum);
		
		
		
		
		

	}

}
