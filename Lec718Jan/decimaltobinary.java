package Lec718Jan;
import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int  n = 1000010;
		int ans = 0;
		int placevalue = 1;
		while(n>0) {
			int rem = n%2;
			ans = ans + rem * placevalue;
			placevalue = placevalue * 10;
			n = n/2;
			
		}System.out.print(ans);

	}

}
