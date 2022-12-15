package Assignment;

import java.util.Scanner;

public class CostSellingPrice {

	public static void main(String[] args) {
		int c,s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of cost prise");
		c=sc.nextInt();
		
		System.out.println("enter the value of silling price");
		s=sc.nextInt();
		
		if (c<s)
			System.out.println("proffit"+(s-c));
		else if(s<c)
			System.out.println("loss"+(c-s));
		else 
			System.out.println("Break even point ie No profit No loss");
		
	}

}
