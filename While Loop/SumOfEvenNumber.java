package WhileLoop;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rang:-");
		n=sc.nextInt();
		i=1;
		while(i<=n) {
			int c=2*i;
	        if(i==n)
				System.out.print(c);
			else
				System.out.print(c+"+");
	        sum=sum+c;
	        i++;
		    }
		    System.out.print("\nSum Of even numbers="+sum);
		   
	   }

     }
