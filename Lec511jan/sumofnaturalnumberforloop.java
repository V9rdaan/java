package Lec511jan;
import java.util.Scanner;

public class sumofnaturalnumberforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sum = 0;
		
	
				
		for(int i =1;i<=n;i++)	{
			
			sum = sum + i;
			
		}
		System.out.println(sum);
				

	}

}
