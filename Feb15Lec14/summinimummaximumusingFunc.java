package Feb15Lec14;

public class summinimummaximumusingFunc {
	
	public static int [] multiple(int arr[]) {
		int sum =arr[0];

		int abhitkmin = arr[0];
		
		int abhitkmax = arr[0];
		
	
	for(int i = 1;i<arr.length;i++) {
		
	     sum = sum + arr[i];
				
		if(arr[i]<abhitkmin) {
			abhitkmin = arr[i];
		}
		
		if(arr[i]>abhitkmax) {
			abhitkmax= arr[i];
		}
		
	}
	
	
	
	
	
		
	int ans[] = new int[3];
	ans[0] = sum;
	ans[1] = abhitkmin;
	ans[2] = abhitkmax;
	return ans;
		
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[]  = {2,1,2,4,2,65,74,9,6};	
		
		
		int []ans = multiple(arr);
		for(int i = 0 ;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
		
		
		

	}

}
