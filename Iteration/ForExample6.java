package Iteration;

import java.util.Scanner;

public class ForExample6 {

	public static void main(String[] args) {
		int i,n;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the rang:-");
		n=a.nextInt();
		
		for(i=1; i<=n; i++)
		System.out.print(i*i*i+" ");
	}

}
