package DoWhileLoop;

import java.util.Scanner;

public class PrimeOrNorEx {

	public static void main(String[] args) {
		int i ,num;
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter any Number:-");
		num=a.nextInt();
		i=2;
		do {
		if(num%i==0) 
				System.out.println(num+"Is not a prime number");
				System.out.println(num+"Is a prime Number");
				 i++;
			    break;
	}
		while( i<num); 
		

						}
		}

