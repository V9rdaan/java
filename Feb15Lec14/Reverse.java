package Feb15Lec14;

public class Reverse {
	
	public static void reverse(int arr []) {
		
		int n = arr.length;
		int  temp[] = new int[n];
		int index = 0;
		for(int i = arr.length-1;i>=0;i--) {
			temp[index] = arr[i];
			index++;
			}
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = temp[i];
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,7,5,9,45,3,7};
		 reverse(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		

	}

}
