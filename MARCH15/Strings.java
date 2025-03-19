package MARCH15;

import java.util.Scanner;

public class Strings {
	
	public static boolean isPal(String str) {

		String str1 = " ";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			str1= str1 + ch;
		}
		if(str1.equals(str)) {
			return true;
		}
		else {return false;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(isPal(str));

		

	}

}
