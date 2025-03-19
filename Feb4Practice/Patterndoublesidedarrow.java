package Feb4Practice;

public class Patterndoublesidedarrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int lnst = 2;
		int rnst = 2;
		int fspace = 4;
		int space = 1;
		
		while(row<=7) {
			if(row==1 || row==7) {
				int l = 1;
				while(l<=6) {
					System.out.print(" " + " ");
					l++;
				}
			System.out.print("*" + " ");
				
			}
			else {
			int i  =1;
			while(i<=fspace) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			while(j<=lnst) {
				System.out.print("*" + " ");
				j++;
			}
			
			
			
			int k = 1;
			while(k<=space) {
				System.out.print("  " );
				k++;
			}
			
			int t = 1;
			while(t<=rnst) {
				System.out.print("* ");
				t++;
			}
			
			if(row<4) {
				fspace = fspace-2;
				space = space+2;
				lnst++;
				rnst++;
				
			}
			else {
				fspace = space+2;
				space = space - 2;
				lnst--;
				rnst--;
			}}
			
			row++;
			System.out.println();
			
		}

	}
}



