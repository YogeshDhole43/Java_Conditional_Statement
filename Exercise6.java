package conditional_statement;

import java.util.Scanner;

public class Exercise6 {
	
	//Write a program to print absolute value of a number entered by user. E.g.-
	//INPUT: 1 OUTPUT: 1
	//INPUT: -1 OUTPUT: 1
	
	public void ex6()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int a = sc.nextInt();
		
		if (a<0)
		{
			System.out.println("Absolute value is: "+(-1*a));
		}
		
		else
		{
			System.out.println("Absolute value is: "+a);
		}
		
		sc.close();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise6 i = new Exercise6();
		
		i.ex6();
			
		
		
	}

}
