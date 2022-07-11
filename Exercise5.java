package conditional_statement;

import java.util.Scanner;

public class Exercise5 {
	
	//Take input of age of 3 people by user and determine oldest and youngest among them.

	
	public void ex5()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of first persons");
		int a = sc.nextInt();
		
		System.out.println("Enter age of second person");
		int b = sc.nextInt();
		
		System.out.println("Enter age of third person");
		int c = sc.nextInt();
		
		if (a>b && a>c)
		{
			System.out.println("First person is oldest");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("Second person is oldest");
		}
		
		else if (c>a && b>c)
		{
			System.out.println("Third person is oldest");
		}
		
		else
		{
			System.out.println("All three persons have same age ");
		}
		
		if (a<b && a<c)
		{
			System.out.println("First person is youngest");
		}
		
		else if (b<a && b<c)
		{
			System.out.println("Second person is youngest");
		}
		
		else if(c<a && c<b)
		{
			System.out.println("Third person is youngest");
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise5 i = new Exercise5 ();
		
		i.ex5();
		
	}

}
