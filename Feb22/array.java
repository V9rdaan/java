package Feb22;
import java.util.Scanner;

public class array {
	
	public static void reverse(int arr[],int s,int e) {
		int i = s;
		int j = e;
	
		while(i<=j) {
			int temp = arr[i];
		     arr[i] = arr[j];
			 arr[j] = temp;
			 i++;
			 j--;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		reverse(arr,s,e);
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		

		

	}

}
