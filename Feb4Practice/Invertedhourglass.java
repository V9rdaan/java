package Feb4Practice;

public class Invertedhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lnst =1;
		int row = 1;
		int rnst= 1;
		int space = 9;
		int rowval = 5;
		
		while(row<=11) {
			
			int j = 1;
			while(j<=lnst) {
				System.out.print("*" + " ");
				j++;
			}
			 
	            
			
			int i =1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			
			}
			int k = 1;
			while(k<=rnst) {
				System.out.print("*" + " ") ;
				k++;
			}
			
			int l = 1;
			if(row==) {
				l = 2;
			}
			
			 
			
			
			if(row<=5) {
				lnst++;
				rnst++;
				space = space - 2;
				
			}else {
				lnst--;
				rnst--;
				space = space + 2;
			}
			row++;
			System.out.println();
			
			
			
		}

	}

}
