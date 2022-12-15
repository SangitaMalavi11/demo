package Assignment;

import java.util.Scanner;

public class RectangleLenBre8 {

	public static void main(String[] args) {
		double  length,briadth;
		
		
		Scanner sc= new Scanner(System.in);
		
		length=sc.nextInt();
		briadth=sc.nextInt();
		
		double area=length*briadth;
		double pre=2*(length+briadth);
		
		if(area>pre)
			System.out.println("Area of Rectangle is greter than ");
	}

}
