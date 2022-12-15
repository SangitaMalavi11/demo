package WhileLoop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int i,num;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		num=a.nextInt();   
		i=2;
		while(i<num) {
			if(num%i==0) 
				System.out.println(num+" it is not prime number");
			i++;
			break;
		      
			}
	
		      
		if(i==num)
			    System.out.println(num+" it is prime number");
		
          }
		}
	


	


