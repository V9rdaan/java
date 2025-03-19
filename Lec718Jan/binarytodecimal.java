package Lec718Jan;

public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int  n = 1000010;
		int ans = 0;
		int placevalue = 1;
		while(n>0) {
			int rem = n%10;
			ans = ans + rem * placevalue;
			placevalue = placevalue * 2;
			n = n/10;
			
		}System.out.print(ans);
 

	}

}
