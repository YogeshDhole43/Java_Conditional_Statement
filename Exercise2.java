package conditional_statement;

import java.util.Scanner;
public class Exercise2 {
	
	//Take two int values from user and print greatest among them.


	public void ex2()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first value");	
		int a = sc.nextInt();
		
		System.out.println("Enter second value");
		int b = sc.nextInt();	
		
		if (a>b)
		{
			System.out.println("First value is greater");
		}
		
		else
		{
			System.out.println("Second value is greater");
			
		}
		
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise2 d = new Exercise2 ();
		
		d.ex2();
		
	}

}
