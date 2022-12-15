package DoWhileLoop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int i,n,f=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value:-");
		n= sc.nextInt();
		i=n;
		do
		while(i>=1)
		{
		    f=f*i;
		    i--;
		    System.out.println("factorial of"+n+"="+f);
		   
	}		while(i>=1);

}
}
