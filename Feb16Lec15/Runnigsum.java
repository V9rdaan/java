package Feb16Lec15;

public class Runnigsum {
	public static int[] runningsum(int arr []) {
		Scanner s = new Scanner(System.in);
		int arr[i] = s.nextInt();
		
		for(int i = 0;i<arr.length;i++) {
			int sum = 0;
			for(int j =0;j<i;j++) {
			
			sum = sum + arr[i];
			}
			ans[i] = sum;
		}
		return ans;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4};
		int nums = runningsum(arr);
		System.out.print(nums);
		

	}

}
