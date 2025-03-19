package Lec511jan;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 1;
		int lnst = 1;
		int space = 7;

		int rnst = 1;

		while (row <= 5) {
			int i = 1;
			while (i <= lnst) {
				System.out.print("*" + " ");
				i = i + 1;
			}

			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j = j + 1;
			}

			
			int k = 1;
            if (row == 5) {
				k = 2;
			}
			while (k <= rnst) {
				System.out.print("*" + " ");
				k = k + 1;
			}

			space = space - 2;
			lnst++;
			rnst++;
			row++;
			System.out.println();
		}
	}

}
