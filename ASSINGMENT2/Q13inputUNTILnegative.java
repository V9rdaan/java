package ASSINGMENT2;

import java.util.Scanner;

public class Q13inputUNTILnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner scanner = new Scanner(System.in);
	        int cumulativeSum = 0;
	      int n = 0;

	       
	        int count = scanner.nextInt();  

	     
	        for (int i = 0; i < count; i++) {
	           
	            n = scanner.nextInt(); 

	            cumulativeSum += n;  

	            
	            
	}
	     for(int i = 0;i < count;i++) { 
	    	 if( cumulativeSum > 0){
	    	
     	      System.out.print(cumulativeSum);
	    	 }
	    	 else{
		        	break;
               
	        }
	        
	        
	        	
	        }
	     
	            
	        
	            
	        }
	}
	


