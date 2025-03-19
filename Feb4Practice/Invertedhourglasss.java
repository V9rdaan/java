package Feb4Practice;

public class Invertedhourglasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		        int row = 1;
		        int space = 0;
		        int star = 11; // Total numbers in the first row
		        int rowVal = 5;

		        while (row <= 11) {
		            // Print left numbers
		            int i = 5;
		            for (int j = 1; j <= rowVal; j++) {
		                System.out.print(i-- + " ");
		            }

		            // Print spaces
		            for (int j = 1; j <= space; j++) {
		                System.out.print("  "); // Two spaces for alignment
		            }

		            // Print right numbers (avoid repeating the middle number)
		            int k = (rowVal == 5) ? 1 : rowVal + 1;
		            for (int j = 1; j <= rowVal; j++) {
		                System.out.print(k++ + " ");
		            }

		            System.out.println();

		            // Adjust space and rowVal for next row
		            if (row < 6) {
		                space += 4;  // Increase spaces for upper half
		                rowVal--;    // Decrease numbers printed
		            } else {
		                space -= 4;  // Decrease spaces for lower half
		                rowVal++;    // Increase numbers printed
		            }

		            row++;
		        }
		    }
		}

		
		
		    
		  		       
		   
		
