package Feb4Practice;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int count = 0;
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				count++;
			}
			
		}if(count==2) {
				System.out.print("Prime");
				
			}else {
				System.out.print("Not Prime");
			}
		
		
		

	}

}
