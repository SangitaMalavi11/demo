package Iteration;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rang:-");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			int c=2*i;
	        if(i==n)
				System.out.print(c);
			else
				System.out.print(c+"+");
	        sum=sum+c;
		    }
		    System.out.print("\nSum Of even numbers="+sum);
		
	   }

     }
