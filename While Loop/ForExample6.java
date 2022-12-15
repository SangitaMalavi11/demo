package WhileLoop;

import java.util.Scanner;

public class ForExample6 {

	public static void main(String[] args) {
		int i,n;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the rang:-");
		n=a.nextInt();
		i=1;
		while( i<=n) {
		System.out.print(i*i*i+" ");
		i++;
		}
	}

}
