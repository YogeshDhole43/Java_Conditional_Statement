package conditional_statement;
import java.util.Scanner;

public class Exercise10 {

	public void ex10()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a Number 0 or 1");
		int n=sc.nextInt();
		
		
	if (n==1)
	{
		System.out.println("Please enter marks of student");
		int o = sc.nextInt();
	
	
		
		if (o>=90)
		{
			System.out.println("This is good");
		}
		else if((89>=o)&&(o>=60))
		{
			System.out.println("This is also good");
		}
		else if((59>=o)&&(o>=0))
		{
			System.out.println("This is good as well");
		}
	}
		
	else
	{
		System.out.println("To get marks please enter 1");
	}
	
	sc.close();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise10 i = new Exercise10();
		i.ex10();
		
	}

}
