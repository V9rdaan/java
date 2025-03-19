package Lec612Jan;
import java.util.Scanner;

public class NcR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		int r = s.nextInt();
		
		int nFactorial = 1;
		int rFactorial = 1;
		int nminusrFactorial = 1;
		
		for(int i =1;i<=n;i++) {
			nFactorial = nFactorial * i;
		}
		
		for(int i =1;i<=r;i++) {
			rFactorial = rFactorial*i;
		}
		
		for(int i =1; i<(n-r);i++) {
			nminusrFactorial  = nminusrFactorial*i;
		}
		
		int ncr = nFactorial / (nminusrFactorial * rFactorial);
		System.out.print(ncr);
		
		

	}

}
