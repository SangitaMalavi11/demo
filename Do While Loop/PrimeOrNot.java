package DoWhileLoop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int i,num;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the Number:-");
		num=a.nextInt();   
		i=2;
		do
		 {
			if(num%i==0) 
				System.out.println(num+" it is not prime number");
			 System.out.println(num+" it is prime number");
			i++;
			break;
			
	}
		while(i<num);
 }
}
