package Selection;

import java.util.Scanner;

public class InuteCharType {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any charater");
		char c=sc.next().charAt(0);
		
		if (c>='A' && c<='Z')
			System.out.println(c+ "is an upper case letter ");
		
		else if(c>='a' && c<'z')
			System.out.println(c+ "is an lower case letter");
		else if(c>='0' && c<'9')
			System.out.println(c+ "is digit");
		else
			System.out.println(c+"is a special Symbol");
		
		
	}

}
