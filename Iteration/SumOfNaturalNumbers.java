package Iteration;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:-");
		n= sc.nextInt();
		
		for(i=1;i<=n;i++) {
			if(i==n)
				System.out.print(i);
			else
				System.out.print(i+"+");
		    sum=sum+i;
	}
	        System.out.print("\n\nsum of natural number"+sum);
	}

}
