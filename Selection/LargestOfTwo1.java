package Selection;

import java.util.Scanner;

public class LargestOfTwo1 {

	public static void main(String[] args) {
		
		int n1,n2;
		Scanner in =new Scanner(System.in);
		
		System.out.println("Enter any two numbers : -");
		n1=in.nextInt();
		n2=in.nextInt();
		
		if(n1>n2)
			System.out.println(n1+"is the largest number");
		
		if(n2>n1)
			System.out.println(n2+"is the largest number");
		}

}
