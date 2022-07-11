package conditional_statement;

import java.util.Scanner;
import loops.Exercise5;
public class Exercise7 {
	
	//A student will not be allowed to sit in exam if his/her attendance is less than 75%.
	//Take following input from user
	//Number of classes held
	//Number of classes attended.
	//Add medical causes leaves along side of attended classes. 
	//And print
	//percentage of class attended
	//Is student is allowed to sit in exam or not.

	public void ex7()
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter number of classes held");
		int a = sc.nextInt();
		
		System.out.println("Enter number of classes attended");
		int b = sc.nextInt();
		
		System.out.println("Enter number of medical leaves");
		int c = sc.nextInt();
		
		System.out.println("Percentage of class attended: " + (b+c>=a*0.75));
		
		if (b+c>=a*0.75)
		{
			System.out.println("You are allowed to sit in exam");
		}
		
		else
		{
			System.out.println("You are NOT allowed to sit in exam");
		}
		
		sc.close();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Exercise7 i = new Exercise7();
		
            //i.ex7();
		
		Exercise5 d = new Exercise5();
		d.ex5();

	}

}
