package Lec718Jan;
import java.util.Scanner;

public class replacedigitwithanotherdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		
		int placevalue = 1;
		int ans = 0;
		
		while(n>0) {
			int firstdigit = n %10;
			
			
			if(firstdigit == 0) {
				firstdigit = 9;
			}
			ans  = placevalue * firstdigit + ans;
			placevalue = placevalue * 10;
			
			n = n/10;
			
		}System.out.print(ans);
		
		

	}

}
