package Assignment;

import java.util.Scanner;

public class FactorialValue {

	public static void main(String[] args) {
		
		int i,n,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		
		n=sc.nextInt();
		
		for(i=1; i<n; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+fact);
		
	}

}
