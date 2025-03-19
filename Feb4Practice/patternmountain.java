package Feb4Practice;

import java.util.Scanner;

public class patternmountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		    
		
		
		        int row = 1;
		        int lnst = 1; 
		        int rnst = 1; 
		        int spaces = n+1; 

		        while (row <= n) {
		            
		            int i = 1;
		            int cnt = 1;
		            while (i <= lnst) {
		                System.out.print(cnt + " ");
		                cnt++;
		                i++;
		            }

		          
		            int j = 1;
		            while (j <= spaces) {
		                System.out.print("  "); 
		                j++;
		            }

		           
		            int k = 1;
		            int count = row; 
		            if (row == n) { 
		                count--; 
		                k = n-2;   // Skip first number in last row
		            }
		            
		            while (k <= rnst) {
		                System.out.print(count + " ");
		                count--;
		                k++;
		            }

		            
		            lnst++;       
		            spaces = spaces-2;  
		            rnst++;       
		            row++;
		            System.out.println(); 
		        }
		    }
		}
