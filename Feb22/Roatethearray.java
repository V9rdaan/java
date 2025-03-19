package Feb22;
import java.util.Scanner;

public class Roatethearray {
	
	public static void reverse(int arr[],int n,int e) {
		int i = n;
		int j = e;
		while(i<=j) {
		
		int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
		 i++;78
		 j--;}
		}
		 
		 public static void rotate(int nums[],int k) {
		 reverse(nums,0,nums.length-1);
		 reverse(nums,0,k-1);
		 reverse(nums,k,nums.length-1);
		 
		 
		 
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int n = s.nextInt();
		int e = s.nextInt();
		
		int nums[] = {1,2,3,4,5,6,7};
		
		
		rotate(nums,k);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}

	}

}
