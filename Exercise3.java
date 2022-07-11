package conditional_statement;

import java.util.Scanner;

public class Exercise3 {
	
	//A company decided to give bonus of 5% to employee if his/her year of service is more than 5
	//years.
	//Ask user for their salary and year of service and print the net bonus amount.
	
	
	public void ex3()
	{
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your servise in year");		
		int a = sc.nextInt();
		 
		System.out.println("Enter your salary in numbers");
		int b = sc.nextInt();
		
		if (a>5)
		{
			System.out.println("You will get a 5% bonus " + "Your Total Salary is = " +((b*0.05) + b));
		}
		else
		{
			System.out.println("You are not eligible for bonus");
		}
		
		sc.close();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercise3 d = new Exercise3();
		
		d.ex3();

	}

}
