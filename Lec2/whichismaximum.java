package Lec2;
import java.util.Scanner;

public class whichismaximum {
	

	 public static void main( String [] args) {
		 Scanner num1 = new Scanner(System.in);
			
			
			int a = num1.nextInt();
			int b = num1.nextInt();
			
			if(a>b) {
				System.out.println(a + " is maximum");
			}else {
				System.out.println(b + " is maximum");
			}
	 }


}
