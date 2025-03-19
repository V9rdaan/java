package Feb4Practice;

import java.util.Scanner;

public class Patternhourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		        int N, row=1, space=0, b, nst;

		        Scanner sc=new Scanner (System.in);
		        N=sc.nextInt();
		        b=N;
		        N=nst=(N*2)+1;

		        while(row<=N){

		            int i=1;

		            while(i<=space){
		                System.out.print("  ");
		                i+=1;
		            }
		            i=1;
		            int a=b;
		            while(i<=nst){
		                System.out.print(a+" ");

		                if(i<(nst+1)/2)
		                    a-=1;
		                else
		                    a+=1;
		                i+=1;
		            }

		            if(row<(N+1)/2){
		                nst-=2;
		                space+=1;
		                b-=1;
		            }
		            else{
		                nst+=2;
		                space-=1;
		                b+=1;
		            }
		            row+=1;
		            System.out.println();

		        }
		    }
		}