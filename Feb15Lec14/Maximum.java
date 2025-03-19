package Feb15Lec14;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = { 2,4,9,2,6,-2,7};
		
		int abhitkmaximum = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>abhitkmaximum) {
				abhitkmaximum = arr[i];
			}
			
		}
		System.out.print(abhitkmaximum);

	}

}
