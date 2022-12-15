package Iteration;

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Rang :-");
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			int c=2*i-1;
			if(i==n)
				System.out.print(c);
			else
				System.out.print(c+"+");
			    sum = sum+c;
			
		}
		System.out.print("\n\n\nSum of odd numbers "+sum);
		
	}
}


