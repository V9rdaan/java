package Feb4Practice;
import java.util.Scanner;

public class hiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

	

				// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
				int row=1;
				int rstar=n-1;
				int lstar=n-1;
				int space=n;
				
				while(row<=5) {
					
				
				if(row==1 || row==5) {
					int i=1;
					while(i<=n) {
						System.out.print("*" + " ");
						i++;
					}
				}
					else{
						int j=1;
						while(j<=lstar) {
							System.out.print("*" + " ");
							j++;
						}
						int k=1;
						while(k<=space) {
							System.out.print("  ");
							k++;
						}
						int m=1;
						while(m<=rstar) {
							System.out.print("*" + " " );
							m++;
						}
						if(row<3) {
							lstar--;
							rstar--;
							space = space+ 2;
						}else {
							lstar++;
							rstar++;
							space = space - 2;
						}}
						row++;
							System.out.println();		
							
				}


	}

}
