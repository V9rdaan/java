package ASSINGMENT2;
import java.util.Scanner;

public class Q10GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner s = new Scanner(System.in);
			int divisor = s.nextInt();
			int dividend = s.nextInt();
			
			while(dividend%divisor !=0) {
				int rem = dividend%divisor;
				dividend = divisor;
				divisor = rem;
			}
			
			System.out.print(divisor);



	}

}
