package MARCH15;

import java.util.Scanner;



public class Palonestring {
	public static boolean isPalindromic(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			char ch1=str.charAt(i);
			char ch2=str.charAt(j);
		if (ch1!=ch2) {
			return false;
		}else {
			i++;
			j--;
		}
		}
		return true;
		
	}

	public static void substrings(String str) {
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length();j++) {
				if(isPalindromic(str.substring(i,j+1))){
				System.out.println("cut is from("+i+" "+j+")");
				System.out.println(str.substring(i,j+1));
			  }
		   }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String str="abba";
	   substrings(str);
	}
	}

