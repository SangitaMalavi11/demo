package DoWhileLoop;

import java.util.Scanner;

public class ForExample4 {

	public static void main(String[] args) {
		int i,n;
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the range:-");
		n=a.nextInt();
		i=1;
		do
		{
		System.out.print(i+" ");
		i++;
		}
		while( i<=n );
	}

}
