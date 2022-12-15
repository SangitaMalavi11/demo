package DoWhileLoop;

import java.util.Scanner;

public class SumOfSquaresNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rang:-");
		n=sc.nextInt();
		i=1;
		do
		 {
			int c=i*i;
		    if(i==n)
		    	System.out.print(c);
		    else
		    	System.out.print(i*i+"+");
		    sum=sum+c;
		    i++;
		    }while(i<=n);
	      System.out.print("\nSum of Squares Number"+sum);
	
}
	}


