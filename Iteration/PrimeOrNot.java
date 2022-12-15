package Iteration;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int i,num;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		num=a.nextInt();
		for(i=2;i<num;i++) 
			if(num%i==0) {
				System.out.println(num+" it is not prime number");
		         break;
	
		      }
		if(i==num)
			    System.out.println(num+" it is prime number");
          }
		}
	


	


