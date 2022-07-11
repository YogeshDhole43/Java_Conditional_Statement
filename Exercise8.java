package conditional_statement;
import java.util.Scanner;
public class Exercise8 {
	
	public void ex8()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n= sc.nextInt();
		int m = sc.nextInt();
		System.out.println("Addition is: "+(n+m));
		System.out.println("Substraction is: "+ (n-m));
		System.out.println("Multiplication is: "+(n*m));
		System.out.println("Division is: "+(n/m));
		System.out.println("Reminder is: "+(n%m));
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise8 i = new Exercise8();
		i.ex8();
		
	}

}
