package Feb4Practice;

public class PatternRhombus {


		// TODO Auto-generated method stub
		
		
		   
		    	   
	
	    public static void main(String[] args) {
	        int row = 1;
	        int spaces = (n-1); // Leading spaces for centering
	        int nst = 1;    // Number of numbers to print in each row
	        int num = 1;

	        while (row <= 5) {
	            // Print spaces for alignment
	            int i = 1;
	            while (i <= spaces) {
	                System.out.print("  "); // Two spaces for perfect alignment
	                i++;
	            }

	            // Print numbers
	            int j = 1;
	            int count = num; // Correct initialization of count for symmetry
	            while (j <= nst) {
	                System.out.print(count + " ");
	                if (j < (nst / 2) + 1) { // Increase up to center
	                    num++;
	                } else { // Decrease after center
	                    num--;
	                }
	                j++;
	            }

	            // Correct pattern formation logic
	            if (row < 3) {  
	                nst += 2;  // Increase numbers in upper half
	                spaces--;
	                num++;// Reduce spaces for centering
	            } else { 
	                nst -= 2;  // Decrease numbers in lower half
	                spaces++;  // Increase spaces for centering
	                num--; // Fix: Correct reset of count for the lower half
	            }

	            row++;
	            System.out.println();
	        }
	    }
	}
