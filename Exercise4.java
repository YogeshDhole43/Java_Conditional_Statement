package conditional_statement;

import java.util.Scanner;

public class Exercise4 {
	
	//A school has following rules for grading system:
	//a. Below 25 - F
	//b. 25 to 45 - E
	//c. 45 to 50 - D
	//d. 50 to 60 - C
	//e. 60 to 80 - B
	//f. Above 80 - A
	//Ask user to enter marks and print the corresponding grade.

	
	public void ex4()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your grades");
		
		int a = sc.nextInt();
		
		
		if (a<25)
		{
			System.out.println("F");			
		}
		
		else if ((25<=a)&&(45>=a))
		{
			System.out.println("E");
		}
		
		else if ((45<a)&&(50>=a))
		{
			System.out.println("D");
		}
		
		else if((50<a)&&(60>=a))
		{
			System.out.println("C");
		}
		
		else if ((60<a)&&(80>=a))
		{
			System.out.println("B");
		}
		
		else if ((a>80)&&(a<=100))
		{
			System.out.println("A");
		}
		
		else
		{
			System.out.println("Please enter value from 0 to 100");
		}
		
		sc.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exercise4 i = new Exercise4();
		
		i.ex4();
		
	}
	

}
