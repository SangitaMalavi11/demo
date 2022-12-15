package Assignment;

import java.util.Scanner;

public class PosiNegZer {

	public static void main(String[] args) {
		int num_limit=0,positive=0,negative=0,zero=0;
		int entered_number;
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the want:-");
		num_limit=a.nextInt();
		
		for(int i=1; i<=num_limit;i++);
		System.out.println("enter the value");
		entered_number=a.nextInt();
		 if(entered_number>0) {
			 positive=positive+1;
		 }
		 else if(entered_number<0) {
			 negative=negative+1;
		 }
		 else
			 zero=zero+1;
		 {
			 System.out.println("positive number"+positive);
			 System.out.println("Negative number"+negative);
			 System.out.println("zero"+zero);
		 
			 
			 
		 }
		
		
	}

}
