package Feb4Practice;

import java.util.Scanner;

public class Patternmagic {

	

	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        s.close(); // Close scanner to avoid resource leak

	        int row = 1;
	        int spaces = 1;
	        int lnst = (n - 1) / 2;
	        int rnst = (n - 1) / 2;

	        while (row <= n) {
	            if (row == 1 || row == n) {
	                int t = 1;
	                while (t <= n) { // Fix: Ensures correct top and bottom row width
	                    System.out.print("*");
	                    t++;
	                }
	            } else {
	                int j = 1;
	                while (j <= lnst) { // Left stars
	                    System.out.print("*");
	                    j++;
	                }

	                int k = 1;
	                while (k <= spaces) { // Hollow space
	                    System.out.print(" ");
	                    k++;
	                }

	                int l = 1;
	                while (l <= rnst) { // Right stars
	                    System.out.print("*");
	                    l++;
	                }

	                if (row < n / 2 + 1) { // Fix: Handles even & odd correctly
	                    lnst--;
	                    rnst--;
	                    spaces += 2;
	                } else {
	                    lnst++;
	                    rnst++;
	                    spaces -= 2;
	                }
	            }
	            row++;
	            System.out.println();
	        }
	    }
	}
