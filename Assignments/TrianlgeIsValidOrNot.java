package Assignment;

import java.util.Scanner;

public class TrianlgeIsValidOrNot {

	public static void main(String[] args) {
		int a,b,c,sum;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any three value of triangle");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
	sum=a+b+c;
	if(sum ==180)
		System.out.println(sum+"triangle is valid");
	else
		System.out.println(sum+"Triangle is not valid");
	}

}
