package Lec612Jan;
import java.util.Scanner;

public class Multiplicationofnaturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int mul = 1;
		
		for(int i=1;i<=n;i++) {
			mul = mul * i;
		}
		
		System.out.print(mul);
		
		
		

	}

}
