package DoWhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:-");
		n= sc.nextInt();
		i=1;
		do
		 {
			if(i==n)
				System.out.print(i);
			else
				System.out.print(i+"+");
		    sum=sum+i;
		    i++;
	}
		while(i<=n);
	        System.out.print("\n\nsum of natural number"+sum);
	}


	}


