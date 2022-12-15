package DoWhileLoop;

import java.util.Scanner;

public class ForExample5 {

	public static void main(String[] args) {
		int i,n;
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the rang:-");
		n=a.nextInt();
		i=1;
		do
		
		{
			System.out.print(2*i+" ");
			i++;
	     }
		while(i<=n);
	}

}
