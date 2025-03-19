package feb232darray;

import java.util.Scanner;

public class zigzag2DARRAYQS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		int[][] arr = new int[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < b; j++) {
					System.out.println(arr[i][j]);
				}
			} else {
				for (int j = arr[0].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j]);
				}
			}

		}

//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < b; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}

	}

}
