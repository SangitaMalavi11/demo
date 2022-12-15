package Assignment;

import java.util.Scanner;

public class CelsiusFahrenheit2 {

	public static void main(String[] args) {
		float Farrenheit=0,Celsius=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temp in Farrenheit:- ");
		
		Farrenheit=sc.nextFloat();
		
		if(Farrenheit>=0)
		{
			System.out.println(" ");
			Celsius=(Farrenheit-32)*5/9;
			Farrenheit=((-1)*Farrenheit);
			System.out.println("temp in celsius"+Celsius);
		}
		else {
			System.out.println("  ");
			Celsius=(Farrenheit-32)*5/9;
			Celsius=((-1)*Celsius);
			System.out.println("cel of"+Celsius);
			
		}
		
	}

}
