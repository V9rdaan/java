package ASSINGMENT2;
import java.util.Scanner;

public class Q12ReplaceThemAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		int ans = 0;
		int placevalue = 1;
		
		if(number == 0) {
			System.out.print(5);
		}
		
		
		
		while(number!=0) {
			int lastdigit = number % 10;
			if(lastdigit == 0) {
				lastdigit = 5;
				ans =lastdigit * placevalue + ans;
				
				
				placevalue = placevalue * 10;
				
				
			}
			else {
           ans =  lastdigit * placevalue + ans;
				
				placevalue = placevalue * 10;  
				
			
				
			}
			number = number/10;
			
			
			
			
			
		}
		System.out.print(ans);
		
		
		
		

	}

}
