package Feb15Lec14;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,-1,4,-10,5,6};
		
		int abhitkminimum = arr[0];
		for (int i  = 1;i<arr.length;i++) {
			
			if (arr[i] < abhitkminimum) {
				abhitkminimum = arr[i];
			}
			
			
			
		}
		System.out.print(abhitkminimum);
		
		
		int abhitkminimum = Integer.MAX_VALUE;
		for (int i  = 1;i<arr.length;i++) {
			
			if (arr[i] < abhitkminimum) {
				abhitkminimum = arr[i];
			}
			
			
			
		}
		System.out.print(abhitkminimum);


	}

}

//Another way is to add an imaginary value whickh will be maximum 
