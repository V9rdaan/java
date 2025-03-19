package Feb15Lec14;

public class ReversearrayAnotherway {



	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6};
		reverse2(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		// TODO Auto-generated method stub
	public static void reverse2(int arr[]) {	
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		
		}

	}

}
