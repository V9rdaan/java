package Lec2;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		if (a % 2 == 0) {
			System.out.println(a + " is even");
		} else {
			System.out.println(a + " is odd");
		}

	}

}
