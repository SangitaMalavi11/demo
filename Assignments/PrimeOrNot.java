package Assignment;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int num;
		Scanner a =new Scanner(System.in);
		
		System.out.println("Enter any number:-");
		num = a.nextInt();
		
		boolean isPrime=true;
		if(num>-1) {
			for(int i=2;  i*i<num; i++)
			{
				if(num%2==0)
				{
					isPrime=false;
					
				}
			}
		}
	}

}
