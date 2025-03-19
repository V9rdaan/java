package Feb15Lec14;

public class MaximumvalueusingFunction {
	public static int maxElement(int arr[]) {
		
		int ans = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>ans) {
				ans = arr[i];
			}
			
			
		}
		return(ans);
		
	}
	

	public static void main(String[] args) {
		
		
			
			int arr[] = {1,2,3,2,42,5,3};
			int maxElement  = maxElement(arr);
			System.out.print(maxElement);
			
			
		
		
		

	}

}
