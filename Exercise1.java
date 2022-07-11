package conditional_statement;

import java.util.*;

public class Exercise1 {
	
	//Take values of length and breadth of a rectangle from user and check if it is square or not.
	
	public void ex1() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter length");
		int length = sc.nextInt();
		
		System.out.println("Enter breadth");
		int breadth = sc.nextInt();
		
		if (length==breadth)
		{
			System.out.println("It is a square");
			
		}
		
		else
		{
			System.out.println("It is a reactangle");
		}
		
		sc.close();
		
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exercise1 d = new Exercise1 ();
		
		d.ex1();
	}

}
